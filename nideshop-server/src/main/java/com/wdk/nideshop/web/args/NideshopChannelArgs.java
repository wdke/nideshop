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
 * @table nideshop_channel
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopChannelArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 45,message = "最大长度为45")
	private String name;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String url;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String icon_url;

	//
	@NotNull(message = "cannot be null")
	private Integer sort_order;





}

