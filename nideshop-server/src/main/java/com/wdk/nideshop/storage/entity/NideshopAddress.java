package com.wdk.nideshop.storage.entity;

import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_address
 * @author wdke
 * @date 2019/12/30 19
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NideshopAddress implements Serializable {

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

