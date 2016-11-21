package edu.tsinghua.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDao {
	
	static SessionFactory sessionFactory;
		
	public Session getSession(){
		return sessionFactory.openSession();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory sessionFactory) {
		BaseDao.sessionFactory = sessionFactory;
	}

}
