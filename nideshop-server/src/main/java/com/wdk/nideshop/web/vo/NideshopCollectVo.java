package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_collect
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopCollectVo implements Serializable {

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

