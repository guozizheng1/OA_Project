package com.imooc.oatest;
import com.imooc.workgroup.Employee;
import com.imooc.workgroup.Position;

public class CompanyTest {

	public static void main(String[] args) {
		//测试职务
		Position pos1 = new Position("P001", "人事部经理");
		// 测试employee
		Employee emp1 = new Employee("张铭", "S001", 29, "男", pos1);
		System.out.println(emp1.empInfo());
		System.out.println("========================");

	}

}
