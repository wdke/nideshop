package com.wdk.nideshop.web.args;

import lombok.Data;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;import java.io.Serializable;

/**
 * 热闹关键词表
 * @db nideshop
 * @table nideshop_keywords
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopKeywordsArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotNull(message = "cannot be null")
	private Integer type;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 90,message = "最大长度为90")
	private String keyword;

	//
	@NotNull(message = "cannot be null")
	private Byte is_hot;

	//
	@NotNull(message = "cannot be null")
	private Byte is_default;

	//
	@NotNull(message = "cannot be null")
	private Byte is_show;

	//
	@NotNull(message = "cannot be null")
	private Integer sort_order;

	//关键词的跳转链接
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String scheme_url;





}

