package com.wdk.nideshop.web.controller;

import com.wdk.nideshop.service.NideshopOrderService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopOrder;
import com.wdk.nideshop.web.args.NideshopOrderArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



//页面控制类
@RestController
@RequestMapping("api/nideshop/order")
public class NideshopOrderController {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopOrderController.class);

	//逻辑处理对象
	@Autowired
	private NideshopOrderService nideshopOrderService;

	/**
	* 分页查询接口
	*
	* @param nideshopOrder
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "分页查询接口")
	public ResponseVo<PageInfo<NideshopOrder>> index(NideshopOrderArgs nideshopOrder, PageParam pageParam){

		//调用业务逻辑
		PageInfo<NideshopOrder> result = nideshopOrderService.pageInfo(nideshopOrder, pageParam);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 查询数据列表接口
	*
	* @param nideshopOrder
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "list",name = "查询数据列表接口")
	public ResponseVo<List<NideshopOrder>> list(NideshopOrderArgs nideshopOrder){

		//调用业务逻辑
		List<NideshopOrder> result = nideshopOrderService.list(nideshopOrder);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 根据条件统计总量接口
	*
	* @param nideshopOrder
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "count",name = "根据条件统计总量接口")
	public ResponseVo<Integer> count(NideshopOrderArgs nideshopOrder){

		//调用业务逻辑
		Integer result = nideshopOrderService.count(nideshopOrder);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 新增接口
	*
	* @param nideshopOrder
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public ResponseVo<Integer> insert(@RequestBody NideshopOrderArgs nideshopOrder){

		//调用业务逻辑
		Integer result = nideshopOrderService.insertSelective(nideshopOrder);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 更新接口
	*
	* @param nideshopOrder
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public ResponseVo<Integer> update(@RequestBody NideshopOrderArgs nideshopOrder){

		//调用业务逻辑
		Integer result = nideshopOrderService.updateSelectiveByPrimaryKey(nideshopOrder);

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
		Integer result = nideshopOrderService.deleteByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	 * 详情
	 *
	 * @param id
	 * @return
	 */
	@GetMapping(value = "detail/{id}", name = "详情方法")
	public ResponseVo<NideshopOrder> detail(@PathVariable Integer id) {
		//调用业务逻辑
		NideshopOrder result = nideshopOrderService.selectByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}


}
