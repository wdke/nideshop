package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 规格表
 * @db nideshop
 * @table nideshop_specification
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopSpecificationVo implements Serializable {

	//
	private Integer id;

	//
	private String name;

	//
	private Byte sort_order;



}

