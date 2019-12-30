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
 * @table nideshop_feedback
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopFeedbackArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer msg_id;

	//
	@NotNull(message = "cannot be null")
	private Integer parent_id;

	//
	@NotNull(message = "cannot be null")
	private Integer user_id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 60,message = "最大长度为60")
	private String user_name;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 60,message = "最大长度为60")
	private String user_email;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 200,message = "最大长度为200")
	private String msg_title;

	//
	@NotNull(message = "cannot be null")
	private Byte msg_type;

	//
	@NotNull(message = "cannot be null")
	private Byte msg_status;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 65535,message = "最大长度为65535")
	private String msg_content;

	//
	@NotNull(message = "cannot be null")
	private Integer msg_time;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String message_img;

	//
	@NotNull(message = "cannot be null")
	private Integer order_id;

	//
	@NotNull(message = "cannot be null")
	private Byte msg_area;





}

