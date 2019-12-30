package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_coupon
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopCouponVo implements Serializable {

	//
	private Short id;

	//
	private String name;

	//
	private Double type_money;

	//
	private Byte send_type;

	//
	private Double min_amount;

	//
	private Double max_amount;

	//
	private Integer send_start_date;

	//
	private Integer send_end_date;

	//
	private Integer use_start_date;

	//
	private Integer use_end_date;

	//
	private Double min_goods_amount;



}

