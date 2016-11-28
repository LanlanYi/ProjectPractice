package edu.tsinghua.biz;

import java.util.List;

import edu.tsinghua.dao.KaoQinDao;
import edu.tsinghua.entity.KaoQinEveryday;
import edu.tsinghua.entity.MonthKaoQin;

public class KaoQinBiz {
	KaoQinDao kaoQinDao;
	/*
	 * 获取某员工本月的所有考勤信息
	 * **/
	public List<MonthKaoQin> getAllMonthKaoQin(int yuanGongId){
		return kaoQinDao.getAllMonthKaoQin(yuanGongId);
		
	}
	/**
	 * 存储员工每次打卡信息到KaoQinEveryday表
	 * */
	public void saveKaoQinInfo(KaoQinEveryday kaoQinInfo){
		kaoQinDao.saveKaoQinInfo(kaoQinInfo);
	}
	/**
	 * KaoQinEveryday表获取当日打卡信息
	 * */
	public List<KaoQinEveryday> getCurrentDayKaoQinInfo(int yuanGongId){
		return kaoQinDao.getCurrentDayKaoQinInfo(yuanGongId);
	}
	/**
	 * 存储当日上班打卡信息到MonthKaoQin表中
	 * */
	public void saveShangBanDaKa(MonthKaoQin monthKaoQin){
		kaoQinDao.saveShangBanDaKa(monthKaoQin);
	}
	/**
	 * 存储当日下班打卡信息到MonthKaoQin表中
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
