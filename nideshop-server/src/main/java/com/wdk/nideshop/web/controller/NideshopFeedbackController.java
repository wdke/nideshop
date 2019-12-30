package com.wdk.nideshop.web.controller;

import com.wdk.nideshop.service.NideshopFeedbackService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopFeedback;
import com.wdk.nideshop.web.args.NideshopFeedbackArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



//页面控制类
@RestController
@RequestMapping("api/nideshop/feedback")
public class NideshopFeedbackController {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopFeedbackController.class);

	//逻辑处理对象
	@Autowired
	private NideshopFeedbackService nideshopFeedbackService;

	/**
	* 分页查询接口
	*
	* @param nideshopFeedback
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "分页查询接口")
	public ResponseVo<PageInfo<NideshopFeedback>> index(NideshopFeedbackArgs nideshopFeedback, PageParam pageParam){

		//调用业务逻辑
		PageInfo<NideshopFeedback> result = nideshopFeedbackService.pageInfo(nideshopFeedback, pageParam);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 查询数据列表接口
	*
	* @param nideshopFeedback
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "list",name = "查询数据列表接口")
	public ResponseVo<List<NideshopFeedback>> list(NideshopFeedbackArgs nideshopFeedback){

		//调用业务逻辑
		List<NideshopFeedback> result = nideshopFeedbackService.list(nideshopFeedback);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 根据条件统计总量接口
	*
	* @param nideshopFeedback
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "count",name = "根据条件统计总量接口")
	public ResponseVo<Integer> count(NideshopFeedbackArgs nideshopFeedback){

		//调用业务逻辑
		Integer result = nideshopFeedbackService.count(nideshopFeedback);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 新增接口
	*
	* @param nideshopFeedback
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public ResponseVo<Integer> insert(@RequestBody NideshopFeedbackArgs nideshopFeedback){

		//调用业务逻辑
		Integer result = nideshopFeedbackService.insertSelective(nideshopFeedback);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 更新接口
	*
	* @param nideshopFeedback
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public ResponseVo<Integer> update(@RequestBody NideshopFeedbackArgs nideshopFeedback){

		//调用业务逻辑
		Integer result = nideshopFeedbackService.updateSelectiveByPrimaryKey(nideshopFeedback);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	 * 移除方法
	 *
	 * @param msg_id
	 * @return
	 */
	@PostMapping(value = "remove/{msg_id}", name = "移除方法")
	public ResponseVo<Integer> remove(@PathVariable Integer msg_id) {
		//调用业务逻辑
		Integer result = nideshopFeedbackService.deleteByPrimaryKey(msg_id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	 * 详情
	 *
	 * @param msg_id
	 * @return
	 */
	@GetMapping(value = "detail/{msg_id}", name = "详情方法")
	public ResponseVo<NideshopFeedback> detail(@PathVariable Integer msg_id) {
		//调用业务逻辑
		NideshopFeedback result = nideshopFeedbackService.selectByPrimaryKey(msg_id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}


}
