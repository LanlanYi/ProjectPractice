package edu.tsinghua.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.web.context.request.SessionScope;

import com.opensymphony.xwork2.ActionSupport;

import edu.tsinghua.biz.UserBiz;
import edu.tsinghua.entity.User;
import edu.tsinghua.entity.UserLoginInfo;

public class LoginWhoAction extends ActionSupport implements SessionAware{
 Map<String, Object> session;
   UserBiz userBiz;
   User user =new User();

   
public Map<String, Object> getSession() {
	return session;
}

public void setSession(Map<String, Object> session) {
	this.session = session;
}

public UserBiz getUserBiz() {
	return userBiz;
}

public void setUserBiz(UserBiz userBiz) {
	this.userBiz = userBiz;
}
   
   public void login(){
	 UserLoginInfo userLogin=(UserLoginInfo) session.get(user);
	 user=userBiz.login(userLogin); 
   }


}
