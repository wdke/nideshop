package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopUserLevel;
import com.wdk.nideshop.web.args.NideshopUserLevelArgs;
import com.wdk.nideshop.service.NideshopUserLevelService;
import com.wdk.nideshop.storage.dao.NideshopUserLevelMapper;
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
public class NideshopUserLevelServiceImpl implements NideshopUserLevelService{

	private static Logger logger=LoggerFactory.getLogger(NideshopUserLevelServiceImpl.class);

	@Autowired
	private NideshopUserLevelMapper nideshopUserLevelMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopUserLevelMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopUserLevel
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopUserLevel> selectListByMap(Map<String,Object> param){

		List<NideshopUserLevel> result=nideshopUserLevelMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopUserLevel
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopUserLevel> list(NideshopUserLevelArgs param){

		//参数类型转化
		NideshopUserLevel nideshopUserLevel = new NideshopUserLevel();

		BeanUtils.copyProperties(param,nideshopUserLevel);

		List<NideshopUserLevel> result=nideshopUserLevelMapper.list(nideshopUserLevel);

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
	public Integer count(NideshopUserLevelArgs param){

		//参数类型转化
		NideshopUserLevel nideshopUserLevel = new NideshopUserLevel();

		BeanUtils.copyProperties(param,nideshopUserLevel);

		Integer result=nideshopUserLevelMapper.count(nideshopUserLevel);

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
	public NideshopUserLevel selectByPrimaryKey(Byte id){

		NideshopUserLevel result=nideshopUserLevelMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopUserLevel:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopUserLevel> pageInfo(NideshopUserLevelArgs param,PageParam pageParam){

		//参数类型转化
		NideshopUserLevel nideshopUserLevel = new NideshopUserLevel();
		BeanUtils.copyProperties(param,nideshopUserLevel);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopUserLevel> result=nideshopUserLevelMapper.list(nideshopUserLevel);
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
	public int insert(NideshopUserLevel param){

		int result=nideshopUserLevelMapper.insert(param);
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
	public int insertSelective(NideshopUserLevelArgs param){

		//参数类型转化
		NideshopUserLevel nideshopUserLevel = new NideshopUserLevel();
		BeanUtils.copyProperties(param,nideshopUserLevel);

		int result=nideshopUserLevelMapper.insertSelective(nideshopUserLevel);

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
	public int batchInsert(List<NideshopUserLevel> param){

		int result=nideshopUserLevelMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopUserLevel param){

		int result=nideshopUserLevelMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopUserLevelArgs param){

		//参数类型转化
		NideshopUserLevel nideshopUserLevel = new NideshopUserLevel();
		BeanUtils.copyProperties(param,nideshopUserLevel);

		int result=nideshopUserLevelMapper.updateSelectiveByPrimaryKey( nideshopUserLevel);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopUserLevel> param){

		int result=nideshopUserLevelMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopUserLevel> param){

		int result=nideshopUserLevelMapper.batchUpdate(param);
		return result;
	}

	/**
	* 根据主键删除数据
	* @param id
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteByPrimaryKey(Byte id){

		int result=nideshopUserLevelMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopUserLevel param){

		int result=nideshopUserLevelMapper.deleteBySelect(param);
		return result;
	}



}