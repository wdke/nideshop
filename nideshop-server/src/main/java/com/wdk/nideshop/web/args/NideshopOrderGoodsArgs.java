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
 * @table nideshop_order_goods
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopOrderGoodsArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotNull(message = "cannot be null")
	private Integer order_id;

	//
	@NotNull(message = "cannot be null")
	private Integer goods_id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 120,message = "最大长度为120")
	private String goods_name;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 60,message = "最大长度为60")
	private String goods_sn;

	//
	@NotNull(message = "cannot be null")
	private Integer product_id;

	//
	@NotNull(message = "cannot be null")
	private Short number;

	//
	@NotNull(message = "cannot be null")
	private Double market_price;

	//
	@NotNull(message = "cannot be null")
	private Double retail_price;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 65535,message = "最大长度为65535")
	private String goods_specifition_name_value;

	//
	@NotNull(message = "cannot be null")
	private Byte is_real;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String goods_specifition_ids;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String list_pic_url;





}

