package com.wdk.nideshop.web.args;

import lombok.Data;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;import java.io.Serializable;

/**
 * 专题推荐
 * @db nideshop
 * @table nideshop_topic
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopTopicArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String title;

	//
	@Length(max = 65535,message = "最大长度为65535")
	private String content;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String avatar;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String item_pic_url;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String subtitle;

	//
	@NotNull(message = "cannot be null")
	private Integer topic_category_id;

	//
	@NotNull(message = "cannot be null")
	private Double price_info;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String read_count;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String scene_pic_url;

	//
	@NotNull(message = "cannot be null")
	private Integer topic_template_id;

	//
	@NotNull(message = "cannot be null")
	private Integer topic_tag_id;

	//
	@NotNull(message = "cannot be null")
	private Integer sort_order;

	//
	@NotNull(message = "cannot be null")
	private Byte is_show;





}

