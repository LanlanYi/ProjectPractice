package edu.tsinghua.entity;

public class JiZhangHuoDongInfo {
	
	private int jizhangId;       //���˻���ͱ��
	private String jizhangName;  //���˻��������
	
	public int getJizhangId() {
		return jizhangId;
	}
	public void setJizhangId(int jizhangId) {
		this.jizhangId = jizhangId;
	}
	public String getJizhangName() {
		return jizhangName;
	}
	public void setJizhangName(String jizhangName) {
		this.jizhangName = jizhangName;
	}
	
	public JiZhangHuoDongInfo(int jizhangId, String jizhangName) {
		super();
		this.jizhangId = jizhangId;
		this.jizhangName = jizhangName;
	}
	
	public JiZhangHuoDongInfo(String jizhangName) {
		super();
		this.jizhangName = jizhangName;
	}
	
	public JiZhangHuoDongInfo() {
		super();
	}

}
