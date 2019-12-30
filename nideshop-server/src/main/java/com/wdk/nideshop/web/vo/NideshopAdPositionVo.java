package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_ad_position
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopAdPositionVo implements Serializable {

	//
	private Byte id;

	//
	private String name;

	//
	private Short width;

	//
	private Short height;

	//
	private String desc;



}

