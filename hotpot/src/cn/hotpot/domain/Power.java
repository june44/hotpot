package cn.hotpot.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Power entity. @author MyEclipse Persistence Tools
 */

public class Power implements java.io.Serializable {

	// Fields

	private Integer powerId;
	private String powerDesc;
	private String actionName;
	private Set departments = new HashSet(0);
	private Set positions = new HashSet(0);

	// Constructors

	/** default constructor */
	public Power() {
	}

	/** full constructor */
	public Power(String powerDesc, String actionName, Set departments,
			Set positions) {
		this.powerDesc = powerDesc;
		this.actionName = actionName;
		this.departments = departments;
		this.positions = positions;
	}

	// Property accessors

	public Integer getPowerId() {
		return this.powerId;
	}

	public void setPowerId(Integer powerId) {
		this.powerId = powerId;
	}

	public String getPowerDesc() {
		return this.powerDesc;
	}

	public void setPowerDesc(String powerDesc) {
		this.powerDesc = powerDesc;
	}

	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public Set getDepartments() {
		return this.departments;
	}

	public void setDepartments(Set departments) {
		this.departments = departments;
	}

	public Set getPositions() {
		return this.positions;
	}

	public void setPositions(Set positions) {
		this.positions = positions;
	}

}