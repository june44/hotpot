package cn.hotpot.dao;

import java.util.List;

import cn.hotpot.domain.VipLevel;

public interface VipLevelDao extends BaseDao<VipLevel, Long> {
	public List<VipLevel> list(String hql, int vipLevelId);
}
