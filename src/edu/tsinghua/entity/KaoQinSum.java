package edu.tsinghua.entity;

public class KaoQinSum {
	
	private int KaoqinSumId;    //���
	private String month;       //�·�
	private int departId;       //���ű��
	private String yuangongNo;  //����
	private int supposeChuqin;  //Ӧ��������
	private int actualChuqin;   //ʵ�ʳ�������
	private int queqin;         //ȱ������
	private int overtime;       //�Ӱ�����
	
	
	public int getKaoqinSumId() {
		return KaoqinSumId;
	}
	public void setKaoqinSumId(int kaoqinSumId) {
		KaoqinSumId = kaoqinSumId;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getDepartId() {
		return departId;
	}
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	public String getYuangongNo() {
		return yuangongNo;
	}
	public void setYuangongNo(String yuangongNo) {
		this.yuangongNo = yuangongNo;
	}
	public int getSupposeChuqin() {
		return supposeChuqin;
	}
	public void setSupposeChuqin(int supposeChuqin) {
		this.supposeChuqin = supposeChuqin;
	}
	public int getActualChuqin() {
		return actualChuqin;
	}
	public void setActualChuqin(int actualChuqin) {
		this.actualChuqin = actualChuqin;
	}
	public int getQueqin() {
		return queqin;
	}
	public void setQueqin(int queqin) {
		this.queqin = queqin;
	}
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	
	
	public KaoQinSum(int kaoqinSumId, String month, int departId, String yuangongNo, int supposeChuqin,
			int actualChuqin, int queqin, int overtime) {
		super();
		KaoqinSumId = kaoqinSumId;
		this.month = month;
		this.departId = departId;
		this.yuangongNo = yuangongNo;
		this.supposeChuqin = supposeChuqin;
		this.actualChuqin = actualChuqin;
		this.queqin = queqin;
		this.overtime = overtime;
	}
	
	public KaoQinSum(String month, int departId, String yuangongNo, int supposeChuqin,
			int actualChuqin, int queqin, int overtime) {
		super();
		this.month = month;
		this.departId = departId;
		this.yuangongNo = yuangongNo;
		this.supposeChuqin = supposeChuqin;
		this.actualChuqin = actualChuqin;
		this.queqin = queqin;
		this.
		overtime = overtime;
	}
	public KaoQinSum() {
		super();
	}
	

}
