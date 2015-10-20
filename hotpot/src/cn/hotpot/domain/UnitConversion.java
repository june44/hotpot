package cn.hotpot.domain;

/**
 * UnitConversion entity. @author MyEclipse Persistence Tools
 */

public class UnitConversion implements java.io.Serializable {

	// Fields

	private Integer unitConversionId;
	private Material material;
	private Goods goods;
	private Integer goodsNum;
	private Integer materialNum;

	// Constructors

	/** default constructor */
	public UnitConversion() {
	}

	/** full constructor */
	public UnitConversion(Material material, Goods goods, Integer goodsNum,
			Integer materialNum) {
		this.material = material;
		this.goods = goods;
		this.goodsNum = goodsNum;
		this.materialNum = materialNum;
	}

	// Property accessors

	public Integer getUnitConversionId() {
		return this.unitConversionId;
	}

	public void setUnitConversionId(Integer unitConversionId) {
		this.unitConversionId = unitConversionId;
	}

	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Integer getGoodsNum() {
		return this.goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public Integer getMaterialNum() {
		return this.materialNum;
	}

	public void setMaterialNum(Integer materialNum) {
		this.materialNum = materialNum;
	}

}