package edu.tsinghua.entity;

public class ZhangMuInfo {
	
	private int zhangmuId;  //账目编号
	private int kuaijiId;   //操作会计的编号
	private String time;    //账目的时间
	private int jizhangId;  //记账活动类型编号
	private double amount;  //金额
	private double jieyu;   //结余
	private String reply;   //老板写的回复
	
	public int getZhangmuId() {
		return zhangmuId;
	}
	public void setZhangmuId(int zhangmuId) {
		this.zhangmuId = zhangmuId;
	}
	public int getKuaijiId() {
		return kuaijiId;
	}
	public void setKuaijiId(int kuaijiId) {
		this.kuaijiId = kuaijiId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getJizhangId() {
		return jizhangId;
	}
	public void setJizhangId(int jizhangId) {
		this.jizhangId = jizhangId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getJieyu() {
		return jieyu;
	}
	public void setJieyu(double jieyu) {
		this.jieyu = jieyu;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	
	public ZhangMuInfo(int zhangmuId, int kuaijiId, String time, int jizhangId, double amount, double jieyu,
			String reply) {
		super();
		this.zhangmuId = zhangmuId;
		this.kuaijiId = kuaijiId;
		this.time = time;
		this.jizhangId = jizhangId;
		this.amount = amount;
		this.jieyu = jieyu;
		this.reply = reply;
	}
	
	public ZhangMuInfo( int kuaijiId, String time, int jizhangId, double amount, double jieyu,
			String reply) {
		super();
		this.kuaijiId = kuaijiId;
		this.time = time;
		this.jizhangId = jizhangId;
		this.amount = amount;
		this.jieyu = jieyu;
		this.reply = reply;
	}
	
	public ZhangMuInfo() {
		super();
	}

}
