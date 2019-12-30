package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_ad
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopAdVo implements Serializable {

	//
	private Short id;

	//
	private Short ad_position_id;

	//
	private Byte media_type;

	//
	private String name;

	//
	private String link;

	//
	private String image_url;

	//
	private String content;

	//
	private Integer end_time;

	//
	private Byte enabled;



}

