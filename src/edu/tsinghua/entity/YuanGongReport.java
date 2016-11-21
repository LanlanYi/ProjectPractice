package edu.tsinghua.entity;

public class YuanGongReport {
	
	private int yuangongReportId;  //经理工作汇报编号
	private int yuangongId;        //员工的编号
	private int jingliId;          //经理的编号
	private String content;        //员工写的内容
	private String reply;          //经理写的回复
	private String status;         //汇报的状态（未审核/已审核/不通过）
	
	public int getYuangongReportId() {
		return yuangongReportId;
	}
	public void setYuangongReportId(int yuangongReportId) {
		this.yuangongReportId = yuangongReportId;
	}
	public int getYuangongId() {
		return yuangongId;
	}
	public void setYuangongId(int yuangongId) {
		this.yuangongId = yuangongId;
	}
	public int getJingliId() {
		return jingliId;
	}
	public void setJingliId(int jingliId) {
		this.jingliId = jingliId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	
	public YuanGongReport(int yuangongReportId, int yuangongId, int jingliId, String content, String reply,
			String status) {
		super();
		this.yuangongReportId = yuangongReportId;
		this.yuangongId = yuangongId;
		this.jingliId = jingliId;
		this.content = content;
		this.reply = reply;
		this.status = status;
	}
	
	public YuanGongReport(int yuangongId, int jingliId, String content, String reply,
			String status) {
		super();
		this.yuangongId = yuangongId;
		this.jingliId = jingliId;
		this.content = content;
		this.reply = reply;
		this.status = status;
	}
	
	public YuanGongReport() {
		super();
	}

}
