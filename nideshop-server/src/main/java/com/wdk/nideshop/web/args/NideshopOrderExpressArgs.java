package com.wdk.nideshop.web.args;

import lombok.Data;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;import java.io.Serializable;

/**
 * 订单物流信息表，发货时生成
 * @db nideshop
 * @table nideshop_order_express
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopOrderExpressArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotNull(message = "cannot be null")
	private Integer order_id;

	//
	@NotNull(message = "cannot be null")
	private Integer shipper_id;

	//物流公司名称
	@NotBlank(message = "cannot be empty")
	@Length(max = 120,message = "最大长度为120")
	private String shipper_name;

	//物流公司代码
	@NotBlank(message = "cannot be empty")
	@Length(max = 60,message = "最大长度为60")
	private String shipper_code;

	//快递单号
	@NotBlank(message = "cannot be empty")
	@Length(max = 20,message = "最大长度为20")
	private String logistic_code;

	//物流跟踪信息
	@NotBlank(message = "cannot be empty")
	@Length(max = 2000,message = "最大长度为2000")
	private String traces;

	//
	@NotNull(message = "cannot be null")
	private Byte is_finish;

	//总查询次数
	private Integer request_count;

	//最近一次向第三方查询物流信息时间
	private Integer request_time;

	//添加时间
	@NotNull(message = "cannot be null")
	private Integer add_time;

	//更新时间
	@NotNull(message = "cannot be null")
	private Integer update_time;





}

