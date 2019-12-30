package com.wdk.nideshop.service;

import com.wdk.nideshop.common.model.ResponseVo;

/**
 * created by wdk on 2019/12/23
 */
public interface LoginService {
	/**
	 * 登陆接口
	 *
	 * @param username
	 * @param password
	 * @return
	 */
	ResponseVo<String> login(String username, String password);


	/**
	 * 校验token
	 *
	 * @param tokenValue
	 * @return
	 */
	ResponseVo<Boolean> tokenCheck(String tokenValue);

}
