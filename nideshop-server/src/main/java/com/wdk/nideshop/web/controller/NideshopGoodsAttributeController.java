package com.wdk.nideshop.web.controller;

import com.wdk.nideshop.service.NideshopGoodsAttributeService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopGoodsAttribute;
import com.wdk.nideshop.web.args.NideshopGoodsAttributeArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



//商品属性页面控制类
@RestController
@RequestMapping("api/nideshop/goods/attribute")
public class NideshopGoodsAttributeController {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopGoodsAttributeController.class);

	//商品属性逻辑处理对象
	@Autowired
	private NideshopGoodsAttributeService nideshopGoodsAttributeService;

	/**
	* 分页查询接口
	*
	* @param nideshopGoodsAttribute
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "分页查询接口")
	public ResponseVo<PageInfo<NideshopGoodsAttribute>> index(NideshopGoodsAttributeArgs nideshopGoodsAttribute, PageParam pageParam){

		//调用业务逻辑
		PageInfo<NideshopGoodsAttribute> result = nideshopGoodsAttributeService.pageInfo(nideshopGoodsAttribute, pageParam);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 查询数据列表接口
	*
	* @param nideshopGoodsAttribute
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "list",name = "查询数据列表接口")
	public ResponseVo<List<NideshopGoodsAttribute>> list(NideshopGoodsAttributeArgs nideshopGoodsAttribute){

		//调用业务逻辑
		List<NideshopGoodsAttribute> result = nideshopGoodsAttributeService.list(nideshopGoodsAttribute);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 根据条件统计总量接口
	*
	* @param nideshopGoodsAttribute
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "count",name = "根据条件统计总量接口")
	public ResponseVo<Integer> count(NideshopGoodsAttributeArgs nideshopGoodsAttribute){

		//调用业务逻辑
		Integer result = nideshopGoodsAttributeService.count(nideshopGoodsAttribute);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 新增接口
	*
	* @param nideshopGoodsAttribute
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public ResponseVo<Integer> insert(@RequestBody NideshopGoodsAttributeArgs nideshopGoodsAttribute){

		//调用业务逻辑
		Integer result = nideshopGoodsAttributeService.insertSelective(nideshopGoodsAttribute);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 更新接口
	*
	* @param nideshopGoodsAttribute
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public ResponseVo<Integer> update(@RequestBody NideshopGoodsAttributeArgs nideshopGoodsAttribute){

		//调用业务逻辑
		Integer result = nideshopGoodsAttributeService.updateSelectiveByPrimaryKey(nideshopGoodsAttribute);

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
		Integer result = nideshopGoodsAttributeService.deleteByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	 * 详情
	 *
	 * @param id
	 * @return
	 */
	@GetMapping(value = "detail/{id}", name = "详情方法")
	public ResponseVo<NideshopGoodsAttribute> detail(@PathVariable Integer id) {
		//调用业务逻辑
		NideshopGoodsAttribute result = nideshopGoodsAttributeService.selectByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}


}
