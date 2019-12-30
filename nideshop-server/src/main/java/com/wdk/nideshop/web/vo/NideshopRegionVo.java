package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_region
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopRegionVo implements Serializable {

	//
	private Short id;

	//
	private Short parent_id;

	//
	private String name;

	//
	private Byte type;

	//
	private Short agency_id;



}

