package edu.tsinghua.entity;

public class AnLiZhanShi {
	private int anliId;          //编号
	private String anLiTime;     //时间
	private String anLiName;     //案例名
	private String anLiMiaoShu;  //案例描述
	
	public int getAnliId() {
		return anliId;
	}
	public void setAnliId(int anliId) {
		this.anliId = anliId;
	}
	
	public String getAnLiTime() {
		return anLiTime;
	}
	public void setAnLiTime(String anLiTime) {
		this.anLiTime = anLiTime;
	}
	public String getAnLiName() {
		return anLiName;
	}
	public void setAnLiName(String anLiName) {
		this.anLiName = anLiName;
	}
	public String getAnLiMiaoShu() {
		return anLiMiaoShu;
	}
	public void setAnLiMiaoShu(String anLiMiaoShu) {
		this.anLiMiaoShu = anLiMiaoShu;
	}
	
	public AnLiZhanShi(String anLiTime, String anLiName, String anLiMiaoShu) {
		super();
		this.anLiTime = anLiTime;
		this.anLiName = anLiName;
		this.anLiMiaoShu = anLiMiaoShu;
	}
	
	public AnLiZhanShi() {
		super();
	}
	
	public AnLiZhanShi(int anliId, String anLiTime, String anLiName, String anLiMiaoShu) {
		super();
		this.anliId = anliId;
		this.anLiTime = anLiTime;
		this.anLiName = anLiName;
		this.anLiMiaoShu = anLiMiaoShu;
	}

}
