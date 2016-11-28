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
	 * 获取某员工本月的所有考勤信息
	 * **/
	public String getAllMonthKaoQin(){
		//User user=(User) session.get("user");
		User user=new User();
		user.setUserId(1);
		monthKaoQins=JSONArray.fromObject(kaoQinBiz.getAllMonthKaoQin(user.getUserId()));
		System.out.println("查询结果："+monthKaoQins);
		return SUCCESS;
	}
	/**
	 * 存储员工每次打卡信息到KaoQinEveryday表
	 * */
	public String saveOneKaoQinInfo(){
		System.out.println("-----准备打卡！-----");
		daKaTime=edu.tsinghua.helper.DateHelper.getDateFormat(new Date());//获取当前系统时间
		KaoQinEveryday kaoQinInfo=new KaoQinEveryday();
		//---User user=(User) session.get("user");//获取当前用户登录信息
		//---kaoQinInfo.setYuanGongId(user.getUserId());//存储当前登录用户的Id
		kaoQinInfo.setYuanGongId(1);
		kaoQinInfo.setDaKaTime(daKaTime);//存储打卡时间
		kaoQinBiz.saveKaoQinInfo(kaoQinInfo);//存储当前用户的考勤信息
		//daKa=true;
		System.out.println("-----打卡成功！----");
		return SUCCESS;
	}
	/**
	 * 从KaoQinEverday表中查询当日的所有打卡信息
	 * */
	public String getAllTodayKaoQin(){
		System.out.println("开始查询今日所有打卡信息！");
		//User user=(User) session.get("user");
		User user=new User();//测试
		user.setUserId(1);//测试
		todayKaoQins=JSONArray.fromObject(kaoQinBiz.getCurrentDayKaoQinInfo(user.getUserId()));
		System.out.println("今日所有打卡信息查询结果："+todayKaoQins);
		return SUCCESS;
	}
	/**
	 * 存储当日最终打卡时间存储到MonthKaoQin表中
	 * */
	public String saveLastKaoQinInfo(){
		//---User user=(User) session.get("user");//获取当前用户登录信息
		MonthKaoQin monthKaoQin=new MonthKaoQin();
		User user=new User();//测试
		user.setUserId(1);//测试
		List<KaoQinEveryday> kaoQinLists=kaoQinBiz.getCurrentDayKaoQinInfo(user.getUserId());
		System.out.println("kaoQinLists.size()="+kaoQinLists.size());
		if(1==kaoQinLists.size()){
			System.out.println("kaoQinLists.size()2="+kaoQinLists.size());
			monthKaoQin.setYuanGongId(user.getUserId());
			//monthKaoQin.setMonthShangBanTime(kaoQinLists.get(0).getDaKaTime());
			monthKaoQin.setMonthShangBanTime(daKaTime);
			monthKaoQin.setMonthXiaBanTime("未打卡");
			kaoQinBiz.saveShangBanDaKa(monthKaoQin);
			System.out.println("上班打卡成功！");
		}else{
			kaoQinBiz.saveXiaBanDaKa(daKaTime);
			System.out.println("下班打卡成功！");
		}
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
