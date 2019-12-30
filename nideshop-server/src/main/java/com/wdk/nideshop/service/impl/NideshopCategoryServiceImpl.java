package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopCategory;
import com.wdk.nideshop.web.args.NideshopCategoryArgs;
import com.wdk.nideshop.service.NideshopCategoryService;
import com.wdk.nideshop.storage.dao.NideshopCategoryMapper;
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
 *类别
 * @author wdke
 * @date 2019/12/30
 */
@Service
public class NideshopCategoryServiceImpl implements NideshopCategoryService{

	private static Logger logger=LoggerFactory.getLogger(NideshopCategoryServiceImpl.class);

	@Autowired
	private NideshopCategoryMapper nideshopCategoryMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopCategoryMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopCategory
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopCategory> selectListByMap(Map<String,Object> param){

		List<NideshopCategory> result=nideshopCategoryMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopCategory
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopCategory> list(NideshopCategoryArgs param){

		//参数类型转化
		NideshopCategory nideshopCategory = new NideshopCategory();

		BeanUtils.copyProperties(param,nideshopCategory);

		List<NideshopCategory> result=nideshopCategoryMapper.list(nideshopCategory);

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
	public Integer count(NideshopCategoryArgs param){

		//参数类型转化
		NideshopCategory nideshopCategory = new NideshopCategory();

		BeanUtils.copyProperties(param,nideshopCategory);

		Integer result=nideshopCategoryMapper.count(nideshopCategory);

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
	public NideshopCategory selectByPrimaryKey(Integer id){

		NideshopCategory result=nideshopCategoryMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopCategory:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopCategory> pageInfo(NideshopCategoryArgs param,PageParam pageParam){

		//参数类型转化
		NideshopCategory nideshopCategory = new NideshopCategory();
		BeanUtils.copyProperties(param,nideshopCategory);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopCategory> result=nideshopCategoryMapper.list(nideshopCategory);
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
	public int insert(NideshopCategory param){

		int result=nideshopCategoryMapper.insert(param);
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
	public int insertSelective(NideshopCategoryArgs param){

		//参数类型转化
		NideshopCategory nideshopCategory = new NideshopCategory();
		BeanUtils.copyProperties(param,nideshopCategory);

		int result=nideshopCategoryMapper.insertSelective(nideshopCategory);

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
	public int batchInsert(List<NideshopCategory> param){

		int result=nideshopCategoryMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopCategory param){

		int result=nideshopCategoryMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopCategoryArgs param){

		//参数类型转化
		NideshopCategory nideshopCategory = new NideshopCategory();
		BeanUtils.copyProperties(param,nideshopCategory);

		int result=nideshopCategoryMapper.updateSelectiveByPrimaryKey( nideshopCategory);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopCategory> param){

		int result=nideshopCategoryMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopCategory> param){

		int result=nideshopCategoryMapper.batchUpdate(param);
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

		int result=nideshopCategoryMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopCategory param){

		int result=nideshopCategoryMapper.deleteBySelect(param);
		return result;
	}



}