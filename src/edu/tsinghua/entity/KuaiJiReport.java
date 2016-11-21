package edu.tsinghua.entity;

public class KuaiJiReport {
	
	private int kuaijiReportId;  //��ƹ����㱨���
	private int kuaijiId;        //��Ƶı��
	private String time;         //�㱨�������ʱ��
	private int jizhangId;       //���˻���ͱ��
	private double amount;       //���
	private double jieyu;        //����
	private String reply;        //�ϰ�д�Ļظ�
	private String status;       //�㱨��״̬��δ���/�����/��ͨ����
	
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
