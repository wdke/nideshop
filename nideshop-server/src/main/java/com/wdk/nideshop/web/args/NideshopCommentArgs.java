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
 * @table nideshop_comment
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopCommentArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotNull(message = "cannot be null")
	private Byte type_id;

	//
	@NotNull(message = "cannot be null")
	private Integer value_id;

	//储存为base64编码
	@NotBlank(message = "cannot be empty")
	@Length(max = 6550,message = "最大长度为6550")
	private String content;

	//
	@NotNull(message = "cannot be null")
	private Long add_time;

	//
	@NotNull(message = "cannot be null")
	private Byte status;

	//
	@NotNull(message = "cannot be null")
	private Integer user_id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 6550,message = "最大长度为6550")
	private String new_content;





}

