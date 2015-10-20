package cn.hotpot.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer department;
	private Power power;
	private String deptName;
	private Set employees = new HashSet(0);
	private Set applyBuies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	public Department(Power power, String deptName, Set employees,
			Set applyBuies) {
		this.power = power;
		this.deptName = deptName;
		this.employees = employees;
		this.applyBuies = applyBuies;
	}

	// Property accessors

	public Integer getDepartment() {
		return this.department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	public Power getPower() {
		return this.power;
	}

	public void setPower(Power power) {
		this.power = power;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

	public Set getApplyBuies() {
		return this.applyBuies;
	}

	public void setApplyBuies(Set applyBuies) {
		this.applyBuies = applyBuies;
	}

}