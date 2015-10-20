package cn.hotpot.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * ApplyBuy entity. @author MyEclipse Persistence Tools
 */

public class ApplyBuy implements java.io.Serializable {

	// Fields

	private Integer applyBuyId;
	private Employee employeeByApplicant;
	private Status status;
	private Employee employeeByApprover;
	private Department department;
	private Timestamp applyDate;
	private Set applyBuyDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public ApplyBuy() {
	}

	/** full constructor */
	public ApplyBuy(Employee employeeByApplicant, Status status,
			Employee employeeByApprover, Department department,
			Timestamp applyDate, Set applyBuyDetails) {
		this.employeeByApplicant = employeeByApplicant;
		this.status = status;
		this.employeeByApprover = employeeByApprover;
		this.department = department;
		this.applyDate = applyDate;
		this.applyBuyDetails = applyBuyDetails;
	}

	// Property accessors

	public Integer getApplyBuyId() {
		return this.applyBuyId;
	}

	public void setApplyBuyId(Integer applyBuyId) {
		this.applyBuyId = applyBuyId;
	}

	public Employee getEmployeeByApplicant() {
		return this.employeeByApplicant;
	}

	public void setEmployeeByApplicant(Employee employeeByApplicant) {
		this.employeeByApplicant = employeeByApplicant;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Employee getEmployeeByApprover() {
		return this.employeeByApprover;
	}

	public void setEmployeeByApprover(Employee employeeByApprover) {
		this.employeeByApprover = employeeByApprover;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Timestamp getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(Timestamp applyDate) {
		this.applyDate = applyDate;
	}

	public Set getApplyBuyDetails() {
		return this.applyBuyDetails;
	}

	public void setApplyBuyDetails(Set applyBuyDetails) {
		this.applyBuyDetails = applyBuyDetails;
	}

}