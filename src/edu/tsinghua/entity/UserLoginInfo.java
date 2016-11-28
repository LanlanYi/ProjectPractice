package edu.tsinghua.entity;

public class UserLoginInfo {
	
	private int loginId;      //±‡∫≈
	private String userName;  //”√ªß√˚
	private String userPwd;   //√‹¬Î
	
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public UserLoginInfo(int loginId, String userName, String userPwd) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.userPwd = userPwd;
	}
	
	public UserLoginInfo(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}
	
	public UserLoginInfo() {
		super();
	}

}
