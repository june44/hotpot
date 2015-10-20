package cn.hotpot.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * PurchaseF entity. @author MyEclipse Persistence Tools
 */

public class PurchaseF implements java.io.Serializable {

	// Fields

	private Integer purchaseFId;
	private Employee employee;
	private Timestamp purchaseDate;
	private Integer budget;
	private Integer actualMoney;
	private Set purchaseFDs = new HashSet(0);

	// Constructors

	/** default constructor */
	public PurchaseF() {
	}

	/** full constructor */
	public PurchaseF(Employee employee, Timestamp purchaseDate, Integer budget,
			Integer actualMoney, Set purchaseFDs) {
		this.employee = employee;
		this.purchaseDate = purchaseDate;
		this.budget = budget;
		this.actualMoney = actualMoney;
		this.purchaseFDs = purchaseFDs;
	}

	// Property accessors

	public Integer getPurchaseFId() {
		return this.purchaseFId;
	}

	public void setPurchaseFId(Integer purchaseFId) {
		this.purchaseFId = purchaseFId;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Timestamp getPurchaseDate() {
		return this.purchaseDate;
	}

	public void setPurchaseDate(Timestamp purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Integer getBudget() {
		return this.budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}

	public Integer getActualMoney() {
		return this.actualMoney;
	}

	public void setActualMoney(Integer actualMoney) {
		this.actualMoney = actualMoney;
	}

	public Set getPurchaseFDs() {
		return this.purchaseFDs;
	}

	public void setPurchaseFDs(Set purchaseFDs) {
		this.purchaseFDs = purchaseFDs;
	}

}