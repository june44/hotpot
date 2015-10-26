package cn.hotpot.domain;

import java.util.HashSet;
import java.util.Set;



/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer employeeId;
	private Status statusByStaStatusId;
	private Status statusByStatusId;
	private Position position;
	private Department department;
	private PushMoney pushMoney;
	private String userName;
	private String password;
	private Integer salary;
	private String true_Name;
	private String addr;
	private String phone;
	private String sex;
	private Set applyBuiesForApprover = new HashSet(0);
	private Set dishsForCook = new HashSet(0);
	private Set applyBuiesForApplicant = new HashSet(0);
	private Set purchaseFs = new HashSet(0);
	private Set cookAccounts = new HashSet(0);
	private Set billFs = new HashSet(0);
	private Set dishsForWaiter = new HashSet(0);
	private Set storageChanges = new HashSet(0);
	private Set orderFs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** full constructor */
	public Employee(Status statusByStaStatusId, Status statusByStatusId,
			Position position, Department department, PushMoney pushMoney,
			String userName, String password, Integer salary,String true_Name,
			String addr, String phone,String sex ,
			Set applyBuiesForApprover, Set dishsForCook,
			Set applyBuiesForApplicant, Set purchaseFs, Set cookAccounts,
			Set billFs, Set dishsForWaiter, Set storageChanges, Set orderFs) {
		this.statusByStaStatusId = statusByStaStatusId;
		this.statusByStatusId = statusByStatusId;
		this.position = position;
		this.department = department;
		this.pushMoney = pushMoney;
		this.userName = userName;
		this.password = password;
		this.salary = salary;
		this.addr=addr;
		this.sex=sex;
		this.true_Name=true_Name;
		this.phone=phone;
		this.applyBuiesForApprover = applyBuiesForApprover;
		this.dishsForCook = dishsForCook;
		this.applyBuiesForApplicant = applyBuiesForApplicant;
		this.purchaseFs = purchaseFs;
		this.cookAccounts = cookAccounts;
		this.billFs = billFs;
		this.dishsForWaiter = dishsForWaiter;
		this.storageChanges = storageChanges;
		this.orderFs = orderFs;
	}

	// Property accessors

	public String getTrue_Name() {
		return true_Name;
	}

	public void setTrue_Name(String trueName) {
		true_Name = trueName;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Status getStatusByStaStatusId() {
		return this.statusByStaStatusId;
	}

	public void setStatusByStaStatusId(Status statusByStaStatusId) {
		this.statusByStaStatusId = statusByStaStatusId;
	}

	public Status getStatusByStatusId() {
		return this.statusByStatusId;
	}

	public void setStatusByStatusId(Status statusByStatusId) {
		this.statusByStatusId = statusByStatusId;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public PushMoney getPushMoney() {
		return this.pushMoney;
	}

	public void setPushMoney(PushMoney pushMoney) {
		this.pushMoney = pushMoney;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSalary() {
		return this.salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Set getApplyBuiesForApprover() {
		return this.applyBuiesForApprover;
	}

	public void setApplyBuiesForApprover(Set applyBuiesForApprover) {
		this.applyBuiesForApprover = applyBuiesForApprover;
	}

	public Set getDishsForCook() {
		return this.dishsForCook;
	}

	public void setDishsForCook(Set dishsForCook) {
		this.dishsForCook = dishsForCook;
	}

	public Set getApplyBuiesForApplicant() {
		return this.applyBuiesForApplicant;
	}

	public void setApplyBuiesForApplicant(Set applyBuiesForApplicant) {
		this.applyBuiesForApplicant = applyBuiesForApplicant;
	}

	public Set getPurchaseFs() {
		return this.purchaseFs;
	}

	public void setPurchaseFs(Set purchaseFs) {
		this.purchaseFs = purchaseFs;
	}

	public Set getCookAccounts() {
		return this.cookAccounts;
	}

	public void setCookAccounts(Set cookAccounts) {
		this.cookAccounts = cookAccounts;
	}

	public Set getBillFs() {
		return this.billFs;
	}

	public void setBillFs(Set billFs) {
		this.billFs = billFs;
	}

	public Set getDishsForWaiter() {
		return this.dishsForWaiter;
	}

	public void setDishsForWaiter(Set dishsForWaiter) {
		this.dishsForWaiter = dishsForWaiter;
	}

	public Set getStorageChanges() {
		return this.storageChanges;
	}

	public void setStorageChanges(Set storageChanges) {
		this.storageChanges = storageChanges;
	}

	public Set getOrderFs() {
		return this.orderFs;
	}

	public void setOrderFs(Set orderFs) {
		this.orderFs = orderFs;
	}

}