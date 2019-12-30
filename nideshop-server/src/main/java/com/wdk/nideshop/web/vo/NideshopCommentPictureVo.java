package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @db nideshop
 * @table nideshop_comment_picture
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopCommentPictureVo implements Serializable {

	//
	private Integer id;

	//
	private Integer comment_id;

	//
	private String pic_url;

	//
	private Byte sort_order;



}

