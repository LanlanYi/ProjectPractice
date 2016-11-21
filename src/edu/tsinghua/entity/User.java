package edu.tsinghua.entity;

public class User {
	
	private int userId;         //编号
	private int loginId;        //登录编号
	private String yuangongNo;  //工号
	private int typeId;         //员工类型编号
	private int departId;       //部门编号
	private double salary;      //工资
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getYuangongNo() {
		return yuangongNo;
	}
	public void setYuangongNo(String yuangongNo) {
		this.yuangongNo = yuangongNo;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public int getDepartId() {
		return departId;
	}
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public User(int userId, int loginId, String yuangongNo, int typeId, int departId, double salary) {
		super();
		this.userId = userId;
		this.loginId = loginId;
		this.yuangongNo = yuangongNo;
		this.typeId = typeId;
		this.departId = departId;
		this.salary = salary;
	}
	
	public User(int loginId, String yuangongNo, int typeId, int departId, double salary) {
		super();
		this.loginId = loginId;
		this.yuangongNo = yuangongNo;
		this.typeId = typeId;
		this.departId = departId;
		this.salary = salary;
	}
	
	public User() {
		super();
	}
	
	
}
