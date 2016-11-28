package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.tsinghua.entity.ZhangMuInfo;

public class ZhangmuDao extends BaseDao {
	
	/**
	 * 查询所有记录
	 * */
	public List<ZhangMuInfo> getAll(){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from ZhangMuInfo");
		List<ZhangMuInfo> zhangmuList = query.list();
		return zhangmuList;
	}
	
	/**
	 * 只查询未审批的账目
	 * */
	public List<ZhangMuInfo> getUncheck(){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from ZhangMuInfo z where z.reply = null");
		List<ZhangMuInfo> uncheckedList = query.list();
		return uncheckedList;
	}
	
	/**
	 * 删除
	 * */
	public void deleteOne(ZhangMuInfo zhangmu){
		Session session = sessionFactory.getCurrentSession();
		session.delete(zhangmu);
	}
	
	/**
	 * 新增
	 * */
	public void insertOne(ZhangMuInfo zhangmu){
		Session session = sessionFactory.getCurrentSession();
		session.save(zhangmu);
	}
	
	/**
	 *更新
	 * */
	public void updateOne(ZhangMuInfo zhangmu){
		Session session = sessionFactory.getCurrentSession();
		session.update(zhangmu);
	}
	
	/**
	 * 查看一条记录
	 * */
	public ZhangMuInfo getOne(ZhangMuInfo zhangmu){
		ZhangMuInfo getZhangmu = null;
		Session session = sessionFactory.getCurrentSession();
		getZhangmu = (ZhangMuInfo) session.get(ZhangMuInfo.class, zhangmu.getZhangmuId());
		return getZhangmu;
	}
	

}
