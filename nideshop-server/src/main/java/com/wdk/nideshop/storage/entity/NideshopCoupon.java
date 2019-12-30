package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_coupon
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopCoupon implements Serializable {

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

