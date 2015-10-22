package cn.hotpot.dao;

import java.util.List;

import org.hibernate.HibernateException;

import cn.hotpot.domain.Vip;

public interface VipDao extends BaseDao<Vip, Long> {
	public void open(Vip[] vip, String sql);

	public void list(String sql, Object[] inParams, Object[] outParams,
			List<Object> resultOut);
}
