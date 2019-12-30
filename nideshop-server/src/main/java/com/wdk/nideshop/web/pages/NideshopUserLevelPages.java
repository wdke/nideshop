package com.wdk.nideshop.web.pages;

import com.wdk.nideshop.service.NideshopUserLevelService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopUserLevel;
import com.wdk.nideshop.web.args.NideshopUserLevelArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



//页面控制类
@Controller
@RequestMapping("pages/nideshop/user/level")
public class NideshopUserLevelPages {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopUserLevelPages.class);

	//逻辑处理对象
	@Autowired
	private NideshopUserLevelService nideshopUserLevelService;

	/**
	* 首页接口
	*
	* @param nideshopUserLevelArgs
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "首页接口")
	public String index(NideshopUserLevelArgs nideshopUserLevelArgs, PageParam pageParam, Model model){

		//调用业务逻辑
		PageInfo<NideshopUserLevel> result = nideshopUserLevelService.pageInfo(nideshopUserLevelArgs, pageParam);

		//数据返回jsp
		model.addAttribute("datas", result);

		return "/nideshopUserLevel/index";
	}

	/**
	 * 新增页面路由
	 *
	 * @return
	 */
	@GetMapping(value = "insert/pages", name = "新增页面路由")
	public String insertPage() {

		return "/nideshopUserLevel/insert";
	}

	/**
	* 新增接口
	*
	* @param nideshopUserLevelArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public String insert(NideshopUserLevelArgs nideshopUserLevelArgs){

		//调用业务逻辑
		Integer result = nideshopUserLevelService.insertSelective(nideshopUserLevelArgs);

		return "redirect:/nideshop/user/level";
	}

	/**
	* 进入更新页面
	*
	* @param id
	* @date 2019/12/30 19:37
	*/
	@GetMapping(value = "update/pages//{id}",name = "进入更新页面")
	public String updatePage(@PathVariable Byte id, Model model){

		//根据主键查询数据
		NideshopUserLevel result = nideshopUserLevelService.selectByPrimaryKey(id);

		//数据返回html
		model.addAttribute("data", result);

		//返回页面路径
		return "/nideshopUserLevel/update";
	}

	/**
	* 更新接口
	*
	* @param nideshopUserLevelArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public String update(NideshopUserLevelArgs nideshopUserLevelArgs){

		//调用业务逻辑
		Integer result = nideshopUserLevelService.updateSelectiveByPrimaryKey(nideshopUserLevelArgs);

		return "redirect:/nideshop/user/level";
	}

	/**
	 * 移除方法
	 *
	 * @param id
	 * @return
	 */
	@PostMapping(value = "remove//{id}", name = "移除方法")
	@ResponseBody
	public ResponseVo<Integer> remove(@PathVariable Byte id) {
		//调用业务逻辑
		Integer result = nideshopUserLevelService.deleteByPrimaryKey(id);



		return new ResponseVo<>(ResponseStatusEnum.SUCCESS, result);

	}
}
