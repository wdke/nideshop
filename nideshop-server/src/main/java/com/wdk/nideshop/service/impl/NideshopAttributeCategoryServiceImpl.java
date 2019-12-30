package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopAttributeCategory;
import com.wdk.nideshop.web.args.NideshopAttributeCategoryArgs;
import com.wdk.nideshop.service.NideshopAttributeCategoryService;
import com.wdk.nideshop.storage.dao.NideshopAttributeCategoryMapper;
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
public class NideshopAttributeCategoryServiceImpl implements NideshopAttributeCategoryService{

	private static Logger logger=LoggerFactory.getLogger(NideshopAttributeCategoryServiceImpl.class);

	@Autowired
	private NideshopAttributeCategoryMapper nideshopAttributeCategoryMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopAttributeCategoryMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopAttributeCategory
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopAttributeCategory> selectListByMap(Map<String,Object> param){

		List<NideshopAttributeCategory> result=nideshopAttributeCategoryMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopAttributeCategory
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopAttributeCategory> list(NideshopAttributeCategoryArgs param){

		//参数类型转化
		NideshopAttributeCategory nideshopAttributeCategory = new NideshopAttributeCategory();

		BeanUtils.copyProperties(param,nideshopAttributeCategory);

		List<NideshopAttributeCategory> result=nideshopAttributeCategoryMapper.list(nideshopAttributeCategory);

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
	public Integer count(NideshopAttributeCategoryArgs param){

		//参数类型转化
		NideshopAttributeCategory nideshopAttributeCategory = new NideshopAttributeCategory();

		BeanUtils.copyProperties(param,nideshopAttributeCategory);

		Integer result=nideshopAttributeCategoryMapper.count(nideshopAttributeCategory);

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
	public NideshopAttributeCategory selectByPrimaryKey(Integer id){

		NideshopAttributeCategory result=nideshopAttributeCategoryMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopAttributeCategory:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopAttributeCategory> pageInfo(NideshopAttributeCategoryArgs param,PageParam pageParam){

		//参数类型转化
		NideshopAttributeCategory nideshopAttributeCategory = new NideshopAttributeCategory();
		BeanUtils.copyProperties(param,nideshopAttributeCategory);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopAttributeCategory> result=nideshopAttributeCategoryMapper.list(nideshopAttributeCategory);
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
	public int insert(NideshopAttributeCategory param){

		int result=nideshopAttributeCategoryMapper.insert(param);
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
	public int insertSelective(NideshopAttributeCategoryArgs param){

		//参数类型转化
		NideshopAttributeCategory nideshopAttributeCategory = new NideshopAttributeCategory();
		BeanUtils.copyProperties(param,nideshopAttributeCategory);

		int result=nideshopAttributeCategoryMapper.insertSelective(nideshopAttributeCategory);

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
	public int batchInsert(List<NideshopAttributeCategory> param){

		int result=nideshopAttributeCategoryMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopAttributeCategory param){

		int result=nideshopAttributeCategoryMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopAttributeCategoryArgs param){

		//参数类型转化
		NideshopAttributeCategory nideshopAttributeCategory = new NideshopAttributeCategory();
		BeanUtils.copyProperties(param,nideshopAttributeCategory);

		int result=nideshopAttributeCategoryMapper.updateSelectiveByPrimaryKey( nideshopAttributeCategory);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopAttributeCategory> param){

		int result=nideshopAttributeCategoryMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopAttributeCategory> param){

		int result=nideshopAttributeCategoryMapper.batchUpdate(param);
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

		int result=nideshopAttributeCategoryMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopAttributeCategory param){

		int result=nideshopAttributeCategoryMapper.deleteBySelect(param);
		return result;
	}



}