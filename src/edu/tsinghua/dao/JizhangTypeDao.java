package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import edu.tsinghua.entity.JiZhangHuoDongInfo;

public class JizhangTypeDao extends BaseDao{
	
	/**
	 * 查询对应的活动类型
	 * 
	public String getZhangmuType(int jizhangTypeId){

		Session session = sessionFactory.getCurrentSession();
		
		String sql = "select jizhangName from jizhanghuodonginfo where jizhangId=?";
		
		//Query query = session.createQuery(sql);
		
		SQLQuery query = session.createSQLQuery(sql);//.addEntity(JiZhangHuoDongInfo.class);
		query.setParameter(1, jizhangTypeId);

        
		return getZhangmu;
	}*/
}
