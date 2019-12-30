package com.wdk.nideshop.web.pages;

import com.wdk.nideshop.service.NideshopProductService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopProduct;
import com.wdk.nideshop.web.args.NideshopProductArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



//页面控制类
@Controller
@RequestMapping("pages/nideshop/product")
public class NideshopProductPages {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopProductPages.class);

	//逻辑处理对象
	@Autowired
	private NideshopProductService nideshopProductService;

	/**
	* 首页接口
	*
	* @param nideshopProductArgs
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "首页接口")
	public String index(NideshopProductArgs nideshopProductArgs, PageParam pageParam, Model model){

		//调用业务逻辑
		PageInfo<NideshopProduct> result = nideshopProductService.pageInfo(nideshopProductArgs, pageParam);

		//数据返回jsp
		model.addAttribute("datas", result);

		return "/nideshopProduct/index";
	}

	/**
	 * 新增页面路由
	 *
	 * @return
	 */
	@GetMapping(value = "insert/pages", name = "新增页面路由")
	public String insertPage() {

		return "/nideshopProduct/insert";
	}

	/**
	* 新增接口
	*
	* @param nideshopProductArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public String insert(NideshopProductArgs nideshopProductArgs){

		//调用业务逻辑
		Integer result = nideshopProductService.insertSelective(nideshopProductArgs);

		return "redirect:/nideshop/product";
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
		NideshopProduct result = nideshopProductService.selectByPrimaryKey(id);

		//数据返回html
		model.addAttribute("data", result);

		//返回页面路径
		return "/nideshopProduct/update";
	}

	/**
	* 更新接口
	*
	* @param nideshopProductArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public String update(NideshopProductArgs nideshopProductArgs){

		//调用业务逻辑
		Integer result = nideshopProductService.updateSelectiveByPrimaryKey(nideshopProductArgs);

		return "redirect:/nideshop/product";
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
		Integer result = nideshopProductService.deleteByPrimaryKey(id);



		return new ResponseVo<>(ResponseStatusEnum.SUCCESS, result);

	}
}
