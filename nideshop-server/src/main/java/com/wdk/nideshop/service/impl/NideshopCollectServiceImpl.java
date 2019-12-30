package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopCollect;
import com.wdk.nideshop.web.args.NideshopCollectArgs;
import com.wdk.nideshop.service.NideshopCollectService;
import com.wdk.nideshop.storage.dao.NideshopCollectMapper;
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
public class NideshopCollectServiceImpl implements NideshopCollectService{

	private static Logger logger=LoggerFactory.getLogger(NideshopCollectServiceImpl.class);

	@Autowired
	private NideshopCollectMapper nideshopCollectMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopCollectMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopCollect
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopCollect> selectListByMap(Map<String,Object> param){

		List<NideshopCollect> result=nideshopCollectMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopCollect
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopCollect> list(NideshopCollectArgs param){

		//参数类型转化
		NideshopCollect nideshopCollect = new NideshopCollect();

		BeanUtils.copyProperties(param,nideshopCollect);

		List<NideshopCollect> result=nideshopCollectMapper.list(nideshopCollect);

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
	public Integer count(NideshopCollectArgs param){

		//参数类型转化
		NideshopCollect nideshopCollect = new NideshopCollect();

		BeanUtils.copyProperties(param,nideshopCollect);

		Integer result=nideshopCollectMapper.count(nideshopCollect);

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
	public NideshopCollect selectByPrimaryKey(Integer id){

		NideshopCollect result=nideshopCollectMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopCollect:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopCollect> pageInfo(NideshopCollectArgs param,PageParam pageParam){

		//参数类型转化
		NideshopCollect nideshopCollect = new NideshopCollect();
		BeanUtils.copyProperties(param,nideshopCollect);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopCollect> result=nideshopCollectMapper.list(nideshopCollect);
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
	public int insert(NideshopCollect param){

		int result=nideshopCollectMapper.insert(param);
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
	public int insertSelective(NideshopCollectArgs param){

		//参数类型转化
		NideshopCollect nideshopCollect = new NideshopCollect();
		BeanUtils.copyProperties(param,nideshopCollect);

		int result=nideshopCollectMapper.insertSelective(nideshopCollect);

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
	public int batchInsert(List<NideshopCollect> param){

		int result=nideshopCollectMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopCollect param){

		int result=nideshopCollectMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopCollectArgs param){

		//参数类型转化
		NideshopCollect nideshopCollect = new NideshopCollect();
		BeanUtils.copyProperties(param,nideshopCollect);

		int result=nideshopCollectMapper.updateSelectiveByPrimaryKey( nideshopCollect);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopCollect> param){

		int result=nideshopCollectMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopCollect> param){

		int result=nideshopCollectMapper.batchUpdate(param);
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

		int result=nideshopCollectMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopCollect param){

		int result=nideshopCollectMapper.deleteBySelect(param);
		return result;
	}



}