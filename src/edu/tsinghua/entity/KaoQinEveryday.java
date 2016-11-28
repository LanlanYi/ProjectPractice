package edu.tsinghua.entity;

public class KaoQinEveryday {
	
	private int kaoQinId;         //考勤编号
	private int yuanGongId;       //员工编号
	private String daKaTime;  //上班时间
	//private String xiaBanTime;    //下班时间
	public int getKaoQinId() {
		return kaoQinId;
	}
	public void setKaoQinId(int kaoQinId) {
		this.kaoQinId = kaoQinId;
	}
	public int getYuanGongId() {
		return yuanGongId;
	}
	public void setYuanGongId(int yuanGongId) {
		this.yuanGongId = yuanGongId;
	}
	public String getDaKaTime() {
		return daKaTime;
	}
	public void setDaKaTime(String daKaTime) {
		this.daKaTime = daKaTime;
	}
	public KaoQinEveryday(int kaoQinId, int yuanGongId, String daKaTime) {
		super();
		this.kaoQinId = kaoQinId;
		this.yuanGongId = yuanGongId;
		this.daKaTime = daKaTime;
	}
	public KaoQinEveryday() {
		super();
	}
	
	
	
}
