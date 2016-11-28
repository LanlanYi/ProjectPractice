package edu.tsinghua.entity;

public class KaoQinSum {
	
	private int kaoQinSumId;    //编号
	private String month;       //月份
	private int departId;       //部门编号
	private String yuangongNo;  //工号
	private int supposeChuqin;  //应出勤天数
	private int actualChuqin;   //实际出勤天数
	private int queqin;         //缺勤天数
	private int overtime;       //加班天数
	
	
	
	public void setKaoQinSumId(int kaoQinSumId) {
		this.kaoQinSumId = kaoQinSumId;
	}
	public int getKaoQinSumId() {
		return kaoQinSumId;
	}
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getDepartId() {
		return departId;
	}
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	public String getYuangongNo() {
		return yuangongNo;
	}
	public void setYuangongNo(String yuangongNo) {
		this.yuangongNo = yuangongNo;
	}
	public int getSupposeChuqin() {
		return supposeChuqin;
	}
	public void setSupposeChuqin(int supposeChuqin) {
		this.supposeChuqin = supposeChuqin;
	}
	public int getActualChuqin() {
		return actualChuqin;
	}
	public void setActualChuqin(int actualChuqin) {
		this.actualChuqin = actualChuqin;
	}
	public int getQueqin() {
		return queqin;
	}
	public void setQueqin(int queqin) {
		this.queqin = queqin;
	}
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	
	

	
	public KaoQinSum(int kaoQinSumId, String month, int departId, String yuangongNo, int supposeChuqin,
			int actualChuqin, int queqin, int overtime) {
		super();
		this.kaoQinSumId = kaoQinSumId;
		this.month = month;
		this.departId = departId;
		this.yuangongNo = yuangongNo;
		this.supposeChuqin = supposeChuqin;
		this.actualChuqin = actualChuqin;
		this.queqin = queqin;
		this.overtime = overtime;
	}
	public KaoQinSum(String month, int departId, String yuangongNo, int supposeChuqin,
			int actualChuqin, int queqin, int overtime) {
		super();
		this.month = month;
		this.departId = departId;
		this.yuangongNo = yuangongNo;
		this.supposeChuqin = supposeChuqin;
		this.actualChuqin = actualChuqin;
		this.queqin = queqin;
		this.
		overtime = overtime;
	}
	public KaoQinSum() {
		super();
	}
	
	

}
