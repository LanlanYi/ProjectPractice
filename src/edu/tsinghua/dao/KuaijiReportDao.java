package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.tsinghua.entity.KuaiJiReport;

public class KuaijiReportDao extends BaseDao {
	
	/**
	 * 查询所有记录
	 * */
	public List<KuaiJiReport> getAll(){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from kuaijireport");
		List<KuaiJiReport> kuaiJiReportList = query.list();
		return kuaiJiReportList;
	}
	
	/**
	 * 只查询未审批的账目
	 * */
	public List<KuaiJiReport> getUncheck(){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from ZhangMuInfo z where z.reply = null");
		List<KuaiJiReport> uncheckedList = query.list();
		return uncheckedList;
	}
	
	/**
	 * 删除
	 * */
	public void deleteOne(KuaiJiReport kuaiJiReport){
		Session session = sessionFactory.getCurrentSession();
		session.delete(kuaiJiReport);
	}
	
	/**
	 * 新增
	 * */
	public void insertOne(KuaiJiReport kuaiJiReport){
		Session session = sessionFactory.getCurrentSession();
		session.save(kuaiJiReport);
	}
	
	/**
	 *更新
	 * */
	public void updateOne(KuaiJiReport kuaiJiReport){
		Session session = sessionFactory.getCurrentSession();
		session.update(kuaiJiReport);
	}
	
	/**
	 * 查看一条记录
	 * */
	public KuaiJiReport getOne(KuaiJiReport kuaiJiReport){
		KuaiJiReport getKuaiJiReport = null;
		Session session = sessionFactory.getCurrentSession();
		getKuaiJiReport = (KuaiJiReport) session.get(KuaiJiReport.class, kuaiJiReport.getKuaijiReportId());
		return getKuaiJiReport;
	}
	

}
