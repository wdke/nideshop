package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 商品属性
 * @db nideshop
 * @table nideshop_goods_attribute
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopGoodsAttributeVo implements Serializable {

	//
	private Integer id;

	//
	private Integer goods_id;

	//
	private Integer attribute_id;

	//
	private String value;



}

