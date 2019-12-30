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
 * @table nideshop_ad
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopAdArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Short id;

	//
	@NotNull(message = "cannot be null")
	private Short ad_position_id;

	//
	@NotNull(message = "cannot be null")
	private Byte media_type;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 60,message = "最大长度为60")
	private String name;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String link;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 65535,message = "最大长度为65535")
	private String image_url;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String content;

	//
	@NotNull(message = "cannot be null")
	private Integer end_time;

	//
	@NotNull(message = "cannot be null")
	private Byte enabled;





}

