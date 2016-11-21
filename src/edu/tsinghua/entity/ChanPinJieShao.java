package edu.tsinghua.entity;

public class ChanPinJieShao {
	private int chanpinId;           //编号
	private String chanPinTime;      //时间
	private String chanPinName;      //产品名
	private String chanPinMiaoShu;   //产品描述
	
	public int getChanpinId() {
		return chanpinId;
	}
	public void setChanpinId(int chanpinId) {
		this.chanpinId = chanpinId;
	}
	
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
	
	public ChanPinJieShao(int chanpinId, String chanPinTime, String chanPinName, String chanPinMiaoShu) {
		super();
		this.chanpinId = chanpinId;
		this.chanPinTime = chanPinTime;
		this.chanPinName = chanPinName;
		this.chanPinMiaoShu = chanPinMiaoShu;
	}

}
