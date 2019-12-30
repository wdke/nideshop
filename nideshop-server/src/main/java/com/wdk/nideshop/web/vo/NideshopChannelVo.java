package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_channel
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopChannelVo implements Serializable {

	//
	private Integer id;

	//
	private String name;

	//
	private String url;

	//
	private String icon_url;

	//
	private Integer sort_order;



}

