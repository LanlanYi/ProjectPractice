package edu.tsinghua.biz;

import java.util.List;

import edu.tsinghua.dao.ZhangmuDao;
import edu.tsinghua.entity.ZhangMuInfo;

public class ZhangmuBiz {
	
	ZhangmuDao zhangmuDao;

	/**
	 * 查询所有记录
	 * */
	public List<ZhangMuInfo> getAll(){
		return zhangmuDao.getAll();
	}
	
	/**
	 * 删除
	 * */
	public void deleteOne(ZhangMuInfo zhangmu){
		zhangmuDao.deleteOne(zhangmu);
	}
	
	/**
	 * 新增
	 * */
	public void insertOne(ZhangMuInfo zhangmu){
		zhangmuDao.insertOne(zhangmu);
	}
	
	/**
	 *更新
	 * */
	public void updateOne(ZhangMuInfo zhangmu){
		zhangmuDao.updateOne(zhangmu);
	}
	
	/**
	 * 查看一条记录
	 * */
	public ZhangMuInfo getOne(ZhangMuInfo zhangmu){
		return zhangmuDao.getOne(zhangmu);
	}

	public ZhangmuDao getZhangmuDao() {
		return zhangmuDao;
	}

	public void setZhangmuDao(ZhangmuDao zhangmuDao) {
		this.zhangmuDao = zhangmuDao;
	}

}
