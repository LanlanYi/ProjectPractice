package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.tsinghua.entity.UserLoginInfo;

public class UserLoginInfoDao extends BaseDao{
	/**
	 * ��¼
	 * */
	public UserLoginInfo login(UserLoginInfo userLogin){
		System.out.println(userLogin.getLoginId());
		Session session=getSession();
		String hql="from UserLoginInfo u where u.userName=:uname and u.userPwd=:upwd";
		Query query=session.createQuery(hql);
		System.out.println("123");
		query.setString("uname",userLogin.getUserName());
		query.setString("upwd", userLogin.getUserPwd());
		List<UserLoginInfo> users=query.list();
		if(users.size()==1){
			userLogin=users.get(0);
		}else{
			userLogin=null;
		}
		
		return userLogin;
		
	}
	

	

}
