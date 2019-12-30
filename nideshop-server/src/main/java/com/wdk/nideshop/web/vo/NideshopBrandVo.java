package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 品牌
 * @db nideshop
 * @table nideshop_brand
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopBrandVo implements Serializable {

	//
	private Integer id;

	//
	private String name;

	//
	private String list_pic_url;

	//
	private String simple_desc;

	//
	private String pic_url;

	//
	private Byte sort_order;

	//
	private Byte is_show;

	//
	private Double floor_price;

	//
	private String app_list_pic_url;

	//
	private Byte is_new;

	//
	private String new_pic_url;

	//
	private Byte new_sort_order;



}

