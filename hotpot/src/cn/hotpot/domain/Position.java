package cn.hotpot.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Position entity. @author MyEclipse Persistence Tools
 */

public class Position implements java.io.Serializable {

	// Fields

	private Integer positionId;
	private Power power;
	private String positionName;
	private Set employees = new HashSet(0);

	// Constructors

	/** default constructor */
	public Position() {
	}

	/** full constructor */
	public Position(Power power, String positionName, Set employees) {
		this.power = power;
		this.positionName = positionName;
		this.employees = employees;
	}

	// Property accessors

	public Integer getPositionId() {
		return this.positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public Power getPower() {
		return this.power;
	}

	public void setPower(Power power) {
		this.power = power;
	}

	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

}