package edu.tsinghua.entity;

public class UserType {
	private int typeId;       //类型编号
	private String typeName;  //员工类型名称（职位）
	
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public UserType(int typeId, String typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
	}
	
	public UserType(String typeName) {
		super();
		this.typeName = typeName;
	}
	
	public UserType() {
		super();
	}

}
