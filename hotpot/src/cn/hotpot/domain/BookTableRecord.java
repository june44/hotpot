package cn.hotpot.domain;

import java.sql.Timestamp;

/**
 * BookTableRecord entity. @author MyEclipse Persistence Tools
 */

public class BookTableRecord implements java.io.Serializable {

	// Fields

	private Integer bookTableRecordId;
	private DiningTable diningTable;
	private Timestamp bookTime;
	private String phone;

	// Constructors

	/** default constructor */
	public BookTableRecord() {
	}

	/** full constructor */
	public BookTableRecord(DiningTable diningTable, Timestamp bookTime,
			String phone) {
		this.diningTable = diningTable;
		this.bookTime = bookTime;
		this.phone = phone;
	}

	// Property accessors

	public Integer getBookTableRecordId() {
		return this.bookTableRecordId;
	}

	public void setBookTableRecordId(Integer bookTableRecordId) {
		this.bookTableRecordId = bookTableRecordId;
	}

	public DiningTable getDiningTable() {
		return this.diningTable;
	}

	public void setDiningTable(DiningTable diningTable) {
		this.diningTable = diningTable;
	}

	public Timestamp getBookTime() {
		return this.bookTime;
	}

	public void setBookTime(Timestamp bookTime) {
		this.bookTime = bookTime;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}