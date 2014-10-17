package com.qian.diyuzhe.dao;

import java.util.Map;

import com.qian.diyuzhe.entity.UserInfo;

/******
 * 用户信息Dao
 * 
 * @author 千帐灯
 * @file UserInfoDao.java
 * @time 下午1:47:57
 */
public interface UserInfoDao {

	/****
	 * 添加用户
	 * 
	 * @param userInfo
	 * @return
	 */
	int insertUserInfo(UserInfo userInfo);

	/****
	 * 
	 * @param userInfo
	 * <br>
	 *              loginName , pass 必填
	 * @return
	 */
	UserInfo login(UserInfo userInfo);
}
