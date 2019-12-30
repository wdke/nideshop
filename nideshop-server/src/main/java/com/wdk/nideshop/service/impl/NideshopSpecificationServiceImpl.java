package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopSpecification;
import com.wdk.nideshop.web.args.NideshopSpecificationArgs;
import com.wdk.nideshop.service.NideshopSpecificationService;
import com.wdk.nideshop.storage.dao.NideshopSpecificationMapper;
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
 *规格表
 * @author wdke
 * @date 2019/12/30
 */
@Service
public class NideshopSpecificationServiceImpl implements NideshopSpecificationService{

	private static Logger logger=LoggerFactory.getLogger(NideshopSpecificationServiceImpl.class);

	@Autowired
	private NideshopSpecificationMapper nideshopSpecificationMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopSpecificationMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopSpecification
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopSpecification> selectListByMap(Map<String,Object> param){

		List<NideshopSpecification> result=nideshopSpecificationMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopSpecification
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopSpecification> list(NideshopSpecificationArgs param){

		//参数类型转化
		NideshopSpecification nideshopSpecification = new NideshopSpecification();

		BeanUtils.copyProperties(param,nideshopSpecification);

		List<NideshopSpecification> result=nideshopSpecificationMapper.list(nideshopSpecification);

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
	public Integer count(NideshopSpecificationArgs param){

		//参数类型转化
		NideshopSpecification nideshopSpecification = new NideshopSpecification();

		BeanUtils.copyProperties(param,nideshopSpecification);

		Integer result=nideshopSpecificationMapper.count(nideshopSpecification);

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
	public NideshopSpecification selectByPrimaryKey(Integer id){

		NideshopSpecification result=nideshopSpecificationMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopSpecification:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopSpecification> pageInfo(NideshopSpecificationArgs param,PageParam pageParam){

		//参数类型转化
		NideshopSpecification nideshopSpecification = new NideshopSpecification();
		BeanUtils.copyProperties(param,nideshopSpecification);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopSpecification> result=nideshopSpecificationMapper.list(nideshopSpecification);
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
	public int insert(NideshopSpecification param){

		int result=nideshopSpecificationMapper.insert(param);
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
	public int insertSelective(NideshopSpecificationArgs param){

		//参数类型转化
		NideshopSpecification nideshopSpecification = new NideshopSpecification();
		BeanUtils.copyProperties(param,nideshopSpecification);

		int result=nideshopSpecificationMapper.insertSelective(nideshopSpecification);

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
	public int batchInsert(List<NideshopSpecification> param){

		int result=nideshopSpecificationMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopSpecification param){

		int result=nideshopSpecificationMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopSpecificationArgs param){

		//参数类型转化
		NideshopSpecification nideshopSpecification = new NideshopSpecification();
		BeanUtils.copyProperties(param,nideshopSpecification);

		int result=nideshopSpecificationMapper.updateSelectiveByPrimaryKey( nideshopSpecification);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopSpecification> param){

		int result=nideshopSpecificationMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopSpecification> param){

		int result=nideshopSpecificationMapper.batchUpdate(param);
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

		int result=nideshopSpecificationMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopSpecification param){

		int result=nideshopSpecificationMapper.deleteBySelect(param);
		return result;
	}



}