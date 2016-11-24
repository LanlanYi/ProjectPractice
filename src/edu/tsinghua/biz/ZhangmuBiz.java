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
	 * 查询所有记录
	 * */
	public List<ZhangMuInfo> getAll(){
		return zhangmudao.getAll();
	}
	
	/**
	 * 删除
	 * */
	public void deleteOne(ZhangMuInfo zhangmu){
		zhangmudao.deleteOne(zhangmu);
	}
	
	/**
	 * 新增
	 * */
	public void insertOne(ZhangMuInfo zhangmu){
		zhangmudao.insertOne(zhangmu);
	}
	
	/**
	 *更新
	 * */
	public void updateOne(ZhangMuInfo zhangmu){
		zhangmudao.updateOne(zhangmu);
	}
	
	/**
	 * 查看一条记录
	 * */
	public ZhangMuInfo getOne(ZhangMuInfo zhangmu){
		System.out.println("Biz里的 zhangmu：" + zhangmu);
		System.out.println("Biz里的zhangmudao：" + zhangmudao);
		return zhangmudao.getOne(zhangmu);
	}

}
