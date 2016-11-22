package edu.tsinghua.biz;

import edu.tsinghua.dao.UserLoginInfoDao;
import edu.tsinghua.entity.User;
import edu.tsinghua.entity.UserLoginInfo;

public class UserLoginInfoBiz {

	UserLoginInfoDao userLoginDao;
	
	public UserLoginInfoDao getuserLogin() {
		return userLoginDao;
	}

	public void setuserLogin(UserLoginInfoDao userLogin) {
		this.userLoginDao = userLogin;
	}

	/**
	 * µÇÂ¼
	 * */
	public UserLoginInfo login(UserLoginInfo user){
		return userLoginDao.login(user);
	
   }
}