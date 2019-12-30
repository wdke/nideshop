package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopSearchHistory;
import com.wdk.nideshop.web.args.NideshopSearchHistoryArgs;
import com.wdk.nideshop.service.NideshopSearchHistoryService;
import com.wdk.nideshop.storage.dao.NideshopSearchHistoryMapper;
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
public class NideshopSearchHistoryServiceImpl implements NideshopSearchHistoryService{

	private static Logger logger=LoggerFactory.getLogger(NideshopSearchHistoryServiceImpl.class);

	@Autowired
	private NideshopSearchHistoryMapper nideshopSearchHistoryMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopSearchHistoryMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopSearchHistory
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopSearchHistory> selectListByMap(Map<String,Object> param){

		List<NideshopSearchHistory> result=nideshopSearchHistoryMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopSearchHistory
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopSearchHistory> list(NideshopSearchHistoryArgs param){

		//参数类型转化
		NideshopSearchHistory nideshopSearchHistory = new NideshopSearchHistory();

		BeanUtils.copyProperties(param,nideshopSearchHistory);

		List<NideshopSearchHistory> result=nideshopSearchHistoryMapper.list(nideshopSearchHistory);

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
	public Integer count(NideshopSearchHistoryArgs param){

		//参数类型转化
		NideshopSearchHistory nideshopSearchHistory = new NideshopSearchHistory();

		BeanUtils.copyProperties(param,nideshopSearchHistory);

		Integer result=nideshopSearchHistoryMapper.count(nideshopSearchHistory);

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
	public NideshopSearchHistory selectByPrimaryKey(Integer id){

		NideshopSearchHistory result=nideshopSearchHistoryMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopSearchHistory:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopSearchHistory> pageInfo(NideshopSearchHistoryArgs param,PageParam pageParam){

		//参数类型转化
		NideshopSearchHistory nideshopSearchHistory = new NideshopSearchHistory();
		BeanUtils.copyProperties(param,nideshopSearchHistory);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopSearchHistory> result=nideshopSearchHistoryMapper.list(nideshopSearchHistory);
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
	public int insert(NideshopSearchHistory param){

		int result=nideshopSearchHistoryMapper.insert(param);
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
	public int insertSelective(NideshopSearchHistoryArgs param){

		//参数类型转化
		NideshopSearchHistory nideshopSearchHistory = new NideshopSearchHistory();
		BeanUtils.copyProperties(param,nideshopSearchHistory);

		int result=nideshopSearchHistoryMapper.insertSelective(nideshopSearchHistory);

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
	public int batchInsert(List<NideshopSearchHistory> param){

		int result=nideshopSearchHistoryMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopSearchHistory param){

		int result=nideshopSearchHistoryMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopSearchHistoryArgs param){

		//参数类型转化
		NideshopSearchHistory nideshopSearchHistory = new NideshopSearchHistory();
		BeanUtils.copyProperties(param,nideshopSearchHistory);

		int result=nideshopSearchHistoryMapper.updateSelectiveByPrimaryKey( nideshopSearchHistory);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopSearchHistory> param){

		int result=nideshopSearchHistoryMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopSearchHistory> param){

		int result=nideshopSearchHistoryMapper.batchUpdate(param);
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

		int result=nideshopSearchHistoryMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopSearchHistory param){

		int result=nideshopSearchHistoryMapper.deleteBySelect(param);
		return result;
	}



}