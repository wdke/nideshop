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
 * @table nideshop_search_history
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopSearchHistoryArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 50,message = "最大长度为50")
	private String keyword;

	//搜索来源，如PC、小程序、APP等
	@NotBlank(message = "cannot be empty")
	@Length(max = 45,message = "最大长度为45")
	private String from;

	//搜索时间
	@NotNull(message = "cannot be null")
	private Integer add_time;

	//
	@Length(max = 45,message = "最大长度为45")
	private String user_id;





}

