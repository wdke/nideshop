package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 热闹关键词表
 * @db nideshop
 * @table nideshop_keywords
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopKeywordsVo implements Serializable {

	//
	private Integer id;

	//
	private Integer type;

	//
	private String keyword;

	//
	private Byte is_hot;

	//
	private Byte is_default;

	//
	private Byte is_show;

	//
	private Integer sort_order;

	//关键词的跳转链接
	private String scheme_url;



}

