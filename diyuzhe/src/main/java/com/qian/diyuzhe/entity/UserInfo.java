package com.qian.diyuzhe.entity;

/********
 * userInfo
 * @author 千帐灯
 * @file  UserInfo.java
 * @time 下午1:38:22
 */
public class UserInfo extends BaseObject {
 
	private int id;
	 
	private String showName;
	
	private String loginName; 
	
	private String HeadUrl;

	private String pass;
 
	private  String birthday;

	private String address;
	
	private String email;

	private int age;
	
	private int sex;
	
	private String signature;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getHeadUrl() {
		return HeadUrl;
	}

	public void setHeadUrl(String headUrl) {
		HeadUrl = headUrl;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
