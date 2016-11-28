package edu.tsinghua.biz;

import java.util.List;

import edu.tsinghua.dao.KuaijiReportDao;
import edu.tsinghua.entity.KuaiJiReport;

public class KuaijiReportBiz {
	KuaijiReportDao kuaijiReportDao;
	
	/**
	 * 查询所有记录
	 * */
	public List<KuaiJiReport> getAll(){
		return kuaijiReportDao.getAll();
	}
	
	/**
	 * 只查询未审批的报告
	 * */
	public List<KuaiJiReport> getUncheck(){
		return kuaijiReportDao.getUncheck();
	}
	
	/**
	 * 删除
	 * */
	public void deleteOne(KuaiJiReport kuaiJiReport){
		kuaijiReportDao.deleteOne(kuaiJiReport);
	}
	
	/**
	 * 新增
	 * */
	public void insertOne(KuaiJiReport kuaiJiReport){
		kuaijiReportDao.insertOne(kuaiJiReport);
	}
	
	/**
	 *更新
	 * */
	public void updateOne(KuaiJiReport kuaiJiReport){
		kuaijiReportDao.updateOne(kuaiJiReport);
	}
	
	/**
	 * 查看一条记录
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
