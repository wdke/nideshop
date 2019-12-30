package com.wdk.nideshop.web.pages;

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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



//页面控制类
@Controller
@RequestMapping("pages/nideshop/feedback")
public class NideshopFeedbackPages {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopFeedbackPages.class);

	//逻辑处理对象
	@Autowired
	private NideshopFeedbackService nideshopFeedbackService;

	/**
	* 首页接口
	*
	* @param nideshopFeedbackArgs
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "首页接口")
	public String index(NideshopFeedbackArgs nideshopFeedbackArgs, PageParam pageParam, Model model){

		//调用业务逻辑
		PageInfo<NideshopFeedback> result = nideshopFeedbackService.pageInfo(nideshopFeedbackArgs, pageParam);

		//数据返回jsp
		model.addAttribute("datas", result);

		return "/nideshopFeedback/index";
	}

	/**
	 * 新增页面路由
	 *
	 * @return
	 */
	@GetMapping(value = "insert/pages", name = "新增页面路由")
	public String insertPage() {

		return "/nideshopFeedback/insert";
	}

	/**
	* 新增接口
	*
	* @param nideshopFeedbackArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public String insert(NideshopFeedbackArgs nideshopFeedbackArgs){

		//调用业务逻辑
		Integer result = nideshopFeedbackService.insertSelective(nideshopFeedbackArgs);

		return "redirect:/nideshop/feedback";
	}

	/**
	* 进入更新页面
	*
	* @param msg_id
	* @date 2019/12/30 19:37
	*/
	@GetMapping(value = "update/pages//{msg_id}",name = "进入更新页面")
	public String updatePage(@PathVariable Integer msg_id, Model model){

		//根据主键查询数据
		NideshopFeedback result = nideshopFeedbackService.selectByPrimaryKey(msg_id);

		//数据返回html
		model.addAttribute("data", result);

		//返回页面路径
		return "/nideshopFeedback/update";
	}

	/**
	* 更新接口
	*
	* @param nideshopFeedbackArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public String update(NideshopFeedbackArgs nideshopFeedbackArgs){

		//调用业务逻辑
		Integer result = nideshopFeedbackService.updateSelectiveByPrimaryKey(nideshopFeedbackArgs);

		return "redirect:/nideshop/feedback";
	}

	/**
	 * 移除方法
	 *
	 * @param msg_id
	 * @return
	 */
	@PostMapping(value = "remove//{msg_id}", name = "移除方法")
	@ResponseBody
	public ResponseVo<Integer> remove(@PathVariable Integer msg_id) {
		//调用业务逻辑
		Integer result = nideshopFeedbackService.deleteByPrimaryKey(msg_id);



		return new ResponseVo<>(ResponseStatusEnum.SUCCESS, result);

	}
}
