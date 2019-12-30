package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_search_history
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopSearchHistoryVo implements Serializable {

	//
	private Integer id;

	//
	private String keyword;

	//搜索来源，如PC、小程序、APP等
	private String from;

	//搜索时间
	private Integer add_time;

	//
	private String user_id;



}

