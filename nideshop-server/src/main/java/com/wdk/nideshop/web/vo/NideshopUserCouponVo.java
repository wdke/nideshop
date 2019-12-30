package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_user_coupon
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopUserCouponVo implements Serializable {

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

