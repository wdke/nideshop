package com.wdk.nideshop.web.args;

import lombok.Data;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;import java.io.Serializable;

/**
 * 商品表
 * @db nideshop
 * @table nideshop_goods
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopGoodsArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotNull(message = "cannot be null")
	private Integer category_id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 60,message = "最大长度为60")
	private String goods_sn;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 120,message = "最大长度为120")
	private String name;

	//
	@NotNull(message = "cannot be null")
	private Integer brand_id;

	//
	@NotNull(message = "cannot be null")
	private Integer goods_number;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String keywords;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String goods_brief;

	//
	@Length(max = 65535,message = "最大长度为65535")
	private String goods_desc;

	//
	@NotNull(message = "cannot be null")
	private Byte is_on_sale;

	//
	@NotNull(message = "cannot be null")
	private Integer add_time;

	//
	@NotNull(message = "cannot be null")
	private Short sort_order;

	//
	@NotNull(message = "cannot be null")
	private Byte is_delete;

	//
	@NotNull(message = "cannot be null")
	private Integer attribute_category;

	//专柜价格
	@NotNull(message = "cannot be null")
	private Double counter_price;

	//附加价格
	@NotNull(message = "cannot be null")
	private Double extra_price;

	//
	@NotNull(message = "cannot be null")
	private Byte is_new;

	//商品单位
	@NotBlank(message = "cannot be empty")
	@Length(max = 45,message = "最大长度为45")
	private String goods_unit;

	//商品主图
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String primary_pic_url;

	//商品列表图
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String list_pic_url;

	//零售价格
	@NotNull(message = "cannot be null")
	private Double retail_price;

	//销售量
	@NotNull(message = "cannot be null")
	private Integer sell_volume;

	//主sku　product_id
	@NotNull(message = "cannot be null")
	private Integer primary_product_id;

	//单位价格，单价
	@NotNull(message = "cannot be null")
	private Double unit_price;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String promotion_desc;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 45,message = "最大长度为45")
	private String promotion_tag;

	//APP专享价
	@NotNull(message = "cannot be null")
	private Double app_exclusive_price;

	//是否是APP专属
	@NotNull(message = "cannot be null")
	private Byte is_app_exclusive;

	//
	@NotNull(message = "cannot be null")
	private Integer is_limited;

	//
	@NotNull(message = "cannot be null")
	private Byte is_hot;





}

