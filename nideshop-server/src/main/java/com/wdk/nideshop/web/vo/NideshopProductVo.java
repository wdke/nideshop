package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_product
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopProductVo implements Serializable {

	//
	private Integer id;

	//
	private Integer goods_id;

	//
	private String goods_specification_ids;

	//
	private String goods_sn;

	//
	private Integer goods_number;

	//
	private Double retail_price;



}

