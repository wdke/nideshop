package com.wdk.nideshop.web.pages;

import com.wdk.nideshop.service.NideshopCommentPictureService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopCommentPicture;
import com.wdk.nideshop.web.args.NideshopCommentPictureArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



//页面控制类
@Controller
@RequestMapping("pages/nideshop/comment/picture")
public class NideshopCommentPicturePages {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopCommentPicturePages.class);

	//逻辑处理对象
	@Autowired
	private NideshopCommentPictureService nideshopCommentPictureService;

	/**
	* 首页接口
	*
	* @param nideshopCommentPictureArgs
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "首页接口")
	public String index(NideshopCommentPictureArgs nideshopCommentPictureArgs, PageParam pageParam, Model model){

		//调用业务逻辑
		PageInfo<NideshopCommentPicture> result = nideshopCommentPictureService.pageInfo(nideshopCommentPictureArgs, pageParam);

		//数据返回jsp
		model.addAttribute("datas", result);

		return "/nideshopCommentPicture/index";
	}

	/**
	 * 新增页面路由
	 *
	 * @return
	 */
	@GetMapping(value = "insert/pages", name = "新增页面路由")
	public String insertPage() {

		return "/nideshopCommentPicture/insert";
	}

	/**
	* 新增接口
	*
	* @param nideshopCommentPictureArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public String insert(NideshopCommentPictureArgs nideshopCommentPictureArgs){

		//调用业务逻辑
		Integer result = nideshopCommentPictureService.insertSelective(nideshopCommentPictureArgs);

		return "redirect:/nideshop/comment/picture";
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
		NideshopCommentPicture result = nideshopCommentPictureService.selectByPrimaryKey(id);

		//数据返回html
		model.addAttribute("data", result);

		//返回页面路径
		return "/nideshopCommentPicture/update";
	}

	/**
	* 更新接口
	*
	* @param nideshopCommentPictureArgs
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public String update(NideshopCommentPictureArgs nideshopCommentPictureArgs){

		//调用业务逻辑
		Integer result = nideshopCommentPictureService.updateSelectiveByPrimaryKey(nideshopCommentPictureArgs);

		return "redirect:/nideshop/comment/picture";
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
		Integer result = nideshopCommentPictureService.deleteByPrimaryKey(id);



		return new ResponseVo<>(ResponseStatusEnum.SUCCESS, result);

	}
}
