package com.wdk.nideshop.web.args;

import lombok.Data;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;import java.io.Serializable;

/**
 * 商品画廊
 * @db nideshop
 * @table nideshop_goods_gallery
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopGoodsGalleryArgs implements Serializable {

	//
	@NotNull(message = "cannot be null")
	private Integer id;

	//
	@NotNull(message = "cannot be null")
	private Integer goods_id;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String img_url;

	//
	@NotBlank(message = "cannot be empty")
	@Length(max = 255,message = "最大长度为255")
	private String img_desc;

	//
	@NotNull(message = "cannot be null")
	private Integer sort_order;





}

