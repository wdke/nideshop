package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopBrand;
import com.wdk.nideshop.web.args.NideshopBrandArgs;
import com.wdk.nideshop.service.NideshopBrandService;
import com.wdk.nideshop.storage.dao.NideshopBrandMapper;
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
 *品牌
 * @author wdke
 * @date 2019/12/30
 */
@Service
public class NideshopBrandServiceImpl implements NideshopBrandService{

	private static Logger logger=LoggerFactory.getLogger(NideshopBrandServiceImpl.class);

	@Autowired
	private NideshopBrandMapper nideshopBrandMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopBrandMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopBrand
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopBrand> selectListByMap(Map<String,Object> param){

		List<NideshopBrand> result=nideshopBrandMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopBrand
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopBrand> list(NideshopBrandArgs param){

		//参数类型转化
		NideshopBrand nideshopBrand = new NideshopBrand();

		BeanUtils.copyProperties(param,nideshopBrand);

		List<NideshopBrand> result=nideshopBrandMapper.list(nideshopBrand);

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
	public Integer count(NideshopBrandArgs param){

		//参数类型转化
		NideshopBrand nideshopBrand = new NideshopBrand();

		BeanUtils.copyProperties(param,nideshopBrand);

		Integer result=nideshopBrandMapper.count(nideshopBrand);

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
	public NideshopBrand selectByPrimaryKey(Integer id){

		NideshopBrand result=nideshopBrandMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopBrand:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopBrand> pageInfo(NideshopBrandArgs param,PageParam pageParam){

		//参数类型转化
		NideshopBrand nideshopBrand = new NideshopBrand();
		BeanUtils.copyProperties(param,nideshopBrand);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopBrand> result=nideshopBrandMapper.list(nideshopBrand);
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
	public int insert(NideshopBrand param){

		int result=nideshopBrandMapper.insert(param);
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
	public int insertSelective(NideshopBrandArgs param){

		//参数类型转化
		NideshopBrand nideshopBrand = new NideshopBrand();
		BeanUtils.copyProperties(param,nideshopBrand);

		int result=nideshopBrandMapper.insertSelective(nideshopBrand);

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
	public int batchInsert(List<NideshopBrand> param){

		int result=nideshopBrandMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopBrand param){

		int result=nideshopBrandMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopBrandArgs param){

		//参数类型转化
		NideshopBrand nideshopBrand = new NideshopBrand();
		BeanUtils.copyProperties(param,nideshopBrand);

		int result=nideshopBrandMapper.updateSelectiveByPrimaryKey( nideshopBrand);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopBrand> param){

		int result=nideshopBrandMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopBrand> param){

		int result=nideshopBrandMapper.batchUpdate(param);
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

		int result=nideshopBrandMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopBrand param){

		int result=nideshopBrandMapper.deleteBySelect(param);
		return result;
	}



}