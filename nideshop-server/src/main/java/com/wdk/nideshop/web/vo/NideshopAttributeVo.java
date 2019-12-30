package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_attribute
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopAttributeVo implements Serializable {

	//
	private Integer id;

	//
	private Integer attribute_category_id;

	//
	private String name;

	//
	private Byte input_type;

	//
	private String values;

	//
	private Byte sort_order;



}

