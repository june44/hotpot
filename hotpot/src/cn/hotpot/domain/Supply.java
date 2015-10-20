package cn.hotpot.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Supply entity. @author MyEclipse Persistence Tools
 */

public class Supply implements java.io.Serializable {

	// Fields

	private Integer supplyId;
	private String addr;
	private String phone;
	private String supplyName;
	private Set purchaseFDs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Supply() {
	}

	/** full constructor */
	public Supply(String addr, String phone, String supplyName, Set purchaseFDs) {
		this.addr = addr;
		this.phone = phone;
		this.supplyName = supplyName;
		this.purchaseFDs = purchaseFDs;
	}

	// Property accessors

	public Integer getSupplyId() {
		return this.supplyId;
	}

	public void setSupplyId(Integer supplyId) {
		this.supplyId = supplyId;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSupplyName() {
		return this.supplyName;
	}

	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}

	public Set getPurchaseFDs() {
		return this.purchaseFDs;
	}

	public void setPurchaseFDs(Set purchaseFDs) {
		this.purchaseFDs = purchaseFDs;
	}

}