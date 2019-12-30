package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_order_goods
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopOrderGoods implements Serializable {

	//
	private Integer id;

	//
	private Integer order_id;

	//
	private Integer goods_id;

	//
	private String goods_name;

	//
	private String goods_sn;

	//
	private Integer product_id;

	//
	private Short number;

	//
	private Double market_price;

	//
	private Double retail_price;

	//
	private String goods_specifition_name_value;

	//
	private Byte is_real;

	//
	private String goods_specifition_ids;

	//
	private String list_pic_url;



}

