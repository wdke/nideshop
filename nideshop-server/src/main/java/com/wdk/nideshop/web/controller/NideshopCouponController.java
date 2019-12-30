package com.wdk.nideshop.web.controller;

import com.wdk.nideshop.service.NideshopCouponService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopCoupon;
import com.wdk.nideshop.web.args.NideshopCouponArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



//页面控制类
@RestController
@RequestMapping("api/nideshop/coupon")
public class NideshopCouponController {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopCouponController.class);

	//逻辑处理对象
	@Autowired
	private NideshopCouponService nideshopCouponService;

	/**
	* 分页查询接口
	*
	* @param nideshopCoupon
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "分页查询接口")
	public ResponseVo<PageInfo<NideshopCoupon>> index(NideshopCouponArgs nideshopCoupon, PageParam pageParam){

		//调用业务逻辑
		PageInfo<NideshopCoupon> result = nideshopCouponService.pageInfo(nideshopCoupon, pageParam);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 查询数据列表接口
	*
	* @param nideshopCoupon
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "list",name = "查询数据列表接口")
	public ResponseVo<List<NideshopCoupon>> list(NideshopCouponArgs nideshopCoupon){

		//调用业务逻辑
		List<NideshopCoupon> result = nideshopCouponService.list(nideshopCoupon);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 根据条件统计总量接口
	*
	* @param nideshopCoupon
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "count",name = "根据条件统计总量接口")
	public ResponseVo<Integer> count(NideshopCouponArgs nideshopCoupon){

		//调用业务逻辑
		Integer result = nideshopCouponService.count(nideshopCoupon);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 新增接口
	*
	* @param nideshopCoupon
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public ResponseVo<Integer> insert(@RequestBody NideshopCouponArgs nideshopCoupon){

		//调用业务逻辑
		Integer result = nideshopCouponService.insertSelective(nideshopCoupon);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 更新接口
	*
	* @param nideshopCoupon
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public ResponseVo<Integer> update(@RequestBody NideshopCouponArgs nideshopCoupon){

		//调用业务逻辑
		Integer result = nideshopCouponService.updateSelectiveByPrimaryKey(nideshopCoupon);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	 * 移除方法
	 *
	 * @param id
	 * @return
	 */
	@PostMapping(value = "remove/{id}", name = "移除方法")
	public ResponseVo<Integer> remove(@PathVariable Short id) {
		//调用业务逻辑
		Integer result = nideshopCouponService.deleteByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	 * 详情
	 *
	 * @param id
	 * @return
	 */
	@GetMapping(value = "detail/{id}", name = "详情方法")
	public ResponseVo<NideshopCoupon> detail(@PathVariable Short id) {
		//调用业务逻辑
		NideshopCoupon result = nideshopCouponService.selectByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}


}
