package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopGoodsSpecification;
import com.wdk.nideshop.web.args.NideshopGoodsSpecificationArgs;
import com.wdk.nideshop.service.NideshopGoodsSpecificationService;
import com.wdk.nideshop.storage.dao.NideshopGoodsSpecificationMapper;
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
 *商品规格
 * @author wdke
 * @date 2019/12/30
 */
@Service
public class NideshopGoodsSpecificationServiceImpl implements NideshopGoodsSpecificationService{

	private static Logger logger=LoggerFactory.getLogger(NideshopGoodsSpecificationServiceImpl.class);

	@Autowired
	private NideshopGoodsSpecificationMapper nideshopGoodsSpecificationMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopGoodsSpecificationMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopGoodsSpecification
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopGoodsSpecification> selectListByMap(Map<String,Object> param){

		List<NideshopGoodsSpecification> result=nideshopGoodsSpecificationMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopGoodsSpecification
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopGoodsSpecification> list(NideshopGoodsSpecificationArgs param){

		//参数类型转化
		NideshopGoodsSpecification nideshopGoodsSpecification = new NideshopGoodsSpecification();

		BeanUtils.copyProperties(param,nideshopGoodsSpecification);

		List<NideshopGoodsSpecification> result=nideshopGoodsSpecificationMapper.list(nideshopGoodsSpecification);

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
	public Integer count(NideshopGoodsSpecificationArgs param){

		//参数类型转化
		NideshopGoodsSpecification nideshopGoodsSpecification = new NideshopGoodsSpecification();

		BeanUtils.copyProperties(param,nideshopGoodsSpecification);

		Integer result=nideshopGoodsSpecificationMapper.count(nideshopGoodsSpecification);

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
	public NideshopGoodsSpecification selectByPrimaryKey(Integer id){

		NideshopGoodsSpecification result=nideshopGoodsSpecificationMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopGoodsSpecification:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopGoodsSpecification> pageInfo(NideshopGoodsSpecificationArgs param,PageParam pageParam){

		//参数类型转化
		NideshopGoodsSpecification nideshopGoodsSpecification = new NideshopGoodsSpecification();
		BeanUtils.copyProperties(param,nideshopGoodsSpecification);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopGoodsSpecification> result=nideshopGoodsSpecificationMapper.list(nideshopGoodsSpecification);
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
	public int insert(NideshopGoodsSpecification param){

		int result=nideshopGoodsSpecificationMapper.insert(param);
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
	public int insertSelective(NideshopGoodsSpecificationArgs param){

		//参数类型转化
		NideshopGoodsSpecification nideshopGoodsSpecification = new NideshopGoodsSpecification();
		BeanUtils.copyProperties(param,nideshopGoodsSpecification);

		int result=nideshopGoodsSpecificationMapper.insertSelective(nideshopGoodsSpecification);

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
	public int batchInsert(List<NideshopGoodsSpecification> param){

		int result=nideshopGoodsSpecificationMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopGoodsSpecification param){

		int result=nideshopGoodsSpecificationMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopGoodsSpecificationArgs param){

		//参数类型转化
		NideshopGoodsSpecification nideshopGoodsSpecification = new NideshopGoodsSpecification();
		BeanUtils.copyProperties(param,nideshopGoodsSpecification);

		int result=nideshopGoodsSpecificationMapper.updateSelectiveByPrimaryKey( nideshopGoodsSpecification);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopGoodsSpecification> param){

		int result=nideshopGoodsSpecificationMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopGoodsSpecification> param){

		int result=nideshopGoodsSpecificationMapper.batchUpdate(param);
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

		int result=nideshopGoodsSpecificationMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopGoodsSpecification param){

		int result=nideshopGoodsSpecificationMapper.deleteBySelect(param);
		return result;
	}



}