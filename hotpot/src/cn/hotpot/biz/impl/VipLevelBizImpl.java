package cn.hotpot.biz.impl;

import java.util.List;

import cn.hotpot.biz.VipLevelBiz;
import cn.hotpot.dao.VipLevelDao;
import cn.hotpot.domain.VipLevel;

public class VipLevelBizImpl extends BaseBizImpl implements VipLevelBiz {
	private VipLevelDao vip;
	public void setVip(VipLevelDao vip) {
		this.vip = vip;
	}
	public List<VipLevel> list(String hql, int vipLevelId){
		
	return vip.list(hql, vipLevelId);
	}
}
