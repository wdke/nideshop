package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 商品画廊
 * @db nideshop
 * @table nideshop_goods_gallery
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopGoodsGallery implements Serializable {

	//
	private Integer id;

	//
	private Integer goods_id;

	//
	private String img_url;

	//
	private String img_desc;

	//
	private Integer sort_order;



}

