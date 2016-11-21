package edu.tsinghua.entity;

public class KaoQinEveryday {
	
	private int kaoqinId;         //���ڱ��
	private int yuangongId;       //Ա�����
	private String shangbanTime;  //�ϰ�ʱ��
	private String xiabanTime;    //�°�ʱ��
	
	public int getKaoqinId() {
		return kaoqinId;
	}
	public void setKaoqinId(int kaoqinId) {
		this.kaoqinId = kaoqinId;
	}
	public int getYuangongId() {
		return yuangongId;
	}
	public void setYuangongId(int yuangongId) {
		this.yuangongId = yuangongId;
	}
	public String getShangbanTime() {
		return shangbanTime;
	}
	public void setShangbanTime(String shangbanTime) {
		this.shangbanTime = shangbanTime;
	}
	public String getXiabanTime() {
		return xiabanTime;
	}
	public void setXiabanTime(String xiabanTime) {
		this.xiabanTime = xiabanTime;
	}
	
	public KaoQinEveryday(int kaoqinId, int yuangongId, String shangbanTime, String xiabanTime) {
		super();
		this.kaoqinId = kaoqinId;
		this.yuangongId = yuangongId;
		this.shangbanTime = shangbanTime;
		this.xiabanTime = xiabanTime;
	}
	
	public KaoQinEveryday(int yuangongId, String shangbanTime, String xiabanTime) {
		super();
		this.yuangongId = yuangongId;
		this.shangbanTime = shangbanTime;
		this.xiabanTime = xiabanTime;
	}

	public KaoQinEveryday() {
		super();
	}
}
