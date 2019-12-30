package com.wdk.nideshop.web.pages;

import com.wdk.nideshop.service.NideshopGoodsService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopGoods;
import com.wdk.nideshop.web.args.NideshopGoodsArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



//商品表页面控制类
@Controller
@RequestMapping("pages/nideshop/goods")
public class NideshopGoodsPages {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopGoodsPages.class);

	//商品表逻辑处理对象
	@Autowired
	private NideshopGoodsService nideshopGoodsService;

	/**
	* 首页接口
	*
	* @param nideshopGoodsArgs
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "首页接口")
	public String index(NideshopGoodsArgs nideshopGoodsArgs, PageParam pageParam, Model model){

		//调用业务逻辑
		PageInfo<NideshopGoods> result = nideshopGoodsService.pageInfo(nideshopGoodsArgs, pageParam);

		//数据返回jsp
		model.addAttribute("datas", result);

		return "/nideshopGoods/index";
	}

	/**
	 * 新增页面路由
	 *
	 * @return
	 */
	@GetMapping(value = "insert/pages", name = "新增页面路由")
	public String insertPage() {

		return "/nideshopGoods/insert";
	}

	/**
	* 新增接口
	*
	* @param nideshopGoodsArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public String insert(NideshopGoodsArgs nideshopGoodsArgs){

		//调用业务逻辑
		Integer result = nideshopGoodsService.insertSelective(nideshopGoodsArgs);

		return "redirect:/nideshop/goods";
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
		NideshopGoods result = nideshopGoodsService.selectByPrimaryKey(id);

		//数据返回html
		model.addAttribute("data", result);

		//返回页面路径
		return "/nideshopGoods/update";
	}

	/**
	* 更新接口
	*
	* @param nideshopGoodsArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public String update(NideshopGoodsArgs nideshopGoodsArgs){

		//调用业务逻辑
		Integer result = nideshopGoodsService.updateSelectiveByPrimaryKey(nideshopGoodsArgs);

		return "redirect:/nideshop/goods";
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
		Integer result = nideshopGoodsService.deleteByPrimaryKey(id);



		return new ResponseVo<>(ResponseStatusEnum.SUCCESS, result);

	}
}
