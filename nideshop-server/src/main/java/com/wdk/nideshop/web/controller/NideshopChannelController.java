package com.wdk.nideshop.web.controller;

import com.wdk.nideshop.service.NideshopChannelService;
import com.alibaba.druid.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import com.wdk.nideshop.common.enums.ResponseStatusEnum;
import com.wdk.nideshop.common.model.ResponseVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopChannel;
import com.wdk.nideshop.web.args.NideshopChannelArgs;
import com.wdk.nideshop.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



//页面控制类
@RestController
@RequestMapping("api/nideshop/channel")
public class NideshopChannelController {

	//定义生成logger对象
	private static Logger logger=LoggerFactory.getLogger(NideshopChannelController.class);

	//逻辑处理对象
	@Autowired
	private NideshopChannelService nideshopChannelService;

	/**
	* 分页查询接口
	*
	* @param nideshopChannel
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "",name = "分页查询接口")
	public ResponseVo<PageInfo<NideshopChannel>> index(NideshopChannelArgs nideshopChannel, PageParam pageParam){

		//调用业务逻辑
		PageInfo<NideshopChannel> result = nideshopChannelService.pageInfo(nideshopChannel, pageParam);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 查询数据列表接口
	*
	* @param nideshopChannel
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "list",name = "查询数据列表接口")
	public ResponseVo<List<NideshopChannel>> list(NideshopChannelArgs nideshopChannel){

		//调用业务逻辑
		List<NideshopChannel> result = nideshopChannelService.list(nideshopChannel);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 根据条件统计总量接口
	*
	* @param nideshopChannel
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@RequestMapping(value = "count",name = "根据条件统计总量接口")
	public ResponseVo<Integer> count(NideshopChannelArgs nideshopChannel){

		//调用业务逻辑
		Integer result = nideshopChannelService.count(nideshopChannel);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 新增接口
	*
	* @param nideshopChannel
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "insert",name = "新增接口")
	public ResponseVo<Integer> insert(@RequestBody NideshopChannelArgs nideshopChannel){

		//调用业务逻辑
		Integer result = nideshopChannelService.insertSelective(nideshopChannel);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	* 更新接口
	*
	* @param nideshopChannel
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@PostMapping(value = "update",name = "更新接口")
	public ResponseVo<Integer> update(@RequestBody NideshopChannelArgs nideshopChannel){

		//调用业务逻辑
		Integer result = nideshopChannelService.updateSelectiveByPrimaryKey(nideshopChannel);

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
		Integer result = nideshopChannelService.deleteByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}

	/**
	 * 详情
	 *
	 * @param id
	 * @return
	 */
	@GetMapping(value = "detail/{id}", name = "详情方法")
	public ResponseVo<NideshopChannel> detail(@PathVariable Integer id) {
		//调用业务逻辑
		NideshopChannel result = nideshopChannelService.selectByPrimaryKey(id);

		return new ResponseVo(ResponseStatusEnum.SUCCESS, result);
	}


}
