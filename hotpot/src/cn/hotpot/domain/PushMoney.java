package cn.hotpot.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * PushMoney entity. @author MyEclipse Persistence Tools
 */

public class PushMoney implements java.io.Serializable {

	// Fields

	private Integer pushMoneyId;
	private Integer money;
	private Set employees = new HashSet(0);

	// Constructors

	/** default constructor */
	public PushMoney() {
	}

	/** full constructor */
	public PushMoney(Integer money, Set employees) {
		this.money = money;
		this.employees = employees;
	}

	// Property accessors

	public Integer getPushMoneyId() {
		return this.pushMoneyId;
	}

	public void setPushMoneyId(Integer pushMoneyId) {
		this.pushMoneyId = pushMoneyId;
	}

	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

}