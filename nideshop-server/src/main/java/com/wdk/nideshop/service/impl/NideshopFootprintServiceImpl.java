package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopFootprint;
import com.wdk.nideshop.web.args.NideshopFootprintArgs;
import com.wdk.nideshop.service.NideshopFootprintService;
import com.wdk.nideshop.storage.dao.NideshopFootprintMapper;
import com.wdk.nideshop.utils.TimeUtils;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

/**
 *
 * @author wdke
 * @date 2019/12/30
 */
@Service
public class NideshopFootprintServiceImpl implements NideshopFootprintService{

	private static Logger logger=LoggerFactory.getLogger(NideshopFootprintServiceImpl.class);

	@Autowired
	private NideshopFootprintMapper nideshopFootprintMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopFootprintMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopFootprint
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopFootprint> selectListByMap(Map<String,Object> param){

		List<NideshopFootprint> result=nideshopFootprintMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopFootprint
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopFootprint> list(NideshopFootprintArgs param){

		//参数类型转化
		NideshopFootprint nideshopFootprint = new NideshopFootprint();

		BeanUtils.copyProperties(param,nideshopFootprint);

		List<NideshopFootprint> result=nideshopFootprintMapper.list(nideshopFootprint);

		return result;
	}

	/**
	* 统计接口

	* @param param
	* @return Integer
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public Integer count(NideshopFootprintArgs param){

		//参数类型转化
		NideshopFootprint nideshopFootprint = new NideshopFootprint();

		BeanUtils.copyProperties(param,nideshopFootprint);

		Integer result=nideshopFootprintMapper.count(nideshopFootprint);

		return result;
	}

	/**
	* 根据主键查询数据
	*
	* @param id
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public NideshopFootprint selectByPrimaryKey(Integer id){

		NideshopFootprint result=nideshopFootprintMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopFootprint:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopFootprint> pageInfo(NideshopFootprintArgs param,PageParam pageParam){

		//参数类型转化
		NideshopFootprint nideshopFootprint = new NideshopFootprint();
		BeanUtils.copyProperties(param,nideshopFootprint);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopFootprint> result=nideshopFootprintMapper.list(nideshopFootprint);
		return new PageInfo(result);
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int insert(NideshopFootprint param){

		int result=nideshopFootprintMapper.insert(param);
		return result;
	}

	/**
	* 不为空新增
	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int insertSelective(NideshopFootprintArgs param){

		//参数类型转化
		NideshopFootprint nideshopFootprint = new NideshopFootprint();
		BeanUtils.copyProperties(param,nideshopFootprint);

		int result=nideshopFootprintMapper.insertSelective(nideshopFootprint);

		return result;
	}

	/**
	* 批量新增
	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsert(List<NideshopFootprint> param){

		int result=nideshopFootprintMapper.batchInsert(param);
		return result;
	}

	/**
	* 根据主键更新全量
	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int updateByPrimaryKey(NideshopFootprint param){

		int result=nideshopFootprintMapper.updateByPrimaryKey(param);
		return result;
	}

	/**
	* 根据主键更新全量

	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int updateSelectiveByPrimaryKey(NideshopFootprintArgs param){

		//参数类型转化
		NideshopFootprint nideshopFootprint = new NideshopFootprint();
		BeanUtils.copyProperties(param,nideshopFootprint);

		int result=nideshopFootprintMapper.updateSelectiveByPrimaryKey( nideshopFootprint);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopFootprint> param){

		int result=nideshopFootprintMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopFootprint> param){

		int result=nideshopFootprintMapper.batchUpdate(param);
		return result;
	}

	/**
	* 根据主键删除数据
	* @param id
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteByPrimaryKey(Integer id){

		int result=nideshopFootprintMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopFootprint param){

		int result=nideshopFootprintMapper.deleteBySelect(param);
		return result;
	}



}