package com.wdk.nideshop.web.pages;

import com.wdk.nideshop.service.NideshopUserService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopUser;
import com.wdk.nideshop.web.args.NideshopUserArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



//页面控制类
@Controller
@RequestMapping("pages/nideshop/user")
public class NideshopUserPages {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopUserPages.class);

	//逻辑处理对象
	@Autowired
	private NideshopUserService nideshopUserService;

	/**
	* 首页接口
	*
	* @param nideshopUserArgs
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "首页接口")
	public String index(NideshopUserArgs nideshopUserArgs, PageParam pageParam, Model model){

		//调用业务逻辑
		PageInfo<NideshopUser> result = nideshopUserService.pageInfo(nideshopUserArgs, pageParam);

		//数据返回jsp
		model.addAttribute("datas", result);

		return "/nideshopUser/index";
	}

	/**
	 * 新增页面路由
	 *
	 * @return
	 */
	@GetMapping(value = "insert/pages", name = "新增页面路由")
	public String insertPage() {

		return "/nideshopUser/insert";
	}

	/**
	* 新增接口
	*
	* @param nideshopUserArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public String insert(NideshopUserArgs nideshopUserArgs){

		//调用业务逻辑
		Integer result = nideshopUserService.insertSelective(nideshopUserArgs);

		return "redirect:/nideshop/user";
	}

	/**
	* 进入更新页面
	*
	* @param id
	* @date 2019/12/30 19:37
	*/
	@GetMapping(value = "update/pages//{id}",name = "进入更新页面")
	public String updatePage(@PathVariable Integer id, Model model){

		//根据主键查询数据
		NideshopUser result = nideshopUserService.selectByPrimaryKey(id);

		//数据返回html
		model.addAttribute("data", result);

		//返回页面路径
		return "/nideshopUser/update";
	}

	/**
	* 更新接口
	*
	* @param nideshopUserArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public String update(NideshopUserArgs nideshopUserArgs){

		//调用业务逻辑
		Integer result = nideshopUserService.updateSelectiveByPrimaryKey(nideshopUserArgs);

		return "redirect:/nideshop/user";
	}

	/**
	 * 移除方法
	 *
	 * @param id
	 * @return
	 */
	@PostMapping(value = "remove//{id}", name = "移除方法")
	@ResponseBody
	public ResponseVo<Integer> remove(@PathVariable Integer id) {
		//调用业务逻辑
		Integer result = nideshopUserService.deleteByPrimaryKey(id);



		return new ResponseVo<>(ResponseStatusEnum.SUCCESS, result);

	}
}
