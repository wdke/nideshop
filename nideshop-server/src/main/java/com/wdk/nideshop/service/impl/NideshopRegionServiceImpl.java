package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopRegion;
import com.wdk.nideshop.web.args.NideshopRegionArgs;
import com.wdk.nideshop.service.NideshopRegionService;
import com.wdk.nideshop.storage.dao.NideshopRegionMapper;
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
public class NideshopRegionServiceImpl implements NideshopRegionService{

	private static Logger logger=LoggerFactory.getLogger(NideshopRegionServiceImpl.class);

	@Autowired
	private NideshopRegionMapper nideshopRegionMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopRegionMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopRegion
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopRegion> selectListByMap(Map<String,Object> param){

		List<NideshopRegion> result=nideshopRegionMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopRegion
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopRegion> list(NideshopRegionArgs param){

		//参数类型转化
		NideshopRegion nideshopRegion = new NideshopRegion();

		BeanUtils.copyProperties(param,nideshopRegion);

		List<NideshopRegion> result=nideshopRegionMapper.list(nideshopRegion);

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
	public Integer count(NideshopRegionArgs param){

		//参数类型转化
		NideshopRegion nideshopRegion = new NideshopRegion();

		BeanUtils.copyProperties(param,nideshopRegion);

		Integer result=nideshopRegionMapper.count(nideshopRegion);

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
	public NideshopRegion selectByPrimaryKey(Short id){

		NideshopRegion result=nideshopRegionMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopRegion:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopRegion> pageInfo(NideshopRegionArgs param,PageParam pageParam){

		//参数类型转化
		NideshopRegion nideshopRegion = new NideshopRegion();
		BeanUtils.copyProperties(param,nideshopRegion);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopRegion> result=nideshopRegionMapper.list(nideshopRegion);
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
	public int insert(NideshopRegion param){

		int result=nideshopRegionMapper.insert(param);
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
	public int insertSelective(NideshopRegionArgs param){

		//参数类型转化
		NideshopRegion nideshopRegion = new NideshopRegion();
		BeanUtils.copyProperties(param,nideshopRegion);

		int result=nideshopRegionMapper.insertSelective(nideshopRegion);

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
	public int batchInsert(List<NideshopRegion> param){

		int result=nideshopRegionMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopRegion param){

		int result=nideshopRegionMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopRegionArgs param){

		//参数类型转化
		NideshopRegion nideshopRegion = new NideshopRegion();
		BeanUtils.copyProperties(param,nideshopRegion);

		int result=nideshopRegionMapper.updateSelectiveByPrimaryKey( nideshopRegion);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopRegion> param){

		int result=nideshopRegionMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopRegion> param){

		int result=nideshopRegionMapper.batchUpdate(param);
		return result;
	}

	/**
	* 根据主键删除数据
	* @param id
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteByPrimaryKey(Short id){

		int result=nideshopRegionMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopRegion param){

		int result=nideshopRegionMapper.deleteBySelect(param);
		return result;
	}



}