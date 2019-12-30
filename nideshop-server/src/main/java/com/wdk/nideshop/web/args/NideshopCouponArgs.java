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
 * @table nideshop_coupon
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopCouponArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Short id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 60,message = "最大长度为60")
	private String name;

	//
	@NotNull(message = "cannot be null")
	private Double type_money;

	//
	@NotNull(message = "cannot be null")
	private Byte send_type;

	//
	@NotNull(message = "cannot be null")
	private Double min_amount;

	//
	@NotNull(message = "cannot be null")
	private Double max_amount;

	//
	@NotNull(message = "cannot be null")
	private Integer send_start_date;

	//
	@NotNull(message = "cannot be null")
	private Integer send_end_date;

	//
	@NotNull(message = "cannot be null")
	private Integer use_start_date;

	//
	@NotNull(message = "cannot be null")
	private Integer use_end_date;

	//
	@NotNull(message = "cannot be null")
	private Double min_goods_amount;





}

