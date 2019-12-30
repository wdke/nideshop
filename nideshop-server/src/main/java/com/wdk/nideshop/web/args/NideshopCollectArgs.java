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
 * @table nideshop_collect
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopCollectArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotNull(message = "cannot be null")
	private Integer user_id;

	//
	@NotNull(message = "cannot be null")
	private Integer value_id;

	//
	@NotNull(message = "cannot be null")
	private Integer add_time;

	//是否是关注
	@NotNull(message = "cannot be null")
	private Byte is_attention;

	//
	@NotNull(message = "cannot be null")
	private Integer type_id;





}

