package edu.tsinghua.helper;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
	
	/**
	 * ��ʽ����-��-�� ʱ���֣���
	 * */
	public static String  getDateFormat(Date d){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		return df.format(d);
	}
	/**
	 * ��ʽ����-��-��
	 * */
	public static String  getTodayFormat(Date d){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//�������ڸ�ʽ
		return df.format(d);
	}
	
	/*public static void main(String[] args) { 
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
		}*/
	
}
