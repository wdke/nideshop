package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_feedback
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopFeedbackVo implements Serializable {

	//
	private Integer msg_id;

	//
	private Integer parent_id;

	//
	private Integer user_id;

	//
	private String user_name;

	//
	private String user_email;

	//
	private String msg_title;

	//
	private Byte msg_type;

	//
	private Byte msg_status;

	//
	private String msg_content;

	//
	private Integer msg_time;

	//
	private String message_img;

	//
	private Integer order_id;

	//
	private Byte msg_area;



}

