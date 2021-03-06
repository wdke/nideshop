package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_user
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopUserVo implements Serializable {

	//
	private Integer id;

	//
	private String username;

	//
	private String password;

	//
	private Byte gender;

	//
	private Integer birthday;

	//
	private Integer register_time;

	//
	private Integer last_login_time;

	//
	private String last_login_ip;

	//
	private Byte user_level_id;

	//
	private String nickname;

	//
	private String mobile;

	//
	private String register_ip;

	//
	private String avatar;

	//
	private String weixin_openid;



}

