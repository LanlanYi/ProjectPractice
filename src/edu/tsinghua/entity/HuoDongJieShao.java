package edu.tsinghua.entity;

public class HuoDongJieShao {
	private int huoDongId;          //编号
	private String huoDongName;     //活动名称
	private String huoDongAddress;  //活动地点
	private String huoDongMiaoShu;  //活动描述
	private Department department;  //部门
	
	public HuoDongJieShao(int huoDongId, String huoDongName, String huoDongAddress, String huoDongMiaoShu,
			Department department) {
		super();
		this.huoDongId = huoDongId;
		this.huoDongName = huoDongName;
		this.huoDongAddress = huoDongAddress;
		this.huoDongMiaoShu = huoDongMiaoShu;
		this.department = department;
	}
	
	public HuoDongJieShao(String huoDongName, String huoDongAddress, String huoDongMiaoShu,
			Department department) {
		super();
		this.huoDongName = huoDongName;
		this.huoDongAddress = huoDongAddress;
		this.huoDongMiaoShu = huoDongMiaoShu;
		this.department = department;
	}
	
	public HuoDongJieShao() {
		super();
	}

	public int getHuoDongId() {
		return huoDongId;
	}
	public void setHuoDongId(int huoDongId) {
		this.huoDongId = huoDongId;
	}
	public String getHuoDongName() {
		return huoDongName;
	}
	public void setHuoDongName(String huoDongName) {
		this.huoDongName = huoDongName;
	}
	public String getHuoDongAddress() {
		return huoDongAddress;
	}
	public void setHuoDongAddress(String huoDongAddress) {
		this.huoDongAddress = huoDongAddress;
	}
	public String getHuoDongMiaoShu() {
		return huoDongMiaoShu;
	}
	public void setHuoDongMiaoShu(String huoDongMiaoShu) {
		this.huoDongMiaoShu = huoDongMiaoShu;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
