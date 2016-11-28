package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.tsinghua.entity.KuaiJiReport;

public class KuaijiReportDao extends BaseDao {
	
	/**
	 * ��ѯ���м�¼
	 * */
	public List<KuaiJiReport> getAll(){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from kuaijireport");
		List<KuaiJiReport> kuaiJiReportList = query.list();
		return kuaiJiReportList;
	}
	
	/**
	 * ֻ��ѯδ��������Ŀ
	 * */
	public List<KuaiJiReport> getUncheck(){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from ZhangMuInfo z where z.reply = null");
		List<KuaiJiReport> uncheckedList = query.list();
		return uncheckedList;
	}
	
	/**
	 * ɾ��
	 * */
	public void deleteOne(KuaiJiReport kuaiJiReport){
		Session session = sessionFactory.getCurrentSession();
		session.delete(kuaiJiReport);
	}
	
	/**
	 * ����
	 * */
	public void insertOne(KuaiJiReport kuaiJiReport){
		Session session = sessionFactory.getCurrentSession();
		session.save(kuaiJiReport);
	}
	
	/**
	 *����
	 * */
	public void updateOne(KuaiJiReport kuaiJiReport){
		Session session = sessionFactory.getCurrentSession();
		session.update(kuaiJiReport);
	}
	
	/**
	 * �鿴һ����¼
	 * */
	public KuaiJiReport getOne(KuaiJiReport kuaiJiReport){
		KuaiJiReport getKuaiJiReport = null;
		Session session = sessionFactory.getCurrentSession();
		getKuaiJiReport = (KuaiJiReport) session.get(KuaiJiReport.class, kuaiJiReport.getKuaijiReportId());
		return getKuaiJiReport;
	}
	

}
