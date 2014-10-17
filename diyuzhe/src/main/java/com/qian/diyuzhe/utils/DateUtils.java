package com.qian.diyuzhe.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

 /***********
  * 常用工具类
  * @author 千帐灯
  * @file  DateUtils.java
  * @time 上午11:42:41
  */
public class DateUtils {
	
	private final static String  DATE_FORMAT="YYYY-MM-dd HH:mm:ss";
	
	private final static SimpleDateFormat SIMPLE_DATE_FORMAT=new SimpleDateFormat(DATE_FORMAT);
	
	/*****
	 *  获取格式化时间 
	 * @return YYYY-MM-dd HH:mm:ss
	 */
	public static String getDateFormart(){
		return SIMPLE_DATE_FORMAT.format(new Date());
	}

	/*****
	 *  获取格式化时间 
	 * @return YYYY-MM-dd HH:mm:ss
	 */
	public static String getDateFormart(Date date){
		return SIMPLE_DATE_FORMAT.format(date);
	}
	
	 
}
