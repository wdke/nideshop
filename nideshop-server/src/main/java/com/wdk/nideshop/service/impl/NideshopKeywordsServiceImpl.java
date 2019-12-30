package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopKeywords;
import com.wdk.nideshop.web.args.NideshopKeywordsArgs;
import com.wdk.nideshop.service.NideshopKeywordsService;
import com.wdk.nideshop.storage.dao.NideshopKeywordsMapper;
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
 *热闹关键词表
 * @author wdke
 * @date 2019/12/30
 */
@Service
public class NideshopKeywordsServiceImpl implements NideshopKeywordsService{

	private static Logger logger=LoggerFactory.getLogger(NideshopKeywordsServiceImpl.class);

	@Autowired
	private NideshopKeywordsMapper nideshopKeywordsMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopKeywordsMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopKeywords
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopKeywords> selectListByMap(Map<String,Object> param){

		List<NideshopKeywords> result=nideshopKeywordsMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopKeywords
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopKeywords> list(NideshopKeywordsArgs param){

		//参数类型转化
		NideshopKeywords nideshopKeywords = new NideshopKeywords();

		BeanUtils.copyProperties(param,nideshopKeywords);

		List<NideshopKeywords> result=nideshopKeywordsMapper.list(nideshopKeywords);

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
	public Integer count(NideshopKeywordsArgs param){

		//参数类型转化
		NideshopKeywords nideshopKeywords = new NideshopKeywords();

		BeanUtils.copyProperties(param,nideshopKeywords);

		Integer result=nideshopKeywordsMapper.count(nideshopKeywords);

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
	public NideshopKeywords selectByPrimaryKey(Integer id){

		NideshopKeywords result=nideshopKeywordsMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopKeywords:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopKeywords> pageInfo(NideshopKeywordsArgs param,PageParam pageParam){

		//参数类型转化
		NideshopKeywords nideshopKeywords = new NideshopKeywords();
		BeanUtils.copyProperties(param,nideshopKeywords);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopKeywords> result=nideshopKeywordsMapper.list(nideshopKeywords);
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
	public int insert(NideshopKeywords param){

		int result=nideshopKeywordsMapper.insert(param);
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
	public int insertSelective(NideshopKeywordsArgs param){

		//参数类型转化
		NideshopKeywords nideshopKeywords = new NideshopKeywords();
		BeanUtils.copyProperties(param,nideshopKeywords);

		int result=nideshopKeywordsMapper.insertSelective(nideshopKeywords);

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
	public int batchInsert(List<NideshopKeywords> param){

		int result=nideshopKeywordsMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopKeywords param){

		int result=nideshopKeywordsMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopKeywordsArgs param){

		//参数类型转化
		NideshopKeywords nideshopKeywords = new NideshopKeywords();
		BeanUtils.copyProperties(param,nideshopKeywords);

		int result=nideshopKeywordsMapper.updateSelectiveByPrimaryKey( nideshopKeywords);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopKeywords> param){

		int result=nideshopKeywordsMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopKeywords> param){

		int result=nideshopKeywordsMapper.batchUpdate(param);
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

		int result=nideshopKeywordsMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopKeywords param){

		int result=nideshopKeywordsMapper.deleteBySelect(param);
		return result;
	}



}