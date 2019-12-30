package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_order
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopOrder implements Serializable {

	//
	private Integer id;

	//
	private String order_sn;

	//
	private Integer user_id;

	//
	private Byte order_status;

	//
	private Byte shipping_status;

	//
	private Byte pay_status;

	//
	private String consignee;

	//
	private Short country;

	//
	private Short province;

	//
	private Short city;

	//
	private Short district;

	//
	private String address;

	//
	private String mobile;

	//
	private String postscript;

	//
	private Double shipping_fee;

	//
	private String pay_name;

	//
	private Byte pay_id;

	//实际需要支付的金额
	private Double actual_price;

	//
	private Integer integral;

	//
	private Double integral_money;

	//订单总价
	private Double order_price;

	//商品总价
	private Double goods_price;

	//
	private Integer add_time;

	//
	private Integer confirm_time;

	//
	private Integer pay_time;

	//配送费用
	private Integer freight_price;

	//使用的优惠券id
	private Integer coupon_id;

	//
	private Integer parent_id;

	//
	private Double coupon_price;

	//
	private String callback_status;



}

