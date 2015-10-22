package cn.hotpot.dao.impl;

import java.util.List;

import cn.hotpot.dao.VipLevelDao;
import cn.hotpot.domain.VipLevel;

public class VipLevelDaoImpl extends BaseDaoImpl<VipLevel, Long> implements VipLevelDao{
public List<VipLevel> list(String hql,int vipLevelId){
	
	return find(hql, vipLevelId);
}
}
