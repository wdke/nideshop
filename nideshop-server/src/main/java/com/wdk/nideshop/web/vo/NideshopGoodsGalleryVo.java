package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 商品画廊
 * @db nideshop
 * @table nideshop_goods_gallery
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopGoodsGalleryVo implements Serializable {

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

