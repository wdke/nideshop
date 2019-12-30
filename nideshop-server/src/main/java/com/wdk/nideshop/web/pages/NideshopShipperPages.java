package com.wdk.nideshop.web.pages;

import com.wdk.nideshop.service.NideshopShipperService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopShipper;
import com.wdk.nideshop.web.args.NideshopShipperArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



//快递公司页面控制类
@Controller
@RequestMapping("pages/nideshop/shipper")
public class NideshopShipperPages {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopShipperPages.class);

	//快递公司逻辑处理对象
	@Autowired
	private NideshopShipperService nideshopShipperService;

	/**
	* 首页接口
	*
	* @param nideshopShipperArgs
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "首页接口")
	public String index(NideshopShipperArgs nideshopShipperArgs, PageParam pageParam, Model model){

		//调用业务逻辑
		PageInfo<NideshopShipper> result = nideshopShipperService.pageInfo(nideshopShipperArgs, pageParam);

		//数据返回jsp
		model.addAttribute("datas", result);

		return "/nideshopShipper/index";
	}

	/**
	 * 新增页面路由
	 *
	 * @return
	 */
	@GetMapping(value = "insert/pages", name = "新增页面路由")
	public String insertPage() {

		return "/nideshopShipper/insert";
	}

	/**
	* 新增接口
	*
	* @param nideshopShipperArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public String insert(NideshopShipperArgs nideshopShipperArgs){

		//调用业务逻辑
		Integer result = nideshopShipperService.insertSelective(nideshopShipperArgs);

		return "redirect:/nideshop/shipper";
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
		NideshopShipper result = nideshopShipperService.selectByPrimaryKey(id);

		//数据返回html
		model.addAttribute("data", result);

		//返回页面路径
		return "/nideshopShipper/update";
	}

	/**
	* 更新接口
	*
	* @param nideshopShipperArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public String update(NideshopShipperArgs nideshopShipperArgs){

		//调用业务逻辑
		Integer result = nideshopShipperService.updateSelectiveByPrimaryKey(nideshopShipperArgs);

		return "redirect:/nideshop/shipper";
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
		Integer result = nideshopShipperService.deleteByPrimaryKey(id);



		return new ResponseVo<>(ResponseStatusEnum.SUCCESS, result);

	}
}
