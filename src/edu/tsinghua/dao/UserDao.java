package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.tsinghua.entity.User;
import edu.tsinghua.entity.UserLoginInfo;

public class UserDao extends BaseDao{
	
	/**
	 * 获得员工基本信息
	 * */
    public User login(UserLoginInfo userLogin){
    	User user=new User();
    	Session session=getSession();
    	String hql="select  from User u where u.loginId=:userLogin ";
    	Query query=session.createQuery(hql);
    	query.setInteger("userLogin", userLogin.getLoginId());
    	List<User> users=query.list();
    	if(users.size()==1){
    		user=(User) users;
    	}else{
    		user=null;
    	}
    	return user;
    }
}
