package edu.tsinghua.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.tsinghua.biz.KaoQinBiz;
import edu.tsinghua.dao.KaoQinDao;
import edu.tsinghua.entity.KaoQinEveryday;
import edu.tsinghua.entity.MonthKaoQin;
import edu.tsinghua.entity.User;
import net.sf.json.JSONArray;

public class KaoQinAction extends ActionSupport implements SessionAware{
	Map<String, Object> session;
	//KaoQinBiz kaoQinBiz=new KaoQinBiz();
	KaoQinBiz kaoQinBiz;
	List<MonthKaoQin> monthKaoQins;
	List<KaoQinEveryday> todayKaoQins;
	//boolean daKa=false;
	String daKaTime;
	//KaoQinEveryday kaoQinInfo;
	
	
	/*
	 * ��ȡĳԱ�����µ����п�����Ϣ
	 * **/
	public String getAllMonthKaoQin(){

		User user=(User) session.get("topuser");
		//User user=new User();
		//user.setUserId(1);
		monthKaoQins=JSONArray.fromObject(kaoQinBiz.getAllMonthKaoQin(user.getUserId()));
		System.out.println("��ѯ�����"+monthKaoQins);
		return SUCCESS;
	}
	/**
	 * �洢Ա��ÿ�δ���Ϣ��KaoQinEveryday��
	 * */
	public String saveOneKaoQinInfo(){
		System.out.println("-----׼���򿨣�-----");
		daKaTime=edu.tsinghua.helper.DateHelper.getDateFormat(new Date());//��ȡ��ǰϵͳʱ��
		KaoQinEveryday kaoQinInfo=new KaoQinEveryday();
		User user=(User) session.get("topuser");//��ȡ��ǰ�û���¼��Ϣ
		kaoQinInfo.setYuanGongId(user.getUserId());//�洢��ǰ��¼�û���Id
		//kaoQinInfo.setYuanGongId(1);
		kaoQinInfo.setDaKaTime(daKaTime);//�洢��ʱ��
		kaoQinBiz.saveKaoQinInfo(kaoQinInfo);//�洢��ǰ�û��Ŀ�����Ϣ
		//daKa=true;
		System.out.println("-----�򿨳ɹ���----");
		return SUCCESS;
	}
	/**
	 * ��KaoQinEverday���в�ѯ���յ����д���Ϣ
	 * */
	public String getAllTodayKaoQin(){
		System.out.println("��ʼ��ѯ�������д���Ϣ��");
		User user=(User) session.get("topuser");
		//User user=new User();//����
		//user.setUserId(1);//����
		todayKaoQins=JSONArray.fromObject(kaoQinBiz.getCurrentDayKaoQinInfo(user.getUserId()));
		System.out.println("�������д���Ϣ��ѯ�����"+todayKaoQins);
		return SUCCESS;
	}

	
	public KaoQinBiz getKaoQinBiz() {
		return kaoQinBiz;
	}
	public void setKaoQinBiz(KaoQinBiz kaoQinBiz) {
		this.kaoQinBiz = kaoQinBiz;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
		
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public List<MonthKaoQin> getMonthKaoQins() {
		return monthKaoQins;
	}
	public void setMonthKaoQins(List<MonthKaoQin> monthKaoQins) {
		this.monthKaoQins = monthKaoQins;
	}
	public List<KaoQinEveryday> getTodayKaoQins() {
		return todayKaoQins;
	}
	public void setTodayKaoQins(List<KaoQinEveryday> todayKaoQins) {
		this.todayKaoQins = todayKaoQins;
	}
	
	
	
	
	
	
	
	
}
