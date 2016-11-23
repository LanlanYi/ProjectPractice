package edu.tsinghua.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
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
		session.put("zhangmu1", zhangmuInfo);
		if(op == 1){
			//查看当前文章
			return "show";
		}else{		
			return SUCCESS;
		}
	}
	
	public String insertOrUpdate(){
		
		if(zhangmu.getZhangmuId() == 0) {
			zhangmuBiz.insertOne(zhangmu);
			zhangmu = new ZhangMuInfo();
		} else {
			zhangmuBiz.updateOne(zhangmu);
			session.remove("zhangmu1");//jsp页面不显现被修改的数据
			zhangmu = new ZhangMuInfo();
		}
		return SUCCESS;
	}

}
