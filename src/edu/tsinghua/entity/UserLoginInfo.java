package edu.tsinghua.entity;

public class UserLoginInfo {
	
	private int loginId;      //±‡∫≈
	private String username;  //”√ªß√˚
	private String userPwd;   //√‹¬Î
	
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public UserLoginInfo(int loginId, String username, String userPwd) {
		super();
		this.loginId = loginId;
		this.username = username;
		this.userPwd = userPwd;
	}
	
	public UserLoginInfo(String username, String userPwd) {
		super();
		this.username = username;
		this.userPwd = userPwd;
	}
	
	public UserLoginInfo() {
		super();
	}

}
