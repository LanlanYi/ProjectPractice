package edu.tsinghua.biz;

import edu.tsinghua.dao.UserLoginInfoDao;
import edu.tsinghua.entity.UserLoginInfo;

public class UserLoginInfoBiz {

	UserLoginInfoDao userLoginDao=new UserLoginInfoDao();
	
	public UserLoginInfoDao getuserLogin() {
		return userLoginDao;
	}

	public void setuserLogin(UserLoginInfoDao userLogin) {
		this.userLoginDao = userLogin;
	}

	/**
	 * ��¼
	 * */
	public UserLoginInfo login(UserLoginInfo user){
		System.out.println("biz login");
		System.out.println("userLoginDao:" +user);
		return userLoginDao.login(user);
	
   }
}