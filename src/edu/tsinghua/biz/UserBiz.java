package edu.tsinghua.biz;

import edu.tsinghua.dao.UserDao;
import edu.tsinghua.entity.User;
import edu.tsinghua.entity.UserLoginInfo;

public class UserBiz {
  UserDao userDao;

public UserDao getUserDao() {
	return userDao;
}

public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
}
  
  /**
   *���Ա��������Ϣ 
   * */
  public User login(UserLoginInfo userLogin){
	  return userDao.login(userLogin);
  }
}
