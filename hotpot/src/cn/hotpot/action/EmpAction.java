package cn.hotpot.action;

import cn.hotpot.biz.EmpBiz;
import cn.hotpot.domain.Employee;

public class EmpAction extends BaseAction {

	private Employee employee;
	
	private EmpBiz empBiz;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void setEmpBiz(EmpBiz empBiz) {
		this.empBiz = empBiz;
	}
	
	
}
