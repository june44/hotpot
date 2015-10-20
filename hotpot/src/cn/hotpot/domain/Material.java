package cn.hotpot.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Material entity. @author MyEclipse Persistence Tools
 */

public class Material implements java.io.Serializable {

	// Fields

	private Integer materialId;
	private String materialName;
	private String unit;
	private Integer bid;
	private Integer evaluate;
	private Set storages = new HashSet(0);
	private Set applyBuyDetails = new HashSet(0);
	private Set unitConversions = new HashSet(0);
	private Set purchaseFDs = new HashSet(0);
	private Set storageChanges = new HashSet(0);

	// Constructors

	/** default constructor */
	public Material() {
	}

	/** full constructor */
	public Material(String materialName, String unit, Integer bid,
			Integer evaluate, Set storages, Set applyBuyDetails,
			Set unitConversions, Set purchaseFDs, Set storageChanges) {
		this.materialName = materialName;
		this.unit = unit;
		this.bid = bid;
		this.evaluate = evaluate;
		this.storages = storages;
		this.applyBuyDetails = applyBuyDetails;
		this.unitConversions = unitConversions;
		this.purchaseFDs = purchaseFDs;
		this.storageChanges = storageChanges;
	}

	// Property accessors

	public Integer getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(Integer materialId) {
		this.materialId = materialId;
	}

	public String getMaterialName() {
		return this.materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Integer getEvaluate() {
		return this.evaluate;
	}

	public void setEvaluate(Integer evaluate) {
		this.evaluate = evaluate;
	}

	public Set getStorages() {
		return this.storages;
	}

	public void setStorages(Set storages) {
		this.storages = storages;
	}

	public Set getApplyBuyDetails() {
		return this.applyBuyDetails;
	}

	public void setApplyBuyDetails(Set applyBuyDetails) {
		this.applyBuyDetails = applyBuyDetails;
	}

	public Set getUnitConversions() {
		return this.unitConversions;
	}

	public void setUnitConversions(Set unitConversions) {
		this.unitConversions = unitConversions;
	}

	public Set getPurchaseFDs() {
		return this.purchaseFDs;
	}

	public void setPurchaseFDs(Set purchaseFDs) {
		this.purchaseFDs = purchaseFDs;
	}

	public Set getStorageChanges() {
		return this.storageChanges;
	}

	public void setStorageChanges(Set storageChanges) {
		this.storageChanges = storageChanges;
	}

}