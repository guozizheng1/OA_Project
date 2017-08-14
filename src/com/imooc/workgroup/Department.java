package com.imooc.workgroup;

public class Department {
	//定义部门类的成员：部门编号、部门名称、部门员工信息
	private String depNo;//编号
	private String depName;//名称
	
	
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
	
	
	
	
	

}
