package edu.tsinghua.biz;

import java.util.List;

import edu.tsinghua.dao.KaoQinDao;
import edu.tsinghua.entity.KaoQinEveryday;
import edu.tsinghua.entity.MonthKaoQin;

public class KaoQinBiz {
	KaoQinDao kaoQinDao;
	/*
	 * ��ȡĳԱ�����µ����п�����Ϣ
	 * **/
	public List<MonthKaoQin> getAllMonthKaoQin(int yuanGongId){
		return kaoQinDao.getAllMonthKaoQin(yuanGongId);
		
	}
	/**
	 * �洢Ա��ÿ�δ���Ϣ��KaoQinEveryday��
	 * */
	public void saveKaoQinInfo(KaoQinEveryday kaoQinInfo){
		kaoQinDao.saveKaoQinInfo(kaoQinInfo);
	}
	/**
	 * KaoQinEveryday���ȡ���մ���Ϣ
	 * */
	public List<KaoQinEveryday> getCurrentDayKaoQinInfo(int yuanGongId){
		return kaoQinDao.getCurrentDayKaoQinInfo(yuanGongId);
	}
	/**
	 * �洢�����ϰ����Ϣ��MonthKaoQin����
	 * */
	public void saveShangBanDaKa(MonthKaoQin monthKaoQin){
		kaoQinDao.saveShangBanDaKa(monthKaoQin);
	}
	/**
	 * �洢�����°����Ϣ��MonthKaoQin����
	 * */
	public void saveXiaBanDaKa(String time){
		kaoQinDao.saveXiaBanDaKa(time);
	}
	
	public KaoQinDao getKaoQinDao() {
		return kaoQinDao;
	}
	public void setKaoQinDao(KaoQinDao kaoQinDao) {
		this.kaoQinDao = kaoQinDao;
	}
	
	

}
