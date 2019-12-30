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
 * @table nideshop_user_coupon
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopUserCouponArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotNull(message = "cannot be null")
	private Byte coupon_id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 20,message = "最大长度为20")
	private String coupon_number;

	//
	@NotNull(message = "cannot be null")
	private Integer user_id;

	//
	@NotNull(message = "cannot be null")
	private Integer used_time;

	//
	@NotNull(message = "cannot be null")
	private Integer order_id;





}

