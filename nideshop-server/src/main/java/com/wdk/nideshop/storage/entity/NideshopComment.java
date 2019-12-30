package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_comment
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopComment implements Serializable {

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

