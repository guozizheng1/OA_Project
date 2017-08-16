package com.imooc.oatest;
import com.imooc.workgroup.Employee;
import com.imooc.workgroup.Position;
import com.imooc.workgroup.Department;

public class CompanyTest {

	public static void main(String[] args) {
		//实例化职务
		Position pos1 = new Position("P001", "经理");
		Position pos2 = new Position("P002", "助理");
		Position pos3 = new Position("P003", "职员");
		
		//实例化部门
		Department dep1 = new Department("D001", "人事部");
		Department dep2 = new Department("D002", "市场部");
		
		// 测试employee
		Employee emp1 = new Employee("张铭", "S001", 29, "男", dep1, pos1);
		System.out.println(emp1.empInfo());
		System.out.println("========================");
		Employee emp2 = new Employee("李艾爱", "S002", 21, "女", dep1, pos2);
		System.out.println(emp2.empInfo());
		System.out.println("========================");
		Employee emp3 = new Employee("孙超", "S004", 29, "男", dep1, pos3);
		System.out.println(emp3.empInfo());
		System.out.println("========================");
		Employee emp4 = new Employee("张美美", "S005", 26, "女", dep2, pos3);
		System.out.println(emp4.empInfo());
		System.out.println("========================");
		Employee emp5 = new Employee("蓝迪", "S006", 37, "男", dep2, pos1);
		System.out.println(emp5.empInfo());
		System.out.println("========================");
		Employee emp6 = new Employee("蓝迪", "S007", 24, "女", dep2, pos3);
		System.out.println(emp6.empInfo());
		System.out.println("========================");
		//测试指定部门中到底有多少员工
		dep1.addEmployee(emp1);
		dep1.addEmployee(emp2);
		dep1.addEmployee(emp3);
		dep2.addEmployee(emp4);
		dep2.addEmployee(emp5);
		dep2.addEmployee(emp6);
		
		System.out.println(dep1.getDepName() + "总共有" + dep1.getEmployeeNum() + "名员工");
		System.out.println(dep2.getDepName() + "总共有" + dep2.getEmployeeNum() + "名员工");
	}

}
