package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_admin
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopAdminVo implements Serializable {

	//
	private Integer id;

	//
	private String username;

	//
	private String password;

	//
	private String password_salt;

	//
	private String last_login_ip;

	//
	private Integer last_login_time;

	//
	private Integer add_time;

	//
	private Integer update_time;

	//
	private String avatar;

	//
	private Integer admin_role_id;



}

