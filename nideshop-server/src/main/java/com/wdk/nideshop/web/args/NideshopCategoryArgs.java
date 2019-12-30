package com.wdk.nideshop.web.args;

import lombok.Data;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;import java.io.Serializable;

/**
 * 类别
 * @db nideshop
 * @table nideshop_category
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopCategoryArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 90,message = "最大长度为90")
	private String name;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String keywords;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String front_desc;

	//
	@NotNull(message = "cannot be null")
	private Integer parent_id;

	//
	@NotNull(message = "cannot be null")
	private Byte sort_order;

	//
	@NotNull(message = "cannot be null")
	private Byte show_index;

	//
	@NotNull(message = "cannot be null")
	private Byte is_show;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String banner_url;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String icon_url;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String img_url;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String wap_banner_url;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String level;

	//
	@NotNull(message = "cannot be null")
	private Integer type;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String front_name;





}

