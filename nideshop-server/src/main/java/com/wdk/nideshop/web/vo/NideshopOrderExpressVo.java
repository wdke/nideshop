package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 订单物流信息表，发货时生成
 * @db nideshop
 * @table nideshop_order_express
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopOrderExpressVo implements Serializable {

	//
	private Integer id;

	//
	private Integer order_id;

	//
	private Integer shipper_id;

	//物流公司名称
	private String shipper_name;

	//物流公司代码
	private String shipper_code;

	//快递单号
	private String logistic_code;

	//物流跟踪信息
	private String traces;

	//
	private Byte is_finish;

	//总查询次数
	private Integer request_count;

	//最近一次向第三方查询物流信息时间
	private Integer request_time;

	//添加时间
	private Integer add_time;

	//更新时间
	private Integer update_time;



}

