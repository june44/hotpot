package cn.hotpot.domain;

/**
 * Dish entity. @author MyEclipse Persistence Tools
 */

public class Dish implements java.io.Serializable {

	// Fields

	private Integer dishId;
	private Employee employeeByCook;
	private Employee employeeByWaiter;
	private Status status;
	private OrderFD orderFD;

	// Constructors

	/** default constructor */
	public Dish() {
	}

	/** full constructor */
	public Dish(Employee employeeByCook, Employee employeeByWaiter,
			Status status, OrderFD orderFD) {
		this.employeeByCook = employeeByCook;
		this.employeeByWaiter = employeeByWaiter;
		this.status = status;
		this.orderFD = orderFD;
	}

	// Property accessors

	public Integer getDishId() {
		return this.dishId;
	}

	public void setDishId(Integer dishId) {
		this.dishId = dishId;
	}

	public Employee getEmployeeByCook() {
		return this.employeeByCook;
	}

	public void setEmployeeByCook(Employee employeeByCook) {
		this.employeeByCook = employeeByCook;
	}

	public Employee getEmployeeByWaiter() {
		return this.employeeByWaiter;
	}

	public void setEmployeeByWaiter(Employee employeeByWaiter) {
		this.employeeByWaiter = employeeByWaiter;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public OrderFD getOrderFD() {
		return this.orderFD;
	}

	public void setOrderFD(OrderFD orderFD) {
		this.orderFD = orderFD;
	}

}