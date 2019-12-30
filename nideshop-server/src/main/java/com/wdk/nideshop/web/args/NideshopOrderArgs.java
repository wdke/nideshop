package com.wdk.nideshop.web.args;

import lombok.Data;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_order
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopOrderArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 20,message = "最大长度为20")
	private String order_sn;

	//
	@NotNull(message = "cannot be null")
	private Integer user_id;

	//
	@NotNull(message = "cannot be null")
	private Byte order_status;

	//
	@NotNull(message = "cannot be null")
	private Byte shipping_status;

	//
	@NotNull(message = "cannot be null")
	private Byte pay_status;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 60,message = "最大长度为60")
	private String consignee;

	//
	@NotNull(message = "cannot be null")
	private Short country;

	//
	@NotNull(message = "cannot be null")
	private Short province;

	//
	@NotNull(message = "cannot be null")
	private Short city;

	//
	@NotNull(message = "cannot be null")
	private Short district;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String address;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 60,message = "最大长度为60")
	private String mobile;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String postscript;

	//
	@NotNull(message = "cannot be null")
	private Double shipping_fee;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 120,message = "最大长度为120")
	private String pay_name;

	//
	@NotNull(message = "cannot be null")
	private Byte pay_id;

	//实际需要支付的金额
	@NotNull(message = "cannot be null")
	private Double actual_price;

	//
	@NotNull(message = "cannot be null")
	private Integer integral;

	//
	@NotNull(message = "cannot be null")
	private Double integral_money;

	//订单总价
	@NotNull(message = "cannot be null")
	private Double order_price;

	//商品总价
	@NotNull(message = "cannot be null")
	private Double goods_price;

	//
	@NotNull(message = "cannot be null")
	private Integer add_time;

	//
	@NotNull(message = "cannot be null")
	private Integer confirm_time;

	//
	@NotNull(message = "cannot be null")
	private Integer pay_time;

	//配送费用
	@NotNull(message = "cannot be null")
	private Integer freight_price;

	//使用的优惠券id
	@NotNull(message = "cannot be null")
	private Integer coupon_id;

	//
	@NotNull(message = "cannot be null")
	private Integer parent_id;

	//
	@NotNull(message = "cannot be null")
	private Double coupon_price;

	//
	@Length(max = 5,message = "最大长度为5")
	private String callback_status;





}

