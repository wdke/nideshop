package com.wdk.nideshop.web.args;

import lombok.Data;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_user
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopUserArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 60,message = "最大长度为60")
	private String username;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 32,message = "最大长度为32")
	private String password;

	//
	@NotNull(message = "cannot be null")
	private Byte gender;

	//
	@NotNull(message = "cannot be null")
	private Integer birthday;

	//
	@NotNull(message = "cannot be null")
	private Integer register_time;

	//
	@NotNull(message = "cannot be null")
	private Integer last_login_time;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String last_login_ip;

	//
	@NotNull(message = "cannot be null")
	private Byte user_level_id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 60,message = "最大长度为60")
	private String nickname;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 20,message = "最大长度为20")
	private String mobile;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String register_ip;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String avatar;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 50,message = "最大长度为50")
	private String weixin_openid;





}

