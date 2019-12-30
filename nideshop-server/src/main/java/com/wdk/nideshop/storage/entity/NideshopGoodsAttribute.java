package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 商品属性
 * @db nideshop
 * @table nideshop_goods_attribute
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopGoodsAttribute implements Serializable {

	//
	private Integer id;

	//
	private Integer goods_id;

	//
	private Integer attribute_id;

	//
	private String value;



}

