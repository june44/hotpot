package cn.hotpot.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * BillF entity. @author MyEclipse Persistence Tools
 */

public class BillF implements java.io.Serializable {

	// Fields

	private Integer billFId;
	private Employee employee;
	private BillType billType;
	private Integer expend;
	private Integer income;
	private Timestamp startDate;
	private Timestamp endDate;
	private Set billFDs = new HashSet(0);

	// Constructors

	/** default constructor */
	public BillF() {
	}

	/** full constructor */
	public BillF(Employee employee, BillType billType, Integer expend,
			Integer income, Timestamp startDate, Timestamp endDate, Set billFDs) {
		this.employee = employee;
		this.billType = billType;
		this.expend = expend;
		this.income = income;
		this.startDate = startDate;
		this.endDate = endDate;
		this.billFDs = billFDs;
	}

	// Property accessors

	public Integer getBillFId() {
		return this.billFId;
	}

	public void setBillFId(Integer billFId) {
		this.billFId = billFId;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public BillType getBillType() {
		return this.billType;
	}

	public void setBillType(BillType billType) {
		this.billType = billType;
	}

	public Integer getExpend() {
		return this.expend;
	}

	public void setExpend(Integer expend) {
		this.expend = expend;
	}

	public Integer getIncome() {
		return this.income;
	}

	public void setIncome(Integer income) {
		this.income = income;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Set getBillFDs() {
		return this.billFDs;
	}

	public void setBillFDs(Set billFDs) {
		this.billFDs = billFDs;
	}

}