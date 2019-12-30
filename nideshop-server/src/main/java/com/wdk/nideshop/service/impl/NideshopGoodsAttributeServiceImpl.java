package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopGoodsAttribute;
import com.wdk.nideshop.web.args.NideshopGoodsAttributeArgs;
import com.wdk.nideshop.service.NideshopGoodsAttributeService;
import com.wdk.nideshop.storage.dao.NideshopGoodsAttributeMapper;
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
 *商品属性
 * @author wdke
 * @date 2019/12/30
 */
@Service
public class NideshopGoodsAttributeServiceImpl implements NideshopGoodsAttributeService{

	private static Logger logger=LoggerFactory.getLogger(NideshopGoodsAttributeServiceImpl.class);

	@Autowired
	private NideshopGoodsAttributeMapper nideshopGoodsAttributeMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopGoodsAttributeMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopGoodsAttribute
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopGoodsAttribute> selectListByMap(Map<String,Object> param){

		List<NideshopGoodsAttribute> result=nideshopGoodsAttributeMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopGoodsAttribute
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopGoodsAttribute> list(NideshopGoodsAttributeArgs param){

		//参数类型转化
		NideshopGoodsAttribute nideshopGoodsAttribute = new NideshopGoodsAttribute();

		BeanUtils.copyProperties(param,nideshopGoodsAttribute);

		List<NideshopGoodsAttribute> result=nideshopGoodsAttributeMapper.list(nideshopGoodsAttribute);

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
	public Integer count(NideshopGoodsAttributeArgs param){

		//参数类型转化
		NideshopGoodsAttribute nideshopGoodsAttribute = new NideshopGoodsAttribute();

		BeanUtils.copyProperties(param,nideshopGoodsAttribute);

		Integer result=nideshopGoodsAttributeMapper.count(nideshopGoodsAttribute);

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
	public NideshopGoodsAttribute selectByPrimaryKey(Integer id){

		NideshopGoodsAttribute result=nideshopGoodsAttributeMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopGoodsAttribute:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopGoodsAttribute> pageInfo(NideshopGoodsAttributeArgs param,PageParam pageParam){

		//参数类型转化
		NideshopGoodsAttribute nideshopGoodsAttribute = new NideshopGoodsAttribute();
		BeanUtils.copyProperties(param,nideshopGoodsAttribute);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopGoodsAttribute> result=nideshopGoodsAttributeMapper.list(nideshopGoodsAttribute);
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
	public int insert(NideshopGoodsAttribute param){

		int result=nideshopGoodsAttributeMapper.insert(param);
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
	public int insertSelective(NideshopGoodsAttributeArgs param){

		//参数类型转化
		NideshopGoodsAttribute nideshopGoodsAttribute = new NideshopGoodsAttribute();
		BeanUtils.copyProperties(param,nideshopGoodsAttribute);

		int result=nideshopGoodsAttributeMapper.insertSelective(nideshopGoodsAttribute);

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
	public int batchInsert(List<NideshopGoodsAttribute> param){

		int result=nideshopGoodsAttributeMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopGoodsAttribute param){

		int result=nideshopGoodsAttributeMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopGoodsAttributeArgs param){

		//参数类型转化
		NideshopGoodsAttribute nideshopGoodsAttribute = new NideshopGoodsAttribute();
		BeanUtils.copyProperties(param,nideshopGoodsAttribute);

		int result=nideshopGoodsAttributeMapper.updateSelectiveByPrimaryKey( nideshopGoodsAttribute);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopGoodsAttribute> param){

		int result=nideshopGoodsAttributeMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopGoodsAttribute> param){

		int result=nideshopGoodsAttributeMapper.batchUpdate(param);
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

		int result=nideshopGoodsAttributeMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopGoodsAttribute param){

		int result=nideshopGoodsAttributeMapper.deleteBySelect(param);
		return result;
	}



}