package com.imooc.workgroup;

public class Department {
	//定义部门类的成员：部门编号、部门名称、部门员工信息
	private String depNo;//编号
	private String depName;//名称
	private Employee[] depEmployees;//部门员工
	private int employeeNum; // 员工数量
	
	//定义无参的构造方法
	public Department() {
		
	}
	
	//带参数的构造方法
	public Department(String depNo, String depName) {
		this.depNo = depNo;
		this.depName = depName;
		
	}


	public String getDepNo() {
		return depNo;
	}


	public void setDepNo(String depNo) {
		this.depNo = depNo;
	}


	public String getDepName() {
		return depName;
	}


	public void setDepName(String depName) {
		this.depName = depName;
	}

	/**
	 * 获取选修员工的数据信息，如果保存员工信息的数组未被初始化，则先初始化长度为100
	 * @return 保存员工信息的数组
	 */
	public Employee[] getDepEmployees() {
		if(this.depEmployees==null) {
			this.depEmployees = new Employee[100];
		}
		return depEmployees;
	}

	public void setDepEmployees(Employee[] depEmployees) {
		this.depEmployees = depEmployees;
	}

	/**
	 * 获取部门员工的数量
	 * @return
	 */
	public int getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}
	
	/**
	 * 1.将员工保存找到数组中
	 * 2.将员工个数保存到employeeNum中
	 * @param emp
	 */
	public void addEmployee(Employee emp) {
		for(int i=0;i<getDepEmployees().length;i++) {
			if(getDepEmployees()[i]==null) {
				emp.setEmpDepartment(this);
				this.getDepEmployees()[i] = emp;
				//将员工数量保存到employeeNum中
				this.employeeNum = i + 1;
				return;
			}
		}
		
	}
	
	
	
	

}
