package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_collect
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopCollect implements Serializable {

	//
	private Integer id;

	//
	private Integer user_id;

	//
	private Integer value_id;

	//
	private Integer add_time;

	//是否是关注
	private Byte is_attention;

	//
	private Integer type_id;



}

