package cn.hotpot.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import oracle.jdbc.OracleTypes;
import cn.hotpot.biz.VipBiz;
import cn.hotpot.biz.VipLevelBiz;
import cn.hotpot.domain.Vip;
import cn.hotpot.domain.VipLevel;

import com.alibaba.fastjson.JSON;

public class VipAction extends BaseAction {
	private Vip vip;
	private VipLevel vipLevel;
	private VipBiz vipBiz;
	private VipLevelBiz vipLevelBiz;


	public void setVipLevelBiz(VipLevelBiz vipLevelBiz) {
		this.vipLevelBiz = vipLevelBiz;
	}

	public void setVipLevel(VipLevel vipLevel) {
		this.vipLevel = vipLevel;
	}

	public void setVipBiz(VipBiz vipBiz) {
		this.vipBiz = vipBiz;
	}

	public Vip getVip() {
		return vip;
	}

	public void setVip(Vip vip) {
		this.vip = vip;
	}
   public String add(){
	   
	   VipLevel vipLevel = new VipLevel();
	   vipLevel.setLevelId(1);
	   vip.setVipLevel(vipLevel);
	   vip.setVipScore(0);
	   Vip[] vip1 = {vip};
	   String sql="";
	   System.out.println(vip.getVipIdcard()+":"+vip.getVipId()+":"+vip.getVipScore());
	   try {
		   vipBiz.save(vip1, sql);
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return null;
   }

   public String list()  {
	   
	  
	   String sql="{call Pager(?,?,?,?,?,?,?)}";
	   PrintWriter out = null;
	   
	try {
		out = response.getWriter();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		String pageSize = request.getParameter("rows");
		String currentPage = request.getParameter("page");

		 Object[] vip1 = {Integer.parseInt(currentPage),Integer.parseInt(pageSize),"Vip","",""};
		 Object[] vip2 = {OracleTypes.INTEGER,OracleTypes.CURSOR};
		
		 List<Vip> list = new ArrayList<Vip>();
			List<Object> resultOut = new ArrayList<Object>();
			HashMap<String, Object> map = new HashMap<String, Object>();
			ResultSet rs = null;
			String hql="from VipLevel where levelId =?";
			 vipBiz.list(sql, vip1, vip2, resultOut);
			 rs = (ResultSet) resultOut.get(1);
			 try {
				if(rs != null){
					
						while(rs.next()){
							Vip vip = new Vip();
							VipLevel vipl = new VipLevel();
							vip.setVipId(rs.getInt("VIP_ID"));
							vip.setVipName(rs.getString("VIP_NAME"));
							List<VipLevel> list2 = new ArrayList<VipLevel>(); 
							System.out.println(vipLevelBiz);
							list2 = vipLevelBiz.list(hql, rs.getInt("LEVEL_ID"));
							vipl = list2.get(0);
							vip.setVipLevel(vipl);
							vip.setVipScore(rs.getInt("VIP_SCORE"));
							list.add(vip);
						
				}
				map.put("total", (Integer)resultOut.get(0));
				map.put("rows", list);
				System.out.println(map);
				String jsonStr = JSON.toJSONString(map);
				System.out.println(jsonStr);
				out.write(jsonStr);
				out.flush();
				out.close();
				}
				} catch (Exception e) {
					e.printStackTrace();
				}
				return null;
   }


}
