package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 商品规格
 * @db nideshop
 * @table nideshop_goods_specification
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopGoodsSpecification implements Serializable {

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

