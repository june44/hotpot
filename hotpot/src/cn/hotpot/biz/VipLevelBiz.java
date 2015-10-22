package cn.hotpot.biz;

import java.util.List;

import cn.hotpot.domain.VipLevel;

public interface VipLevelBiz  extends BaseBiz{
	public List<VipLevel> list(String hql, int vipLevelId);
}
