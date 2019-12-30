package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopAddress;
import com.wdk.nideshop.web.args.NideshopAddressArgs;
import com.wdk.nideshop.service.NideshopAddressService;
import com.wdk.nideshop.storage.dao.NideshopAddressMapper;
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
public class NideshopAddressServiceImpl implements NideshopAddressService{

	private static Logger logger=LoggerFactory.getLogger(NideshopAddressServiceImpl.class);

	@Autowired
	private NideshopAddressMapper nideshopAddressMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopAddressMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopAddress
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopAddress> selectListByMap(Map<String,Object> param){

		List<NideshopAddress> result=nideshopAddressMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopAddress
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopAddress> list(NideshopAddressArgs param){

		//参数类型转化
		NideshopAddress nideshopAddress = new NideshopAddress();

		BeanUtils.copyProperties(param,nideshopAddress);

		List<NideshopAddress> result=nideshopAddressMapper.list(nideshopAddress);

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
	public Integer count(NideshopAddressArgs param){

		//参数类型转化
		NideshopAddress nideshopAddress = new NideshopAddress();

		BeanUtils.copyProperties(param,nideshopAddress);

		Integer result=nideshopAddressMapper.count(nideshopAddress);

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
	public NideshopAddress selectByPrimaryKey(Integer id){

		NideshopAddress result=nideshopAddressMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopAddress:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopAddress> pageInfo(NideshopAddressArgs param,PageParam pageParam){

		//参数类型转化
		NideshopAddress nideshopAddress = new NideshopAddress();
		BeanUtils.copyProperties(param,nideshopAddress);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopAddress> result=nideshopAddressMapper.list(nideshopAddress);
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
	public int insert(NideshopAddress param){

		int result=nideshopAddressMapper.insert(param);
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
	public int insertSelective(NideshopAddressArgs param){

		//参数类型转化
		NideshopAddress nideshopAddress = new NideshopAddress();
		BeanUtils.copyProperties(param,nideshopAddress);

		int result=nideshopAddressMapper.insertSelective(nideshopAddress);

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
	public int batchInsert(List<NideshopAddress> param){

		int result=nideshopAddressMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopAddress param){

		int result=nideshopAddressMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopAddressArgs param){

		//参数类型转化
		NideshopAddress nideshopAddress = new NideshopAddress();
		BeanUtils.copyProperties(param,nideshopAddress);

		int result=nideshopAddressMapper.updateSelectiveByPrimaryKey( nideshopAddress);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopAddress> param){

		int result=nideshopAddressMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopAddress> param){

		int result=nideshopAddressMapper.batchUpdate(param);
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

		int result=nideshopAddressMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopAddress param){

		int result=nideshopAddressMapper.deleteBySelect(param);
		return result;
	}



}