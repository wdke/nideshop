package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 规格表
 * @db nideshop
 * @table nideshop_specification
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopSpecification implements Serializable {

	//
	private Integer id;

	//
	private String name;

	//
	private Byte sort_order;



}

