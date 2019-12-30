package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_ad
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopAd implements Serializable {

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

