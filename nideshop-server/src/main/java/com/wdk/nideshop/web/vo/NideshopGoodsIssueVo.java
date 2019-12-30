package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 货物的问题
 * @db nideshop
 * @table nideshop_goods_issue
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopGoodsIssueVo implements Serializable {

	//
	private Integer id;

	//
	private String goods_id;

	//
	private String question;

	//
	private String answer;



}

