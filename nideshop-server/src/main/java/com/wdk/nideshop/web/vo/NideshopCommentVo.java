package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_comment
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopCommentVo implements Serializable {

	//
	private Integer id;

	//
	private Byte type_id;

	//
	private Integer value_id;

	//储存为base64编码
	private String content;

	//
	private Long add_time;

	//
	private Byte status;

	//
	private Integer user_id;

	//
	private String new_content;



}

