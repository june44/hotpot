package cn.hotpot.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Status entity. @author MyEclipse Persistence Tools
 */

public class Status implements java.io.Serializable {

	// Fields

	private Integer statusId;
	private String statusDesc;
	private Integer belong;
	private Set employeesForStatusId = new HashSet(0);
	private Set employeesForStaStatusId = new HashSet(0);
	private Set dishs = new HashSet(0);
	private Set diningTables = new HashSet(0);
	private Set orderFs = new HashSet(0);
	private Set applyBuies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Status() {
	}

	/** full constructor */
	public Status(String statusDesc, Integer belong, Set employeesForStatusId,
			Set employeesForStaStatusId, Set dishs, Set diningTables,
			Set orderFs, Set applyBuies) {
		this.statusDesc = statusDesc;
		this.belong = belong;
		this.employeesForStatusId = employeesForStatusId;
		this.employeesForStaStatusId = employeesForStaStatusId;
		this.dishs = dishs;
		this.diningTables = diningTables;
		this.orderFs = orderFs;
		this.applyBuies = applyBuies;
	}

	// Property accessors

	public Integer getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public Integer getBelong() {
		return this.belong;
	}

	public void setBelong(Integer belong) {
		this.belong = belong;
	}

	public Set getEmployeesForStatusId() {
		return this.employeesForStatusId;
	}

	public void setEmployeesForStatusId(Set employeesForStatusId) {
		this.employeesForStatusId = employeesForStatusId;
	}

	public Set getEmployeesForStaStatusId() {
		return this.employeesForStaStatusId;
	}

	public void setEmployeesForStaStatusId(Set employeesForStaStatusId) {
		this.employeesForStaStatusId = employeesForStaStatusId;
	}

	public Set getDishs() {
		return this.dishs;
	}

	public void setDishs(Set dishs) {
		this.dishs = dishs;
	}

	public Set getDiningTables() {
		return this.diningTables;
	}

	public void setDiningTables(Set diningTables) {
		this.diningTables = diningTables;
	}

	public Set getOrderFs() {
		return this.orderFs;
	}

	public void setOrderFs(Set orderFs) {
		this.orderFs = orderFs;
	}

	public Set getApplyBuies() {
		return this.applyBuies;
	}

	public void setApplyBuies(Set applyBuies) {
		this.applyBuies = applyBuies;
	}

}