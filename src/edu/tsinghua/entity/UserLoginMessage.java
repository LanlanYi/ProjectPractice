package edu.tsinghua.entity;

public class UserLoginMessage {
	
	private int userId;
	private String username;
	private String userPwd;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	
	public UserLoginMessage(int userId, String username, String userPwd) {
		super();
		this.userId = userId;
		this.username = username;
		this.userPwd = userPwd;
	}
	
	public UserLoginMessage(String username, String userPwd) {
		super();
		this.username = username;
		this.userPwd = userPwd;
	}
	
	public UserLoginMessage() {
		super();
	}

}
