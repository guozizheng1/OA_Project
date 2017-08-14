package com.imooc.workgroup;

public class Position {
	//定义类成员: 职位编号、职位名称
	private String posNo;
	private String posName;
	
	//无参的构造方法
	public Position() {
		
	}
	
	//带参数的构造方法
	public Position(String posNo, String posName) {
		this.setPosNo(posNo);
		this.setPosName(posName);
		
	}

	//设置getter和setter方法
	public String getPosNo() {
		return posNo;
	}

	public void setPosNo(String posNo) {
		this.posNo = posNo;
	}

	public String getPosName() {
		return posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}
	
	
	
	
}
