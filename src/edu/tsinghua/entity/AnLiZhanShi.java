package edu.tsinghua.entity;

public class AnLiZhanShi {
	String anLiTime;
	String anLiName;
	String anLiMiaoShu;
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
	
	

}
