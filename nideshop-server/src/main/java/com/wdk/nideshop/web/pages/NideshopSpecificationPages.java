package com.wdk.nideshop.web.pages;

import com.wdk.nideshop.service.NideshopSpecificationService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopSpecification;
import com.wdk.nideshop.web.args.NideshopSpecificationArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



//规格表页面控制类
@Controller
@RequestMapping("pages/nideshop/specification")
public class NideshopSpecificationPages {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopSpecificationPages.class);

	//规格表逻辑处理对象
	@Autowired
	private NideshopSpecificationService nideshopSpecificationService;

	/**
	* 首页接口
	*
	* @param nideshopSpecificationArgs
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "首页接口")
	public String index(NideshopSpecificationArgs nideshopSpecificationArgs, PageParam pageParam, Model model){

		//调用业务逻辑
		PageInfo<NideshopSpecification> result = nideshopSpecificationService.pageInfo(nideshopSpecificationArgs, pageParam);

		//数据返回jsp
		model.addAttribute("datas", result);

		return "/nideshopSpecification/index";
	}

	/**
	 * 新增页面路由
	 *
	 * @return
	 */
	@GetMapping(value = "insert/pages", name = "新增页面路由")
	public String insertPage() {

		return "/nideshopSpecification/insert";
	}

	/**
	* 新增接口
	*
	* @param nideshopSpecificationArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public String insert(NideshopSpecificationArgs nideshopSpecificationArgs){

		//调用业务逻辑
		Integer result = nideshopSpecificationService.insertSelective(nideshopSpecificationArgs);

		return "redirect:/nideshop/specification";
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
		NideshopSpecification result = nideshopSpecificationService.selectByPrimaryKey(id);

		//数据返回html
		model.addAttribute("data", result);

		//返回页面路径
		return "/nideshopSpecification/update";
	}

	/**
	* 更新接口
	*
	* @param nideshopSpecificationArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public String update(NideshopSpecificationArgs nideshopSpecificationArgs){

		//调用业务逻辑
		Integer result = nideshopSpecificationService.updateSelectiveByPrimaryKey(nideshopSpecificationArgs);

		return "redirect:/nideshop/specification";
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
		Integer result = nideshopSpecificationService.deleteByPrimaryKey(id);



		return new ResponseVo<>(ResponseStatusEnum.SUCCESS, result);

	}
}
