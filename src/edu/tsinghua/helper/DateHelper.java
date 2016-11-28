package edu.tsinghua.helper;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
	
	/**
	 * 格式：年-月-日 时：分：秒
	 * */
	public static String  getDateFormat(Date d){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		return df.format(d);
	}
	/**
	 * 格式：年-月-日
	 * */
	public static String  getTodayFormat(Date d){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		return df.format(d);
	}
	
	/*public static void main(String[] args) { 
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		}*/
	
}
