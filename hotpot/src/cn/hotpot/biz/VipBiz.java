package cn.hotpot.biz;

import java.util.List;

import cn.hotpot.domain.Vip;

public interface VipBiz extends BaseBiz {
	public void save(Vip[] vip, String sql) throws Exception;

	public void list(String sql, Object[] inParams, Object[] outParams,
			List<Object> resultOut);
}
