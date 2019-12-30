package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_user_coupon
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopUserCoupon implements Serializable {

	//
	private Integer id;

	//
	private Byte coupon_id;

	//
	private String coupon_number;

	//
	private Integer user_id;

	//
	private Integer used_time;

	//
	private Integer order_id;



}

