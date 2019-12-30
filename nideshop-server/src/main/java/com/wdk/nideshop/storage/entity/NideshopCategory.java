package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 类别
 * @db nideshop
 * @table nideshop_category
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopCategory implements Serializable {

	//
	private Integer id;

	//
	private String name;

	//
	private String keywords;

	//
	private String front_desc;

	//
	private Integer parent_id;

	//
	private Byte sort_order;

	//
	private Byte show_index;

	//
	private Byte is_show;

	//
	private String banner_url;

	//
	private String icon_url;

	//
	private String img_url;

	//
	private String wap_banner_url;

	//
	private String level;

	//
	private Integer type;

	//
	private String front_name;



}

