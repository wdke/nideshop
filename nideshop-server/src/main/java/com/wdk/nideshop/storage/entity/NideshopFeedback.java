package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_feedback
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopFeedback implements Serializable {

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

