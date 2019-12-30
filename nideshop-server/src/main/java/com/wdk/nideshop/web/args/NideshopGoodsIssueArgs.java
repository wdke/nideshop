package com.wdk.nideshop.web.args;

import lombok.Data;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;import java.io.Serializable;

/**
 * 货物的问题
 * @db nideshop
 * @table nideshop_goods_issue
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopGoodsIssueArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@Length(max = 65535,message = "最大长度为65535")
	private String goods_id;

	//
	@Length(max = 255,message = "最大长度为255")
	private String question;

	//
	@Length(max = 45,message = "最大长度为45")
	private String answer;





}

