package com.wdk.nideshop.web.controller;

import com.wdk.nideshop.service.NideshopKeywordsService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopKeywords;
import com.wdk.nideshop.web.args.NideshopKeywordsArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



//热闹关键词表页面控制类
@RestController
@RequestMapping("api/nideshop/keywords")
public class NideshopKeywordsController {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopKeywordsController.class);

	//热闹关键词表逻辑处理对象
	@Autowired
	private NideshopKeywordsService nideshopKeywordsService;

	/**
	* 分页查询接口
	*
	* @param nideshopKeywords
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "分页查询接口")
	public ResponseVo<PageInfo<NideshopKeywords>> index(NideshopKeywordsArgs nideshopKeywords, PageParam pageParam){

		//调用业务逻辑
		PageInfo<NideshopKeywords> result = nideshopKeywordsService.pageInfo(nideshopKeywords, pageParam);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 查询数据列表接口
	*
	* @param nideshopKeywords
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "list",name = "查询数据列表接口")
	public ResponseVo<List<NideshopKeywords>> list(NideshopKeywordsArgs nideshopKeywords){

		//调用业务逻辑
		List<NideshopKeywords> result = nideshopKeywordsService.list(nideshopKeywords);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 根据条件统计总量接口
	*
	* @param nideshopKeywords
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "count",name = "根据条件统计总量接口")
	public ResponseVo<Integer> count(NideshopKeywordsArgs nideshopKeywords){

		//调用业务逻辑
		Integer result = nideshopKeywordsService.count(nideshopKeywords);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 新增接口
	*
	* @param nideshopKeywords
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public ResponseVo<Integer> insert(@RequestBody NideshopKeywordsArgs nideshopKeywords){

		//调用业务逻辑
		Integer result = nideshopKeywordsService.insertSelective(nideshopKeywords);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 更新接口
	*
	* @param nideshopKeywords
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public ResponseVo<Integer> update(@RequestBody NideshopKeywordsArgs nideshopKeywords){

		//调用业务逻辑
		Integer result = nideshopKeywordsService.updateSelectiveByPrimaryKey(nideshopKeywords);

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
		Integer result = nideshopKeywordsService.deleteByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	 * 详情
	 *
	 * @param id
	 * @return
	 */
	@GetMapping(value = "detail/{id}", name = "详情方法")
	public ResponseVo<NideshopKeywords> detail(@PathVariable Integer id) {
		//调用业务逻辑
		NideshopKeywords result = nideshopKeywordsService.selectByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}


}
