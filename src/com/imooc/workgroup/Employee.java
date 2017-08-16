package com.imooc.workgroup;

public class Employee {
	//成员特征：员工姓名、工号、年龄、性别、所属部门、职务信息
	private String empName;//姓名
	private String empNo;//工号
	private int empAge;//年龄
	private String empSex;//性别
	private Department empDepartment;//员工所属部门
	private Department empDepName; //员工部门
	private Position empPosition;//员工职务
	
	//无参的构造方法
	public Employee() {
		
	}
	
	//带参的构造方法
	public Employee(String empName, String empNo, int empAge, String empSex, Department empDepName, Position empPosition) {
		this.setEmpName(empName);
		this.setEmpNo(empNo);
		this.setEmpAge(empAge);
		this.setEmpSex(empSex);
		this.setEmpDepName(empDepName);
		this.setEmpPosition(empPosition);
		
	}
	
	//设置getter和setter方法
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	
	public int getEmpAge() {
		return empAge;
	}
	
	/**
	 * 给年龄赋值，限定在18--65之间，否则赋值为18岁
	 * @param empAge 传入的年龄
	 */
	public void setEmpAge(int empAge) {
		if(empAge<18||empAge>65) {
			this.empAge = 18;
		}else {
			this.empAge = empAge;
		}
	}
	
	public String getEmpSex() {
		return empSex;
	}
	
	/**
	 * 设定方法限定性别只能是“男”或者“女”,反之则设置默认为"男"
	 * @param empSex 传入的性别
	 */
	public void setEmpSex(String empSex) {
		if(empSex.equals("男")||empSex.equals("女")) {
			this.empSex = empSex;
		}else {
			this.empSex = "男";
		}
	}
	
	/**
	 * 获取部门对象，如果没有实例化，先实例化再返回
	 * @return 部门对象的信息
	 */
	public Department getEmpDepartment() {
		if(this.empDepartment==null) {
			this.empDepartment = new Department();
		}
		return empDepartment;
	}

	public void setEmpDepartment(Department empDepartment) {
		this.empDepartment = empDepartment;
	}

	/**
	 * 获取职务对象，如果没有实例化，先实例化再返回
	 * @return 职务对象的信息
	 */
	public Position getEmpPosition() {
		if(this.empPosition==null) {
			this.empPosition = new Position();
		}
		return empPosition;
	}

	public void setEmpPosition(Position empPosition) {
		this.empPosition = empPosition;
	}
	
	/**
	 * 获取员工部门名称对象，如果没有实例化，先实例化再返回
	 * @return
	 */
	public Department getEmpDepName() {
		if(this.empDepName==null) {
			this.empDepName = new Department();
		}
		return empDepName;
	}

	public void setEmpDepName(Department empDepName) {
		this.empDepName = empDepName;
	}

	public String empInfo() {
		String str = "姓名: " + this.getEmpName() + "\n工号: " + this.getEmpNo() + "\n性别: " + this.getEmpSex()
				+ "\n年龄: " + this.getEmpAge() + "\n职务: " + this.getEmpDepName().getDepName() + this.getEmpPosition().getPosName();
		return str;
	}
	

}
