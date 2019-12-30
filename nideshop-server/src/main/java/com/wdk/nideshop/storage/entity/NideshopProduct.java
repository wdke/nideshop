package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_product
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopProduct implements Serializable {

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

