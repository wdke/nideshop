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
 * @table nideshop_region
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopRegionArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Short id;

	//
	@NotNull(message = "cannot be null")
	private Short parent_id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 120,message = "最大长度为120")
	private String name;

	//
	@NotNull(message = "cannot be null")
	private Byte type;

	//
	@NotNull(message = "cannot be null")
	private Short agency_id;





}

