package cn.hotpot.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * GoodsT entity. @author MyEclipse Persistence Tools
 */

public class GoodsT implements java.io.Serializable {

	// Fields

	private Integer goodsTId;
	private String typeDesc;
	private Integer processedGoods;
	private Set goodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public GoodsT() {
	}

	/** full constructor */
	public GoodsT(String typeDesc, Integer processedGoods, Set goodses) {
		this.typeDesc = typeDesc;
		this.processedGoods = processedGoods;
		this.goodses = goodses;
	}

	// Property accessors

	public Integer getGoodsTId() {
		return this.goodsTId;
	}

	public void setGoodsTId(Integer goodsTId) {
		this.goodsTId = goodsTId;
	}

	public String getTypeDesc() {
		return this.typeDesc;
	}

	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

	public Integer getProcessedGoods() {
		return this.processedGoods;
	}

	public void setProcessedGoods(Integer processedGoods) {
		this.processedGoods = processedGoods;
	}

	public Set getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set goodses) {
		this.goodses = goodses;
	}

}