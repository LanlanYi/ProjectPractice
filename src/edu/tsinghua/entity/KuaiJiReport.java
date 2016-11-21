package edu.tsinghua.entity;

public class KuaiJiReport {
	
	private int kuaijiReportId;  //会计工作汇报编号
	private int kuaijiId;        //会计的编号
	private String time;         //汇报中整理的时间
	private int jizhangId;       //记账活动类型编号
	private double amount;       //金额
	private double jieyu;        //结余
	private String reply;        //老板写的回复
	private String status;       //汇报的状态（未审核/已审核/不通过）
	
	public int getKuaijiReportId() {
		return kuaijiReportId;
	}
	public void setKuaijiReportId(int kuaijiReportId) {
		this.kuaijiReportId = kuaijiReportId;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public KuaiJiReport(int kuaijiReportId, int kuaijiId, String time, int jizhangId, double amount, double jieyu,
			String reply, String status) {
		super();
		this.kuaijiReportId = kuaijiReportId;
		this.kuaijiId = kuaijiId;
		this.time = time;
		this.jizhangId = jizhangId;
		this.amount = amount;
		this.jieyu = jieyu;
		this.reply = reply;
		this.status = status;
	}
	
	public KuaiJiReport(int kuaijiId, String time, int jizhangId, double amount, double jieyu,
			String reply, String status) {
		super();
		this.kuaijiId = kuaijiId;
		this.time = time;
		this.jizhangId = jizhangId;
		this.amount = amount;
		this.jieyu = jieyu;
		this.reply = reply;
		this.status = status;
	}
	
	public KuaiJiReport() {
		super();
	}
	
	

}
