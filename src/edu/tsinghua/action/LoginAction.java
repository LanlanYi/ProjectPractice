package edu.tsinghua.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.tsinghua.biz.UserLoginInfoBiz;
import edu.tsinghua.entity.UserLoginInfo;

public class LoginAction extends ActionSupport implements SessionAware,ModelDriven<UserLoginInfo>{

	/**
	 *  Ù–‘
	 * */
	Map<String,Object> session;
	UserLoginInfo user=new UserLoginInfo();
	UserLoginInfoBiz userLoginBiz;
	
	


   
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	



	public UserLoginInfoBiz getUserLoginBiz() {
		return userLoginBiz;
	}

	public void setUserLoginBiz(UserLoginInfoBiz userLoginBiz) {
		this.userLoginBiz = userLoginBiz;
	}

	public String login(){
		UserLoginInfo u=userLoginBiz.login(user);
		if(u==null){
			return LOGIN;
		}
		session.put("user", u);
		return SUCCESS;
	}
	
	
	
	@Override
	public UserLoginInfo getModel() {
		return user;
	}
	
}
