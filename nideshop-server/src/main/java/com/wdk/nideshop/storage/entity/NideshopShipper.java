package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 快递公司
 * @db nideshop
 * @table nideshop_shipper
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopShipper implements Serializable {

	//
	private Integer id;

	//快递公司名称
	private String name;

	//快递公司代码
	private String code;

	//排序
	private Integer sort_order;



}

