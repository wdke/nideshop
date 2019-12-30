package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopProduct;
import com.wdk.nideshop.web.args.NideshopProductArgs;
import com.wdk.nideshop.service.NideshopProductService;
import com.wdk.nideshop.storage.dao.NideshopProductMapper;
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
public class NideshopProductServiceImpl implements NideshopProductService{

	private static Logger logger=LoggerFactory.getLogger(NideshopProductServiceImpl.class);

	@Autowired
	private NideshopProductMapper nideshopProductMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopProductMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopProduct
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopProduct> selectListByMap(Map<String,Object> param){

		List<NideshopProduct> result=nideshopProductMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopProduct
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopProduct> list(NideshopProductArgs param){

		//参数类型转化
		NideshopProduct nideshopProduct = new NideshopProduct();

		BeanUtils.copyProperties(param,nideshopProduct);

		List<NideshopProduct> result=nideshopProductMapper.list(nideshopProduct);

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
	public Integer count(NideshopProductArgs param){

		//参数类型转化
		NideshopProduct nideshopProduct = new NideshopProduct();

		BeanUtils.copyProperties(param,nideshopProduct);

		Integer result=nideshopProductMapper.count(nideshopProduct);

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
	public NideshopProduct selectByPrimaryKey(Integer id){

		NideshopProduct result=nideshopProductMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopProduct:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopProduct> pageInfo(NideshopProductArgs param,PageParam pageParam){

		//参数类型转化
		NideshopProduct nideshopProduct = new NideshopProduct();
		BeanUtils.copyProperties(param,nideshopProduct);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopProduct> result=nideshopProductMapper.list(nideshopProduct);
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
	public int insert(NideshopProduct param){

		int result=nideshopProductMapper.insert(param);
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
	public int insertSelective(NideshopProductArgs param){

		//参数类型转化
		NideshopProduct nideshopProduct = new NideshopProduct();
		BeanUtils.copyProperties(param,nideshopProduct);

		int result=nideshopProductMapper.insertSelective(nideshopProduct);

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
	public int batchInsert(List<NideshopProduct> param){

		int result=nideshopProductMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopProduct param){

		int result=nideshopProductMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopProductArgs param){

		//参数类型转化
		NideshopProduct nideshopProduct = new NideshopProduct();
		BeanUtils.copyProperties(param,nideshopProduct);

		int result=nideshopProductMapper.updateSelectiveByPrimaryKey( nideshopProduct);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopProduct> param){

		int result=nideshopProductMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopProduct> param){

		int result=nideshopProductMapper.batchUpdate(param);
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

		int result=nideshopProductMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopProduct param){

		int result=nideshopProductMapper.deleteBySelect(param);
		return result;
	}



}