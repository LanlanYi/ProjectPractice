package edu.tsinghua.entity;

public class KaoQinEveryday {
	
	private int kaoQinId;         //���ڱ��
	private int yuanGongId;       //Ա�����
	private String daKaTime;  //�ϰ�ʱ��
	//private String xiaBanTime;    //�°�ʱ��
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
