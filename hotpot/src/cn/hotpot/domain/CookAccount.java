package cn.hotpot.domain;

import java.sql.Timestamp;

/**
 * CookAccount entity. @author MyEclipse Persistence Tools
 */

public class CookAccount implements java.io.Serializable {

	// Fields

	private Integer cookAccountId;
	private Employee employee;
	private Goods goods;
	private Integer dishNum;
	private Timestamp accountDate;

	// Constructors

	/** default constructor */
	public CookAccount() {
	}

	/** full constructor */
	public CookAccount(Employee employee, Goods goods, Integer dishNum,
			Timestamp accountDate) {
		this.employee = employee;
		this.goods = goods;
		this.dishNum = dishNum;
		this.accountDate = accountDate;
	}

	// Property accessors

	public Integer getCookAccountId() {
		return this.cookAccountId;
	}

	public void setCookAccountId(Integer cookAccountId) {
		this.cookAccountId = cookAccountId;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Integer getDishNum() {
		return this.dishNum;
	}

	public void setDishNum(Integer dishNum) {
		this.dishNum = dishNum;
	}

	public Timestamp getAccountDate() {
		return this.accountDate;
	}

	public void setAccountDate(Timestamp accountDate) {
		this.accountDate = accountDate;
	}

}