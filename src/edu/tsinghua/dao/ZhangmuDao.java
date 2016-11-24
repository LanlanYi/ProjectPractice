package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.tsinghua.entity.ZhangMuInfo;

public class ZhangmuDao extends BaseDao {
	
	/**
	 * ��ѯ���м�¼
	 * */
	public List<ZhangMuInfo> getAll(){
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from ZhangMuInfo");
		List<ZhangMuInfo> zhangmuList = query.list();
		return zhangmuList;
	}
	
	/**
	 * ɾ��
	 * */
	public void deleteOne(ZhangMuInfo zhangmu){
		Session session = sessionFactory.getCurrentSession();
		session.delete(zhangmu);
	}
	
	/**
	 * ����
	 * */
	public void insertOne(ZhangMuInfo zhangmu){
		Session session = sessionFactory.getCurrentSession();
		session.save(zhangmu);
	}
	
	/**
	 *����
	 * */
	public void updateOne(ZhangMuInfo zhangmu){
		Session session = sessionFactory.getCurrentSession();
		session.update(zhangmu);
	}
	
	/**
	 * �鿴һ����¼
	 * */
	public ZhangMuInfo getOne(ZhangMuInfo zhangmu){
		ZhangMuInfo getZhangmu = null;
		Session session = sessionFactory.openSession();
		getZhangmu = (ZhangMuInfo) session.get(ZhangMuInfo.class, zhangmu.getZhangmuId());
		return getZhangmu;
	}

}
