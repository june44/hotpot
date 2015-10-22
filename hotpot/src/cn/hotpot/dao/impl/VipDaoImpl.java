package cn.hotpot.dao.impl;

import java.util.List;

import cn.hotpot.dao.VipDao;
import cn.hotpot.domain.Vip;

public class VipDaoImpl extends BaseDaoImpl<Vip, Long> implements VipDao {

	@Override
	public void open(Vip[] vip,String sql) {
		Vip vip1=vip[0];
		this.getHibernateTemplate().save(vip1);
	}
	
	public void list(String sql,Object[] inParams,Object[] outParams,List<Object> resultOut){
		
		this.callProcedure(sql, inParams, outParams, resultOut);
		
	}

	

}
