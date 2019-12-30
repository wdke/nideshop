package com.wdk.nideshop.web.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.io.Serializable;

/**
 * 专题推荐
 * @db nideshop
 * @table nideshop_topic
 * @author wdke
 * @date 2019/12/30 19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NideshopTopicVo implements Serializable {

	//
	private Integer id;

	//
	private String title;

	//
	private String content;

	//
	private String avatar;

	//
	private String item_pic_url;

	//
	private String subtitle;

	//
	private Integer topic_category_id;

	//
	private Double price_info;

	//
	private String read_count;

	//
	private String scene_pic_url;

	//
	private Integer topic_template_id;

	//
	private Integer topic_tag_id;

	//
	private Integer sort_order;

	//
	private Byte is_show;



}

