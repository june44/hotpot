package cn.hotpot.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * OrderF entity. @author MyEclipse Persistence Tools
 */

public class OrderF implements java.io.Serializable {

	// Fields

	private Integer orderFId;
	private Employee employee;
	private DiningTable diningTable;
	private Status status;
	private Vip vip;
	private Timestamp orderDate;
	private Timestamp finishDate;
	private Integer totalPrice;
	private String payMethod;
	private Set orderFDs = new HashSet(0);

	// Constructors

	/** default constructor */
	public OrderF() {
	}

	/** full constructor */
	public OrderF(Employee employee, DiningTable diningTable, Status status,
			Vip vip, Timestamp orderDate, Timestamp finishDate,
			Integer totalPrice, String payMethod, Set orderFDs) {
		this.employee = employee;
		this.diningTable = diningTable;
		this.status = status;
		this.vip = vip;
		this.orderDate = orderDate;
		this.finishDate = finishDate;
		this.totalPrice = totalPrice;
		this.payMethod = payMethod;
		this.orderFDs = orderFDs;
	}

	// Property accessors

	public Integer getOrderFId() {
		return this.orderFId;
	}

	public void setOrderFId(Integer orderFId) {
		this.orderFId = orderFId;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public DiningTable getDiningTable() {
		return this.diningTable;
	}

	public void setDiningTable(DiningTable diningTable) {
		this.diningTable = diningTable;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Vip getVip() {
		return this.vip;
	}

	public void setVip(Vip vip) {
		this.vip = vip;
	}

	public Timestamp getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public Timestamp getFinishDate() {
		return this.finishDate;
	}

	public void setFinishDate(Timestamp finishDate) {
		this.finishDate = finishDate;
	}

	public Integer getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPayMethod() {
		return this.payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public Set getOrderFDs() {
		return this.orderFDs;
	}

	public void setOrderFDs(Set orderFDs) {
		this.orderFDs = orderFDs;
	}

}