package edu.tsinghua.biz;

import java.util.List;

import edu.tsinghua.dao.ZhangmuDao;
import edu.tsinghua.entity.ZhangMuInfo;

public class ZhangmuBiz {
	
	ZhangmuDao zhangmuDao;

	/**
	 * ��ѯ���м�¼
	 * */
	public List<ZhangMuInfo> getAll(){
		return zhangmuDao.getAll();
	}
	
	/**
	 * ɾ��
	 * */
	public void deleteOne(ZhangMuInfo zhangmu){
		zhangmuDao.deleteOne(zhangmu);
	}
	
	/**
	 * ����
	 * */
	public void insertOne(ZhangMuInfo zhangmu){
		zhangmuDao.insertOne(zhangmu);
	}
	
	/**
	 *����
	 * */
	public void updateOne(ZhangMuInfo zhangmu){
		zhangmuDao.updateOne(zhangmu);
	}
	
	/**
	 * �鿴һ����¼
	 * */
	public ZhangMuInfo getOne(ZhangMuInfo zhangmu){
		return zhangmuDao.getOne(zhangmu);
	}

	public ZhangmuDao getZhangmuDao() {
		return zhangmuDao;
	}

	public void setZhangmuDao(ZhangmuDao zhangmuDao) {
		this.zhangmuDao = zhangmuDao;
	}

}
