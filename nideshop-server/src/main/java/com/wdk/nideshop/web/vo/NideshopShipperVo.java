package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 快递公司
 * @db nideshop
 * @table nideshop_shipper
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopShipperVo implements Serializable {

	//
	private Integer id;

	//快递公司名称
	private String name;

	//快递公司代码
	private String code;

	//排序
	private Integer sort_order;



}

