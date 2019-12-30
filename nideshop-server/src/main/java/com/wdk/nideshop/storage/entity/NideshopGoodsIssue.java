package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 货物的问题
 * @db nideshop
 * @table nideshop_goods_issue
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopGoodsIssue implements Serializable {

	//
	private Integer id;

	//
	private String goods_id;

	//
	private String question;

	//
	private String answer;



}

