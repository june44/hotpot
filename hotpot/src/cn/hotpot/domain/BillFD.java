package cn.hotpot.domain;

/**
 * BillFD entity. @author MyEclipse Persistence Tools
 */

public class BillFD implements java.io.Serializable {

	// Fields

	private Integer billFDId;
	private BillF billF;
	private String reson;
	private Integer money;
	private Integer isExpend;

	// Constructors

	/** default constructor */
	public BillFD() {
	}

	/** full constructor */
	public BillFD(BillF billF, String reson, Integer money, Integer isExpend) {
		this.billF = billF;
		this.reson = reson;
		this.money = money;
		this.isExpend = isExpend;
	}

	// Property accessors

	public Integer getBillFDId() {
		return this.billFDId;
	}

	public void setBillFDId(Integer billFDId) {
		this.billFDId = billFDId;
	}

	public BillF getBillF() {
		return this.billF;
	}

	public void setBillF(BillF billF) {
		this.billF = billF;
	}

	public String getReson() {
		return this.reson;
	}

	public void setReson(String reson) {
		this.reson = reson;
	}

	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public Integer getIsExpend() {
		return this.isExpend;
	}

	public void setIsExpend(Integer isExpend) {
		this.isExpend = isExpend;
	}

}