package cn.hotpot.domain;

import java.sql.Timestamp;

/**
 * StorageChange entity. @author MyEclipse Persistence Tools
 */

public class StorageChange implements java.io.Serializable {

	// Fields

	private Integer storageChangeId;
	private Employee employee;
	private Material material;
	private Integer oldNum;
	private Integer newNum;
	private Timestamp updateDate;

	// Constructors

	/** default constructor */
	public StorageChange() {
	}

	/** full constructor */
	public StorageChange(Employee employee, Material material, Integer oldNum,
			Integer newNum, Timestamp updateDate) {
		this.employee = employee;
		this.material = material;
		this.oldNum = oldNum;
		this.newNum = newNum;
		this.updateDate = updateDate;
	}

	// Property accessors

	public Integer getStorageChangeId() {
		return this.storageChangeId;
	}

	public void setStorageChangeId(Integer storageChangeId) {
		this.storageChangeId = storageChangeId;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Integer getOldNum() {
		return this.oldNum;
	}

	public void setOldNum(Integer oldNum) {
		this.oldNum = oldNum;
	}

	public Integer getNewNum() {
		return this.newNum;
	}

	public void setNewNum(Integer newNum) {
		this.newNum = newNum;
	}

	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

}