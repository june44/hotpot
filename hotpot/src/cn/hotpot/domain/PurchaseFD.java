package cn.hotpot.domain;

/**
 * PurchaseFD entity. @author MyEclipse Persistence Tools
 */

public class PurchaseFD implements java.io.Serializable {

	// Fields

	private Integer purchaseFDId;
	private PurchaseF purchaseF;
	private Material material;
	private Supply supply;
	private Integer startNum;
	private Integer actualNum;

	// Constructors

	/** default constructor */
	public PurchaseFD() {
	}

	/** full constructor */
	public PurchaseFD(PurchaseF purchaseF, Material material, Supply supply,
			Integer startNum, Integer actualNum) {
		this.purchaseF = purchaseF;
		this.material = material;
		this.supply = supply;
		this.startNum = startNum;
		this.actualNum = actualNum;
	}

	// Property accessors

	public Integer getPurchaseFDId() {
		return this.purchaseFDId;
	}

	public void setPurchaseFDId(Integer purchaseFDId) {
		this.purchaseFDId = purchaseFDId;
	}

	public PurchaseF getPurchaseF() {
		return this.purchaseF;
	}

	public void setPurchaseF(PurchaseF purchaseF) {
		this.purchaseF = purchaseF;
	}

	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Supply getSupply() {
		return this.supply;
	}

	public void setSupply(Supply supply) {
		this.supply = supply;
	}

	public Integer getStartNum() {
		return this.startNum;
	}

	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}

	public Integer getActualNum() {
		return this.actualNum;
	}

	public void setActualNum(Integer actualNum) {
		this.actualNum = actualNum;
	}

}