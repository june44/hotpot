package cn.hotpot.biz.impl;

import java.util.List;

import cn.hotpot.biz.VipBiz;
import cn.hotpot.dao.VipDao;
import cn.hotpot.dao.impl.VipDaoImpl;
import cn.hotpot.domain.Vip;

public class VipBizImpl extends BaseBizImpl implements VipBiz {

	private VipDao vipdao;

	

	public void setVipdao(VipDao vipdao) {
		this.vipdao = vipdao;
	}
	public void save(Vip[] vip,String sql) throws Exception {
		vipdao.open(vip, sql);
	}
	
	public void list(String sql,Object[] inParams,Object[] outParams,List<Object> resultOut){
		vipdao.list(sql, inParams, outParams, resultOut);
	}
}
