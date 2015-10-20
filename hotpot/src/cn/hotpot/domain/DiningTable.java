package cn.hotpot.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * DiningTable entity. @author MyEclipse Persistence Tools
 */

public class DiningTable implements java.io.Serializable {

	// Fields

	private BigDecimal diningTableId;
	private Status status;
	private Integer tableNo;
	private Set orderFs = new HashSet(0);
	private Set bookTableRecords = new HashSet(0);

	// Constructors

	/** default constructor */
	public DiningTable() {
	}

	/** full constructor */
	public DiningTable(Status status, Integer tableNo, Set orderFs,
			Set bookTableRecords) {
		this.status = status;
		this.tableNo = tableNo;
		this.orderFs = orderFs;
		this.bookTableRecords = bookTableRecords;
	}

	// Property accessors

	public BigDecimal getDiningTableId() {
		return this.diningTableId;
	}

	public void setDiningTableId(BigDecimal diningTableId) {
		this.diningTableId = diningTableId;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Integer getTableNo() {
		return this.tableNo;
	}

	public void setTableNo(Integer tableNo) {
		this.tableNo = tableNo;
	}

	public Set getOrderFs() {
		return this.orderFs;
	}

	public void setOrderFs(Set orderFs) {
		this.orderFs = orderFs;
	}

	public Set getBookTableRecords() {
		return this.bookTableRecords;
	}

	public void setBookTableRecords(Set bookTableRecords) {
		this.bookTableRecords = bookTableRecords;
	}

}