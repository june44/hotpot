package cn.hotpot.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * OrderFD entity. @author MyEclipse Persistence Tools
 */

public class OrderFD implements java.io.Serializable {

	// Fields

	private Integer orderFDId;
	private OrderF orderF;
	private Goods goods;
	private Integer goodsNum;
	private Set dishs = new HashSet(0);

	// Constructors

	/** default constructor */
	public OrderFD() {
	}

	/** full constructor */
	public OrderFD(OrderF orderF, Goods goods, Integer goodsNum, Set dishs) {
		this.orderF = orderF;
		this.goods = goods;
		this.goodsNum = goodsNum;
		this.dishs = dishs;
	}

	// Property accessors

	public Integer getOrderFDId() {
		return this.orderFDId;
	}

	public void setOrderFDId(Integer orderFDId) {
		this.orderFDId = orderFDId;
	}

	public OrderF getOrderF() {
		return this.orderF;
	}

	public void setOrderF(OrderF orderF) {
		this.orderF = orderF;
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

	public Set getDishs() {
		return this.dishs;
	}

	public void setDishs(Set dishs) {
		this.dishs = dishs;
	}

}