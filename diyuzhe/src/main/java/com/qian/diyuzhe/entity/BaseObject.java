package com.qian.diyuzhe.entity;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.qian.diyuzhe.utils.DateUtils;

/*****
 * 实体父类
 * @author 千帐灯
 * @file  BaseObject.java
 * @time 上午11:44:43
 */ 
@JsonSerialize(include = Inclusion.NON_NULL)
public class BaseObject  {
	private int status;
	private String inertTime=DateUtils.getDateFormart();
	
	private String updateTime=DateUtils.getDateFormart();

	public String getInertTime() {
		return inertTime;
	}

	public void setInertTime(String inertTime) {
		this.inertTime = inertTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
