package edu.tsinghua.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.tsinghua.biz.KuaijiReportBiz;
import edu.tsinghua.entity.KuaiJiReport;

public class KuaijiReportAction  extends ActionSupport implements SessionAware, ModelDriven<KuaiJiReport> {
	KuaijiReportBiz kuaijiReportBiz;
	Map<String, Object> session;
	KuaiJiReport kuaiJiReport = new KuaiJiReport();
	KuaiJiReport kuaiJiReportGet;
	int op = 0;

	@Override
	public KuaiJiReport getModel() {
		return kuaiJiReport;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	public KuaijiReportBiz getKuaiJiReportBiz() {
		return kuaijiReportBiz;
	}

	public void setKuaiJiReportBiz(KuaijiReportBiz kuaijiReportBiz) {
		this.kuaijiReportBiz = kuaijiReportBiz;
	}

	public KuaiJiReport getKuaiJiReport() {
		return kuaiJiReport;
	}

	public void setKuaiJiReport(KuaiJiReport kuaiJiReport) {
		this.kuaiJiReport = kuaiJiReport;
	}

	public KuaiJiReport getKuaiJiReportGet() {
		return kuaiJiReportGet;
	}

	public void setKuaiJiReportGet(KuaiJiReport kuaiJiReportGet) {
		this.kuaiJiReportGet = kuaiJiReportGet;
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
		System.out.print("kuaiJiReportBiz:" + kuaijiReportBiz);
		List<KuaiJiReport> kuaiJiReportList = kuaijiReportBiz.getAll();
		ActionContext actionContext = ActionContext.getContext(); 
		session = actionContext.getSession(); 
		session.put("kuaiJiReportList", kuaiJiReportList);
		return SUCCESS;
	}
	
	/**
	 * getUnchecked
	 * 
	public String getUncheckZhangmu(){
		List<KuaiJiReport> zhangmuList = kuaiJiReportBiz.getUncheck();
		ActionContext actionContext = ActionContext.getContext(); 
		session = actionContext.getSession(); 
		session.put("zhangmuList", zhangmuList);
		return SUCCESS;
	}*/

	/**
	 * delete
	 * */
	public String deleteOne(){
		kuaijiReportBiz.deleteOne(kuaiJiReport);
		return SUCCESS;
	}
	
	/**
	 * updateOne
	 * */
	public String updateOne(){
		kuaijiReportBiz.updateOne(kuaiJiReport);
		return SUCCESS;
	}
	
	/**
	 * getone
	 * */
	public String getOne(){
		KuaiJiReport kuaiJiReportInfo = kuaijiReportBiz.getOne(kuaiJiReport);
		ActionContext actionContext = ActionContext.getContext();
		session = actionContext.getSession(); 
		
		session.put("kuaiJiReport1", kuaiJiReportInfo);
		return SUCCESS;
	}
	
	public String insertOrUpdate(){
		
		if(kuaiJiReport.getKuaijiReportId() == 0) {
			
			kuaijiReportBiz.insertOne(kuaiJiReport);
			kuaiJiReport = new KuaiJiReport();
			
		} else {
			
			KuaiJiReport newKuaiJiReport = kuaijiReportBiz.getOne(kuaiJiReport);
			newKuaiJiReport.setStatus(kuaiJiReport.getStatus());
			newKuaiJiReport.setReply(kuaiJiReport.getReply()); //只更新reply和status
			
			kuaijiReportBiz.updateOne(newKuaiJiReport);
			
			session.remove("kuaiJiReport1");
			kuaiJiReport = new KuaiJiReport();
		}
		return SUCCESS;
	}

}
