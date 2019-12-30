package com.wdk.nideshop.web.controller;

import com.wdk.nideshop.service.NideshopTopicService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopTopic;
import com.wdk.nideshop.web.args.NideshopTopicArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



//专题推荐页面控制类
@RestController
@RequestMapping("api/nideshop/topic")
public class NideshopTopicController {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopTopicController.class);

	//专题推荐逻辑处理对象
	@Autowired
	private NideshopTopicService nideshopTopicService;

	/**
	* 分页查询接口
	*
	* @param nideshopTopic
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "分页查询接口")
	public ResponseVo<PageInfo<NideshopTopic>> index(NideshopTopicArgs nideshopTopic, PageParam pageParam){

		//调用业务逻辑
		PageInfo<NideshopTopic> result = nideshopTopicService.pageInfo(nideshopTopic, pageParam);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 查询数据列表接口
	*
	* @param nideshopTopic
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "list",name = "查询数据列表接口")
	public ResponseVo<List<NideshopTopic>> list(NideshopTopicArgs nideshopTopic){

		//调用业务逻辑
		List<NideshopTopic> result = nideshopTopicService.list(nideshopTopic);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 根据条件统计总量接口
	*
	* @param nideshopTopic
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "count",name = "根据条件统计总量接口")
	public ResponseVo<Integer> count(NideshopTopicArgs nideshopTopic){

		//调用业务逻辑
		Integer result = nideshopTopicService.count(nideshopTopic);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 新增接口
	*
	* @param nideshopTopic
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public ResponseVo<Integer> insert(@RequestBody NideshopTopicArgs nideshopTopic){

		//调用业务逻辑
		Integer result = nideshopTopicService.insertSelective(nideshopTopic);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 更新接口
	*
	* @param nideshopTopic
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public ResponseVo<Integer> update(@RequestBody NideshopTopicArgs nideshopTopic){

		//调用业务逻辑
		Integer result = nideshopTopicService.updateSelectiveByPrimaryKey(nideshopTopic);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	 * 移除方法
	 *
	 * @param id
	 * @return
	 */
	@PostMapping(value = "remove/{id}", name = "移除方法")
	public ResponseVo<Integer> remove(@PathVariable Integer id) {
		//调用业务逻辑
		Integer result = nideshopTopicService.deleteByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	 * 详情
	 *
	 * @param id
	 * @return
	 */
	@GetMapping(value = "detail/{id}", name = "详情方法")
	public ResponseVo<NideshopTopic> detail(@PathVariable Integer id) {
		//调用业务逻辑
		NideshopTopic result = nideshopTopicService.selectByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}


}
