package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopTopicCategory;
import com.wdk.nideshop.web.args.NideshopTopicCategoryArgs;
import com.wdk.nideshop.service.NideshopTopicCategoryService;
import com.wdk.nideshop.storage.dao.NideshopTopicCategoryMapper;
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
public class NideshopTopicCategoryServiceImpl implements NideshopTopicCategoryService{

	private static Logger logger=LoggerFactory.getLogger(NideshopTopicCategoryServiceImpl.class);

	@Autowired
	private NideshopTopicCategoryMapper nideshopTopicCategoryMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopTopicCategoryMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopTopicCategory
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopTopicCategory> selectListByMap(Map<String,Object> param){

		List<NideshopTopicCategory> result=nideshopTopicCategoryMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopTopicCategory
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopTopicCategory> list(NideshopTopicCategoryArgs param){

		//参数类型转化
		NideshopTopicCategory nideshopTopicCategory = new NideshopTopicCategory();

		BeanUtils.copyProperties(param,nideshopTopicCategory);

		List<NideshopTopicCategory> result=nideshopTopicCategoryMapper.list(nideshopTopicCategory);

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
	public Integer count(NideshopTopicCategoryArgs param){

		//参数类型转化
		NideshopTopicCategory nideshopTopicCategory = new NideshopTopicCategory();

		BeanUtils.copyProperties(param,nideshopTopicCategory);

		Integer result=nideshopTopicCategoryMapper.count(nideshopTopicCategory);

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
	public NideshopTopicCategory selectByPrimaryKey(Integer id){

		NideshopTopicCategory result=nideshopTopicCategoryMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopTopicCategory:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopTopicCategory> pageInfo(NideshopTopicCategoryArgs param,PageParam pageParam){

		//参数类型转化
		NideshopTopicCategory nideshopTopicCategory = new NideshopTopicCategory();
		BeanUtils.copyProperties(param,nideshopTopicCategory);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopTopicCategory> result=nideshopTopicCategoryMapper.list(nideshopTopicCategory);
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
	public int insert(NideshopTopicCategory param){

		int result=nideshopTopicCategoryMapper.insert(param);
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
	public int insertSelective(NideshopTopicCategoryArgs param){

		//参数类型转化
		NideshopTopicCategory nideshopTopicCategory = new NideshopTopicCategory();
		BeanUtils.copyProperties(param,nideshopTopicCategory);

		int result=nideshopTopicCategoryMapper.insertSelective(nideshopTopicCategory);

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
	public int batchInsert(List<NideshopTopicCategory> param){

		int result=nideshopTopicCategoryMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopTopicCategory param){

		int result=nideshopTopicCategoryMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopTopicCategoryArgs param){

		//参数类型转化
		NideshopTopicCategory nideshopTopicCategory = new NideshopTopicCategory();
		BeanUtils.copyProperties(param,nideshopTopicCategory);

		int result=nideshopTopicCategoryMapper.updateSelectiveByPrimaryKey( nideshopTopicCategory);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopTopicCategory> param){

		int result=nideshopTopicCategoryMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopTopicCategory> param){

		int result=nideshopTopicCategoryMapper.batchUpdate(param);
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

		int result=nideshopTopicCategoryMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopTopicCategory param){

		int result=nideshopTopicCategoryMapper.deleteBySelect(param);
		return result;
	}



}