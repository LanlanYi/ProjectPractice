package edu.tsinghua.entity;

public class MonthKaoQin {
	private int monthKaoQinId;
	private int yuanGongId;
	private String monthShangBanTime;
	private String monthXiaBanTime;
	public int getMonthKaoQinId() {
		return monthKaoQinId;
	}
	public void setMonthKaoQinId(int monthKaoQinId) {
		this.monthKaoQinId = monthKaoQinId;
	}
	public int getYuanGongId() {
		return yuanGongId;
	}
	public void setYuanGongId(int yuanGongId) {
		this.yuanGongId = yuanGongId;
	}
	public String getMonthShangBanTime() {
		return monthShangBanTime;
	}
	public void setMonthShangBanTime(String monthShangBanTime) {
		this.monthShangBanTime = monthShangBanTime;
	}
	public String getMonthXiaBanTime() {
		return monthXiaBanTime;
	}
	public void setMonthXiaBanTime(String monthXiaBanTime) {
		this.monthXiaBanTime = monthXiaBanTime;
	}
	public MonthKaoQin(int monthKaoQinId, int yuanGongId, String monthShangBanTime, String monthXiaBanTime) {
		super();
		this.monthKaoQinId = monthKaoQinId;
		this.yuanGongId = yuanGongId;
		this.monthShangBanTime = monthShangBanTime;
		this.monthXiaBanTime = monthXiaBanTime;
	}
	public MonthKaoQin() {
		super();
	}
	
	

}
