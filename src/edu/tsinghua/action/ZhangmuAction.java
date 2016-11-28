package edu.tsinghua.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.tsinghua.biz.ZhangmuBiz;
import edu.tsinghua.entity.ZhangMuInfo;

public class ZhangmuAction extends ActionSupport implements SessionAware, ModelDriven<ZhangMuInfo> {
	ZhangmuBiz zhangmuBiz;
	Map<String, Object> session;
	ZhangMuInfo zhangmu = new ZhangMuInfo();
	ZhangMuInfo zhangmuGet;
	int op = 0;

	@Override
	public ZhangMuInfo getModel() {
		return zhangmu;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
		
	}

	public ZhangmuBiz getZhangmuBiz() {
		return zhangmuBiz;
	}

	public void setZhangmuBiz(ZhangmuBiz zhangmuBiz) {
		this.zhangmuBiz = zhangmuBiz;
	}

	public ZhangMuInfo getZhangmu() {
		return zhangmu;
	}

	public void setZhangmu(ZhangMuInfo zhangmu) {
		this.zhangmu = zhangmu;
	}

	public ZhangMuInfo getZhangmuGet() {
		return zhangmuGet;
	}

	public void setZhangmuGet(ZhangMuInfo zhangmuGet) {
		this.zhangmuGet = zhangmuGet;
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	
	/**
	 * getall
	 * */
	public String getall(){
		List<ZhangMuInfo> zhangmuList = zhangmuBiz.getAll();
		System.out.println("zhangmuList:" + zhangmuList);
		ActionContext actionContext = ActionContext.getContext(); 
		session = actionContext.getSession(); 
		session.put("zhangmuList", zhangmuList);
		return SUCCESS;
	}

	/**
	 * delete
	 * */
	public String deleteOne(){
		zhangmuBiz.deleteOne(zhangmu);
		return SUCCESS;
	}
	

	/**
	 * updateOne
	 * */
	public String updateOne(){
		zhangmuBiz.updateOne(zhangmu);
		return SUCCESS;
	}
	
	/**
	 * getone
	 * */
	public String getOne(){
		ZhangMuInfo zhangmuInfo = zhangmuBiz.getOne(zhangmu);
		ActionContext actionContext = ActionContext.getContext();
		session = actionContext.getSession(); 
		
		session.put("zhangmu1", zhangmuInfo);
		return SUCCESS;
	}
	
	public String insertOrUpdate(){
		
		if(zhangmu.getZhangmuId() == 0) {
			
			zhangmuBiz.insertOne(zhangmu);
			zhangmu = new ZhangMuInfo();
			
		} else {
			
			ZhangMuInfo newZhangmu = zhangmuBiz.getOne(zhangmu);
			newZhangmu.setReply(zhangmu.getReply()); //Ö»¸üÐÂreply
			
			zhangmuBiz.updateOne(newZhangmu);
			
			session.remove("zhangmu1");
			zhangmu = new ZhangMuInfo();
		}
		return SUCCESS;
	}

	
}
