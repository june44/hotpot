package cn.hotpot.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * VipLevel entity. @author MyEclipse Persistence Tools
 */

public class VipLevel implements java.io.Serializable {

	// Fields

	private Integer levelId;
	private String levelName;
	private Integer levelAgio;
	private Set vips = new HashSet(0);

	// Constructors

	/** default constructor */
	public VipLevel() {
	}

	/** full constructor */
	public VipLevel(String levelName, Integer levelAgio, Set vips) {
		this.levelName = levelName;
		this.levelAgio = levelAgio;
		this.vips = vips;
	}

	// Property accessors

	public Integer getLevelId() {
		return this.levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	public String getLevelName() {
		return this.levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public Integer getLevelAgio() {
		return this.levelAgio;
	}

	public void setLevelAgio(Integer levelAgio) {
		this.levelAgio = levelAgio;
	}

	public Set getVips() {
		return this.vips;
	}

	public void setVips(Set vips) {
		this.vips = vips;
	}

}