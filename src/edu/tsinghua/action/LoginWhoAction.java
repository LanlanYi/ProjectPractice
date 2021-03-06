package edu.tsinghua.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.web.context.request.SessionScope;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.tsinghua.biz.UserBiz;
import edu.tsinghua.entity.User;
import edu.tsinghua.entity.UserLoginInfo;

public class LoginWhoAction extends ActionSupport {
 Map<String, Object> session;
   UserBiz userBiz;
   User user = new User();

   
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
   
   public String login(){
	 ActionContext actionContext = ActionContext.getContext(); 
     session = actionContext.getSession();
	 UserLoginInfo u = (UserLoginInfo) session.get("userLogin");
	 user=userBiz.login(u); 
	 session.put("topuser",user);
	 if(user.getTypeId() == 1){
		return "yuangong"; 
	 }else if(user.getTypeId() == 2){
		return "jingli"; 
	 }else if(user.getTypeId() == 3){
		return "kuaiji"; 
	 }else{
		return "laoban"; 
	 }
   }


}
