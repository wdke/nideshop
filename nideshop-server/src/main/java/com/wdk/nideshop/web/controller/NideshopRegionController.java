package com.wdk.nideshop.web.controller;

import com.wdk.nideshop.service.NideshopRegionService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopRegion;
import com.wdk.nideshop.web.args.NideshopRegionArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



//页面控制类
@RestController
@RequestMapping("api/nideshop/region")
public class NideshopRegionController {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopRegionController.class);

	//逻辑处理对象
	@Autowired
	private NideshopRegionService nideshopRegionService;

	/**
	* 分页查询接口
	*
	* @param nideshopRegion
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "分页查询接口")
	public ResponseVo<PageInfo<NideshopRegion>> index(NideshopRegionArgs nideshopRegion, PageParam pageParam){

		//调用业务逻辑
		PageInfo<NideshopRegion> result = nideshopRegionService.pageInfo(nideshopRegion, pageParam);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 查询数据列表接口
	*
	* @param nideshopRegion
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "list",name = "查询数据列表接口")
	public ResponseVo<List<NideshopRegion>> list(NideshopRegionArgs nideshopRegion){

		//调用业务逻辑
		List<NideshopRegion> result = nideshopRegionService.list(nideshopRegion);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 根据条件统计总量接口
	*
	* @param nideshopRegion
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "count",name = "根据条件统计总量接口")
	public ResponseVo<Integer> count(NideshopRegionArgs nideshopRegion){

		//调用业务逻辑
		Integer result = nideshopRegionService.count(nideshopRegion);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 新增接口
	*
	* @param nideshopRegion
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public ResponseVo<Integer> insert(@RequestBody NideshopRegionArgs nideshopRegion){

		//调用业务逻辑
		Integer result = nideshopRegionService.insertSelective(nideshopRegion);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 更新接口
	*
	* @param nideshopRegion
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public ResponseVo<Integer> update(@RequestBody NideshopRegionArgs nideshopRegion){

		//调用业务逻辑
		Integer result = nideshopRegionService.updateSelectiveByPrimaryKey(nideshopRegion);

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
		Integer result = nideshopRegionService.deleteByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	 * 详情
	 *
	 * @param id
	 * @return
	 */
	@GetMapping(value = "detail/{id}", name = "详情方法")
	public ResponseVo<NideshopRegion> detail(@PathVariable Short id) {
		//调用业务逻辑
		NideshopRegion result = nideshopRegionService.selectByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}


}
