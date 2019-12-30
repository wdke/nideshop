package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_admin
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopAdmin implements Serializable {

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

