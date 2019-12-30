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
 * @table nideshop_address
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopAddressArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 50,message = "最大长度为50")
	private String name;

	//
	@NotNull(message = "cannot be null")
	private Integer user_id;

	//
	@NotNull(message = "cannot be null")
	private Short country_id;

	//
	@NotNull(message = "cannot be null")
	private Short province_id;

	//
	@NotNull(message = "cannot be null")
	private Short city_id;

	//
	@NotNull(message = "cannot be null")
	private Short district_id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 120,message = "最大长度为120")
	private String address;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 60,message = "最大长度为60")
	private String mobile;

	//
	@NotNull(message = "cannot be null")
	private Byte is_default;





}

