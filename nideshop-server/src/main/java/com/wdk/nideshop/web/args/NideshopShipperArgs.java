package com.wdk.nideshop.web.args;

import lombok.Data;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;import java.io.Serializable;

/**
 * 快递公司
 * @db nideshop
 * @table nideshop_shipper
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopShipperArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//快递公司名称
	@NotBlank(message = "cannot be empty")
	@Length(max = 20,message = "最大长度为20")
	private String name;

	//快递公司代码
	@NotBlank(message = "cannot be empty")
	@Length(max = 10,message = "最大长度为10")
	private String code;

	//排序
	@NotNull(message = "cannot be null")
	private Integer sort_order;





}

