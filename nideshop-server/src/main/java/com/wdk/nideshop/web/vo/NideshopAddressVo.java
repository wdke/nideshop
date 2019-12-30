package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_address
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopAddressVo implements Serializable {

	//
	private Integer id;

	//
	private String name;

	//
	private Integer user_id;

	//
	private Short country_id;

	//
	private Short province_id;

	//
	private Short city_id;

	//
	private Short district_id;

	//
	private String address;

	//
	private String mobile;

	//
	private Byte is_default;



}

