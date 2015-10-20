package cn.hotpot.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Vip entity. @author MyEclipse Persistence Tools
 */

public class Vip implements java.io.Serializable {

	// Fields

	private Integer vipId;
	private VipLevel vipLevel;
	private String vipPhone;
	private String vipIdcard;
	private String vipName;
	private Integer vipScore;
	private Set orderFs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Vip() {
	}

	/** full constructor */
	public Vip(VipLevel vipLevel, String vipPhone, String vipIdcard,
			String vipName, Integer vipScore, Set orderFs) {
		this.vipLevel = vipLevel;
		this.vipPhone = vipPhone;
		this.vipIdcard = vipIdcard;
		this.vipName = vipName;
		this.vipScore = vipScore;
		this.orderFs = orderFs;
	}

	// Property accessors

	public Integer getVipId() {
		return this.vipId;
	}

	public void setVipId(Integer vipId) {
		this.vipId = vipId;
	}

	public VipLevel getVipLevel() {
		return this.vipLevel;
	}

	public void setVipLevel(VipLevel vipLevel) {
		this.vipLevel = vipLevel;
	}

	public String getVipPhone() {
		return this.vipPhone;
	}

	public void setVipPhone(String vipPhone) {
		this.vipPhone = vipPhone;
	}

	public String getVipIdcard() {
		return this.vipIdcard;
	}

	public void setVipIdcard(String vipIdcard) {
		this.vipIdcard = vipIdcard;
	}

	public String getVipName() {
		return this.vipName;
	}

	public void setVipName(String vipName) {
		this.vipName = vipName;
	}

	public Integer getVipScore() {
		return this.vipScore;
	}

	public void setVipScore(Integer vipScore) {
		this.vipScore = vipScore;
	}

	public Set getOrderFs() {
		return this.orderFs;
	}

	public void setOrderFs(Set orderFs) {
		this.orderFs = orderFs;
	}

}