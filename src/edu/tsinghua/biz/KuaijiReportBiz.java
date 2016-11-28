package edu.tsinghua.biz;

import java.util.List;

import edu.tsinghua.dao.KuaijiReportDao;
import edu.tsinghua.entity.KuaiJiReport;

public class KuaijiReportBiz {
	KuaijiReportDao kuaijiReportDao;
	
	/**
	 * ��ѯ���м�¼
	 * */
	public List<KuaiJiReport> getAll(){
		return kuaijiReportDao.getAll();
	}
	
	/**
	 * ֻ��ѯδ�����ı���
	 * */
	public List<KuaiJiReport> getUncheck(){
		return kuaijiReportDao.getUncheck();
	}
	
	/**
	 * ɾ��
	 * */
	public void deleteOne(KuaiJiReport kuaiJiReport){
		kuaijiReportDao.deleteOne(kuaiJiReport);
	}
	
	/**
	 * ����
	 * */
	public void insertOne(KuaiJiReport kuaiJiReport){
		kuaijiReportDao.insertOne(kuaiJiReport);
	}
	
	/**
	 *����
	 * */
	public void updateOne(KuaiJiReport kuaiJiReport){
		kuaijiReportDao.updateOne(kuaiJiReport);
	}
	
	/**
	 * �鿴һ����¼
	 * */
	public KuaiJiReport getOne(KuaiJiReport kuaiJiReport){
		return kuaijiReportDao.getOne(kuaiJiReport);
	}

	public KuaijiReportDao getKuaijiReportDao() {
		return kuaijiReportDao;
	}

	public void setKuaijiReportDao(KuaijiReportDao kuaijiReportDao) {
		this.kuaijiReportDao = kuaijiReportDao;
	}
}
