package cn.hotpot.domain;

/**
 * Storage entity. @author MyEclipse Persistence Tools
 */

public class Storage implements java.io.Serializable {

	// Fields

	private Integer storageId;
	private Material material;
	private Integer remain;

	// Constructors

	/** default constructor */
	public Storage() {
	}

	/** full constructor */
	public Storage(Material material, Integer remain) {
		this.material = material;
		this.remain = remain;
	}

	// Property accessors

	public Integer getStorageId() {
		return this.storageId;
	}

	public void setStorageId(Integer storageId) {
		this.storageId = storageId;
	}

	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Integer getRemain() {
		return this.remain;
	}

	public void setRemain(Integer remain) {
		this.remain = remain;
	}

}