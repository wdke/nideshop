package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_cart
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopCart implements Serializable {

	//
	private Integer id;

	//
	private Integer user_id;

	//
	private String session_id;

	//
	private Integer goods_id;

	//
	private String goods_sn;

	//
	private Integer product_id;

	//
	private String goods_name;

	//
	private Double market_price;

	//
	private Double retail_price;

	//
	private Short number;

	//规格属性组成的字符串，用来显示用
	private String goods_specifition_name_value;

	//product表对应的goods_specifition_ids
	private String goods_specifition_ids;

	//
	private Byte checked;

	//
	private String list_pic_url;



}

