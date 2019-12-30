package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 商品规格
 * @db nideshop
 * @table nideshop_goods_specification
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopGoodsSpecificationVo implements Serializable {

	//
	private Integer id;

	//
	private Integer goods_id;

	//
	private Integer specification_id;

	//
	private String value;

	//
	private String pic_url;



}

