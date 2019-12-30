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
 * @table nideshop_cart
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopCartArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotNull(message = "cannot be null")
	private Integer user_id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 32,message = "最大长度为32")
	private String session_id;

	//
	@NotNull(message = "cannot be null")
	private Integer goods_id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 60,message = "最大长度为60")
	private String goods_sn;

	//
	@NotNull(message = "cannot be null")
	private Integer product_id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 120,message = "最大长度为120")
	private String goods_name;

	//
	@NotNull(message = "cannot be null")
	private Double market_price;

	//
	@NotNull(message = "cannot be null")
	private Double retail_price;

	//
	@NotNull(message = "cannot be null")
	private Short number;

	//规格属性组成的字符串，用来显示用
	@NotBlank(message = "cannot be empty")
	@Length(max = 65535,message = "最大长度为65535")
	private String goods_specifition_name_value;

	//product表对应的goods_specifition_ids
	@NotBlank(message = "cannot be empty")
	@Length(max = 60,message = "最大长度为60")
	private String goods_specifition_ids;

	//
	@NotNull(message = "cannot be null")
	private Byte checked;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String list_pic_url;





}

