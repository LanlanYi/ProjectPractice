package edu.tsinghua.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.tsinghua.entity.KaoQinEveryday;
import edu.tsinghua.entity.MonthKaoQin;


public class KaoQinDao extends BaseDao{
	/*
	 * ��ȡĳԱ�����µ����п�����Ϣ
	 * **/
	public List<MonthKaoQin> getAllMonthKaoQin(int yuanGongId){
		Session session=getSession();
		String hql="from MonthKaoQin m where m.yuanGongId=:yuanGongId";
		Query query=session.createQuery(hql);
		query.setInteger("yuanGongId", yuanGongId);
		List<MonthKaoQin> monthKaoQins=query.list();
		System.out.println("��ѯ����");
		return monthKaoQins;
	}
	/**
	 * �洢Ա��ÿ�δ���Ϣ��KaoQinEveryday��
	 * */
	public void saveKaoQinInfo(KaoQinEveryday kaoQinInfo){
		Session session=sessionFactory.getCurrentSession();
		session.save(kaoQinInfo);
		
	}
	/**
	 * KaoQinEveryday���ȡ���մ���Ϣ
	 * */
	public List<KaoQinEveryday> getCurrentDayKaoQinInfo(int yuanGongId){
		Session session=getSession();
		String currentDate=edu.tsinghua.helper.DateHelper.getTodayFormat(new Date());//��ȡ��ǰ���ڣ���-��-�ո�ʽ
		String hql="from KaoQinEveryday k where k.yuanGongId=:yuanGongId and k.daKaTime like:currentDate1";
		Query query=session.createQuery(hql);
		query.setInteger("yuanGongId", yuanGongId);
		query.setString("currentDate1", "%"+currentDate+"%");
		List<KaoQinEveryday> todayDaKas=query.list();
		System.out.println("��ѯ���մ���Ϣ����");
		return todayDaKas;
	}
	/**
	 * �洢�����ϰ����Ϣ��MonthKaoQin����
	 * */
	public void saveShangBanDaKa(MonthKaoQin monthKaoQin){
		Session session=sessionFactory.getCurrentSession();
		session.save(monthKaoQin);
	}
	/**
	 * �洢�����°����Ϣ��MonthKaoQin����
	 * */
	public void saveXiaBanDaKa(String time){
		MonthKaoQin monthKaoQin=new MonthKaoQin();
		Session session=sessionFactory.getCurrentSession();
		//Query query=session.createQuery("FROM MonthKaoQin k ORDER BY k.monthKaoQinId DESC LIMIT 1");
		Query query=session.createQuery("FROM MonthKaoQin k ORDER BY k.monthKaoQinId desc");
		query.setFirstResult(0);
		query.setMaxResults(1);//ȡ1��
		List<MonthKaoQin> monthKaoQin1=query.list();
		System.out.println("monthKaoQin1="+monthKaoQin1.get(0)+"--"+monthKaoQin1.get(0).getMonthKaoQinId());
		
		monthKaoQin.setMonthKaoQinId(monthKaoQin1.get(0).getMonthKaoQinId());
		monthKaoQin.setYuanGongId(monthKaoQin1.get(0).getYuanGongId());
		monthKaoQin.setMonthShangBanTime(monthKaoQin1.get(0).getMonthShangBanTime());
		monthKaoQin.setMonthXiaBanTime(time);
		//String hql="update monthkaoqin m set m.monthXiaBanTime =:monthXiaBanTime  ORDER BY m.monthKaoQinId DESC LIMIT 1";
		//session.update(arg0, arg1);
		//Session session1=sessionFactory.getCurrentSession();
	//	session1.update(monthKaoQin);
		session.merge(monthKaoQin);
	}

}
