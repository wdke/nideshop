package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopAd;
import com.wdk.nideshop.web.args.NideshopAdArgs;
import com.wdk.nideshop.service.NideshopAdService;
import com.wdk.nideshop.storage.dao.NideshopAdMapper;
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
public class NideshopAdServiceImpl implements NideshopAdService{

	private static Logger logger=LoggerFactory.getLogger(NideshopAdServiceImpl.class);

	@Autowired
	private NideshopAdMapper nideshopAdMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopAdMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopAd
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopAd> selectListByMap(Map<String,Object> param){

		List<NideshopAd> result=nideshopAdMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopAd
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopAd> list(NideshopAdArgs param){

		//参数类型转化
		NideshopAd nideshopAd = new NideshopAd();

		BeanUtils.copyProperties(param,nideshopAd);

		List<NideshopAd> result=nideshopAdMapper.list(nideshopAd);

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
	public Integer count(NideshopAdArgs param){

		//参数类型转化
		NideshopAd nideshopAd = new NideshopAd();

		BeanUtils.copyProperties(param,nideshopAd);

		Integer result=nideshopAdMapper.count(nideshopAd);

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
	public NideshopAd selectByPrimaryKey(Short id){

		NideshopAd result=nideshopAdMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopAd:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopAd> pageInfo(NideshopAdArgs param,PageParam pageParam){

		//参数类型转化
		NideshopAd nideshopAd = new NideshopAd();
		BeanUtils.copyProperties(param,nideshopAd);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopAd> result=nideshopAdMapper.list(nideshopAd);
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
	public int insert(NideshopAd param){

		int result=nideshopAdMapper.insert(param);
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
	public int insertSelective(NideshopAdArgs param){

		//参数类型转化
		NideshopAd nideshopAd = new NideshopAd();
		BeanUtils.copyProperties(param,nideshopAd);

		int result=nideshopAdMapper.insertSelective(nideshopAd);

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
	public int batchInsert(List<NideshopAd> param){

		int result=nideshopAdMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopAd param){

		int result=nideshopAdMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopAdArgs param){

		//参数类型转化
		NideshopAd nideshopAd = new NideshopAd();
		BeanUtils.copyProperties(param,nideshopAd);

		int result=nideshopAdMapper.updateSelectiveByPrimaryKey( nideshopAd);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopAd> param){

		int result=nideshopAdMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopAd> param){

		int result=nideshopAdMapper.batchUpdate(param);
		return result;
	}

	/**
	* 根据主键删除数据
	* @param id
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteByPrimaryKey(Short id){

		int result=nideshopAdMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopAd param){

		int result=nideshopAdMapper.deleteBySelect(param);
		return result;
	}



}