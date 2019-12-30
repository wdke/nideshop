package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 热闹关键词表
 * @db nideshop
 * @table nideshop_keywords
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopKeywords implements Serializable {

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

