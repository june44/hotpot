package cn.hotpot.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * BillType entity. @author MyEclipse Persistence Tools
 */

public class BillType implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private Integer typeName;
	private Set billFs = new HashSet(0);

	// Constructors

	/** default constructor */
	public BillType() {
	}

	/** full constructor */
	public BillType(Integer typeName, Set billFs) {
		this.typeName = typeName;
		this.billFs = billFs;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getTypeName() {
		return this.typeName;
	}

	public void setTypeName(Integer typeName) {
		this.typeName = typeName;
	}

	public Set getBillFs() {
		return this.billFs;
	}

	public void setBillFs(Set billFs) {
		this.billFs = billFs;
	}

}