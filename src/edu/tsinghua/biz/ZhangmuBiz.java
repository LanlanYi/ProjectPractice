package edu.tsinghua.biz;

import java.util.List;

import edu.tsinghua.dao.ZhangmuDao;
import edu.tsinghua.entity.ZhangMuInfo;

public class ZhangmuBiz {
	
	ZhangmuDao zhangmudao = new ZhangmuDao();

	public ZhangmuDao getZhangmudao() {
		return zhangmudao;
	}

	public void setZhangmudao(ZhangmuDao zhangmudao) {
		this.zhangmudao = zhangmudao;
	}
	
	/**
	 * ��ѯ���м�¼
	 * */
	public List<ZhangMuInfo> getAll(){
		return zhangmudao.getAll();
	}
	
	/**
	 * ɾ��
	 * */
	public void deleteOne(ZhangMuInfo zhangmu){
		zhangmudao.deleteOne(zhangmu);
	}
	
	/**
	 * ����
	 * */
	public void insertOne(ZhangMuInfo zhangmu){
		zhangmudao.insertOne(zhangmu);
	}
	
	/**
	 *����
	 * */
	public void updateOne(ZhangMuInfo zhangmu){
		zhangmudao.updateOne(zhangmu);
	}
	
	/**
	 * �鿴һ����¼
	 * */
	public ZhangMuInfo getOne(ZhangMuInfo zhangmu){
		System.out.println("Biz��� zhangmu��" + zhangmu);
		System.out.println("Biz���zhangmudao��" + zhangmudao);
		return zhangmudao.getOne(zhangmu);
	}

}
