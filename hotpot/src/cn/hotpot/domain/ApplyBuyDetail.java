package cn.hotpot.domain;

/**
 * ApplyBuyDetail entity. @author MyEclipse Persistence Tools
 */

public class ApplyBuyDetail implements java.io.Serializable {

	// Fields

	private Integer applyBuyDetailId;
	private ApplyBuy applyBuy;
	private Material material;
	private Integer goodsNum;

	// Constructors

	/** default constructor */
	public ApplyBuyDetail() {
	}

	/** full constructor */
	public ApplyBuyDetail(ApplyBuy applyBuy, Material material, Integer goodsNum) {
		this.applyBuy = applyBuy;
		this.material = material;
		this.goodsNum = goodsNum;
	}

	// Property accessors

	public Integer getApplyBuyDetailId() {
		return this.applyBuyDetailId;
	}

	public void setApplyBuyDetailId(Integer applyBuyDetailId) {
		this.applyBuyDetailId = applyBuyDetailId;
	}

	public ApplyBuy getApplyBuy() {
		return this.applyBuy;
	}

	public void setApplyBuy(ApplyBuy applyBuy) {
		this.applyBuy = applyBuy;
	}

	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Integer getGoodsNum() {
		return this.goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

}