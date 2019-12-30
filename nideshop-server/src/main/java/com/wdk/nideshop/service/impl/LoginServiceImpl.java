package com.wdk.nideshop.service.impl;

import com.wdk.nideshop.common.constant.RedisConstant;
import com.wdk.nideshop.redis.RedisStringDao;
import com.wdk.nideshop.utils.JwtUtils;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
//import com.wdk.nideshop.model.SysUser;
import com.wdk.nideshop.service.LoginService;
//import com.wdk.nideshop.service.SysUserService;
import com.wdk.nideshop.utils.PasswordUtil;
import org.slf4j.Logger;
import com.alibaba.druid.util.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.HashMap;

/**
 * created by wdk on 2019/12/23
 */
@Service
public class LoginServiceImpl implements LoginService {


	private static Logger logger = LoggerFactory.getLogger(LoginService.class);


	@Autowired
	RedisStringDao redisStringDao;

	//@Autowired
	//private SysUserService sysUserService;

	/**
	 * 登陆接口
	 *
	 * @param username
	 * @param password
	 * @return
	 */
	@Override
	public ResponseVo<String> login(String username, String password) {

		//查询用户信息
		//SysUser sysUser = new SysUser();
		//sysUser.setUsername(username);
		//List<SysUser> list = sysUserService.list(sysUser);


		//if (list.isEmpty()) {
			//logger.info("login  用户不存在 .username={}", username);
			//return new ResponseVo(ResponseStatusEnum.PARRAM_ERROR.getCode(), "用户不存在");
		//} else {
			//for (SysUser user1 : list) {
				//if (PasswordUtil.encrypt(password, "1qaz1qaz").equals(user1.getPassword())){
					//return new ResponseVo(ResponseStatusEnum.SUCCESS.getCode(), "登录成功");
				//}
			//}
		//}

		//生成 token
		Map<String, Object> map = new HashMap<>();
		map.put("username", username);
		String token = JwtUtils.createJWT(map);

		//保存到 redis
		redisStringDao.set("token_" + username, token, RedisConstant.TOKEN_TIME);
		logger.info("login 登录失败。username={}", username);
		return new ResponseVo(ResponseStatusEnum.SUCCESS, token);

	}


	/**
	 * 校验token
	 *
	 * @param tokenValue
	 * @return
	 */
	@Override
	public ResponseVo<Boolean> tokenCheck(String tokenValue) {
		String check = redisStringDao.get(tokenValue);
		if (StringUtils.isEmpty(check)) {
			return new ResponseVo(ResponseStatusEnum.SUCCESS, false);
		}
		return new ResponseVo(ResponseStatusEnum.SUCCESS, true);
	}

}
