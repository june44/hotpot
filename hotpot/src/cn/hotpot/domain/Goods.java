package cn.hotpot.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private Integer goodsId;
	private GoodsT goodsT;
	private Integer price;
	private String unit;
	private String goodsName;
	private Integer bid;
	private Integer remain;
	private Set orderFDs = new HashSet(0);
	private Set unitConversions = new HashSet(0);
	private Set cookAccounts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** full constructor */
	public Goods(GoodsT goodsT, Integer price, String unit, String goodsName,
			Integer bid, Integer remain, Set orderFDs, Set unitConversions,
			Set cookAccounts) {
		this.goodsT = goodsT;
		this.price = price;
		this.unit = unit;
		this.goodsName = goodsName;
		this.bid = bid;
		this.remain = remain;
		this.orderFDs = orderFDs;
		this.unitConversions = unitConversions;
		this.cookAccounts = cookAccounts;
	}

	// Property accessors

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public GoodsT getGoodsT() {
		return this.goodsT;
	}

	public void setGoodsT(GoodsT goodsT) {
		this.goodsT = goodsT;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Integer getRemain() {
		return this.remain;
	}

	public void setRemain(Integer remain) {
		this.remain = remain;
	}

	public Set getOrderFDs() {
		return this.orderFDs;
	}

	public void setOrderFDs(Set orderFDs) {
		this.orderFDs = orderFDs;
	}

	public Set getUnitConversions() {
		return this.unitConversions;
	}

	public void setUnitConversions(Set unitConversions) {
		this.unitConversions = unitConversions;
	}

	public Set getCookAccounts() {
		return this.cookAccounts;
	}

	public void setCookAccounts(Set cookAccounts) {
		this.cookAccounts = cookAccounts;
	}

}