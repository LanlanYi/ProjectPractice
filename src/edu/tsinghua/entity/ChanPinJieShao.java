package edu.tsinghua.entity;

public class ChanPinJieShao {

	String chanPinTime;
	String chanPinName;
	String chanPinMiaoShu;
	public String getChanPinTime() {
		return chanPinTime;
	}
	public void setChanPinTime(String chanPinTime) {
		this.chanPinTime = chanPinTime;
	}
	public String getChanPinName() {
		return chanPinName;
	}
	public void setChanPinName(String chanPinName) {
		this.chanPinName = chanPinName;
	}
	public String getChanPinMiaoShu() {
		return chanPinMiaoShu;
	}
	public void setChanPinMiaoShu(String chanPinMiaoShu) {
		this.chanPinMiaoShu = chanPinMiaoShu;
	}
	public ChanPinJieShao(String chanPinTime, String chanPinName, String chanPinMiaoShu) {
		super();
		this.chanPinTime = chanPinTime;
		this.chanPinName = chanPinName;
		this.chanPinMiaoShu = chanPinMiaoShu;
	}
	public ChanPinJieShao() {
		super();
	}
	
	
}
