package com.wdk.nideshop.web.controller;

import com.wdk.nideshop.service.NideshopOrderExpressService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopOrderExpress;
import com.wdk.nideshop.web.args.NideshopOrderExpressArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



//订单物流信息表，发货时生成页面控制类
@RestController
@RequestMapping("api/nideshop/order/express")
public class NideshopOrderExpressController {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopOrderExpressController.class);

	//订单物流信息表，发货时生成逻辑处理对象
	@Autowired
	private NideshopOrderExpressService nideshopOrderExpressService;

	/**
	* 分页查询接口
	*
	* @param nideshopOrderExpress
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "分页查询接口")
	public ResponseVo<PageInfo<NideshopOrderExpress>> index(NideshopOrderExpressArgs nideshopOrderExpress, PageParam pageParam){

		//调用业务逻辑
		PageInfo<NideshopOrderExpress> result = nideshopOrderExpressService.pageInfo(nideshopOrderExpress, pageParam);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 查询数据列表接口
	*
	* @param nideshopOrderExpress
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "list",name = "查询数据列表接口")
	public ResponseVo<List<NideshopOrderExpress>> list(NideshopOrderExpressArgs nideshopOrderExpress){

		//调用业务逻辑
		List<NideshopOrderExpress> result = nideshopOrderExpressService.list(nideshopOrderExpress);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 根据条件统计总量接口
	*
	* @param nideshopOrderExpress
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "count",name = "根据条件统计总量接口")
	public ResponseVo<Integer> count(NideshopOrderExpressArgs nideshopOrderExpress){

		//调用业务逻辑
		Integer result = nideshopOrderExpressService.count(nideshopOrderExpress);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 新增接口
	*
	* @param nideshopOrderExpress
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public ResponseVo<Integer> insert(@RequestBody NideshopOrderExpressArgs nideshopOrderExpress){

		//调用业务逻辑
		Integer result = nideshopOrderExpressService.insertSelective(nideshopOrderExpress);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 更新接口
	*
	* @param nideshopOrderExpress
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public ResponseVo<Integer> update(@RequestBody NideshopOrderExpressArgs nideshopOrderExpress){

		//调用业务逻辑
		Integer result = nideshopOrderExpressService.updateSelectiveByPrimaryKey(nideshopOrderExpress);

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
		Integer result = nideshopOrderExpressService.deleteByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	 * 详情
	 *
	 * @param id
	 * @return
	 */
	@GetMapping(value = "detail/{id}", name = "详情方法")
	public ResponseVo<NideshopOrderExpress> detail(@PathVariable Integer id) {
		//调用业务逻辑
		NideshopOrderExpress result = nideshopOrderExpressService.selectByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}


}
