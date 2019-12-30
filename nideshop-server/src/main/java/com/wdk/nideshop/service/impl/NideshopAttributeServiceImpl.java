package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopAttribute;
import com.wdk.nideshop.web.args.NideshopAttributeArgs;
import com.wdk.nideshop.service.NideshopAttributeService;
import com.wdk.nideshop.storage.dao.NideshopAttributeMapper;
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
public class NideshopAttributeServiceImpl implements NideshopAttributeService{

	private static Logger logger=LoggerFactory.getLogger(NideshopAttributeServiceImpl.class);

	@Autowired
	private NideshopAttributeMapper nideshopAttributeMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopAttributeMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopAttribute
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopAttribute> selectListByMap(Map<String,Object> param){

		List<NideshopAttribute> result=nideshopAttributeMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopAttribute
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopAttribute> list(NideshopAttributeArgs param){

		//参数类型转化
		NideshopAttribute nideshopAttribute = new NideshopAttribute();

		BeanUtils.copyProperties(param,nideshopAttribute);

		List<NideshopAttribute> result=nideshopAttributeMapper.list(nideshopAttribute);

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
	public Integer count(NideshopAttributeArgs param){

		//参数类型转化
		NideshopAttribute nideshopAttribute = new NideshopAttribute();

		BeanUtils.copyProperties(param,nideshopAttribute);

		Integer result=nideshopAttributeMapper.count(nideshopAttribute);

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
	public NideshopAttribute selectByPrimaryKey(Integer id){

		NideshopAttribute result=nideshopAttributeMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopAttribute:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopAttribute> pageInfo(NideshopAttributeArgs param,PageParam pageParam){

		//参数类型转化
		NideshopAttribute nideshopAttribute = new NideshopAttribute();
		BeanUtils.copyProperties(param,nideshopAttribute);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopAttribute> result=nideshopAttributeMapper.list(nideshopAttribute);
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
	public int insert(NideshopAttribute param){

		int result=nideshopAttributeMapper.insert(param);
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
	public int insertSelective(NideshopAttributeArgs param){

		//参数类型转化
		NideshopAttribute nideshopAttribute = new NideshopAttribute();
		BeanUtils.copyProperties(param,nideshopAttribute);

		int result=nideshopAttributeMapper.insertSelective(nideshopAttribute);

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
	public int batchInsert(List<NideshopAttribute> param){

		int result=nideshopAttributeMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopAttribute param){

		int result=nideshopAttributeMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopAttributeArgs param){

		//参数类型转化
		NideshopAttribute nideshopAttribute = new NideshopAttribute();
		BeanUtils.copyProperties(param,nideshopAttribute);

		int result=nideshopAttributeMapper.updateSelectiveByPrimaryKey( nideshopAttribute);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopAttribute> param){

		int result=nideshopAttributeMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopAttribute> param){

		int result=nideshopAttributeMapper.batchUpdate(param);
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

		int result=nideshopAttributeMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopAttribute param){

		int result=nideshopAttributeMapper.deleteBySelect(param);
		return result;
	}



}