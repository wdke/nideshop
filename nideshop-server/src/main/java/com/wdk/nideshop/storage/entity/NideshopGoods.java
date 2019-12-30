package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 商品表
 * @db nideshop
 * @table nideshop_goods
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopGoods implements Serializable {

	//
	private Integer id;

	//
	private Integer category_id;

	//
	private String goods_sn;

	//
	private String name;

	//
	private Integer brand_id;

	//
	private Integer goods_number;

	//
	private String keywords;

	//
	private String goods_brief;

	//
	private String goods_desc;

	//
	private Byte is_on_sale;

	//
	private Integer add_time;

	//
	private Short sort_order;

	//
	private Byte is_delete;

	//
	private Integer attribute_category;

	//专柜价格
	private Double counter_price;

	//附加价格
	private Double extra_price;

	//
	private Byte is_new;

	//商品单位
	private String goods_unit;

	//商品主图
	private String primary_pic_url;

	//商品列表图
	private String list_pic_url;

	//零售价格
	private Double retail_price;

	//销售量
	private Integer sell_volume;

	//主sku　product_id
	private Integer primary_product_id;

	//单位价格，单价
	private Double unit_price;

	//
	private String promotion_desc;

	//
	private String promotion_tag;

	//APP专享价
	private Double app_exclusive_price;

	//是否是APP专属
	private Byte is_app_exclusive;

	//
	private Integer is_limited;

	//
	private Byte is_hot;



}

