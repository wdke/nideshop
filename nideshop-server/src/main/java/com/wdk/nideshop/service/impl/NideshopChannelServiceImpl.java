package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopChannel;
import com.wdk.nideshop.web.args.NideshopChannelArgs;
import com.wdk.nideshop.service.NideshopChannelService;
import com.wdk.nideshop.storage.dao.NideshopChannelMapper;
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
public class NideshopChannelServiceImpl implements NideshopChannelService{

	private static Logger logger=LoggerFactory.getLogger(NideshopChannelServiceImpl.class);

	@Autowired
	private NideshopChannelMapper nideshopChannelMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopChannelMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopChannel
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopChannel> selectListByMap(Map<String,Object> param){

		List<NideshopChannel> result=nideshopChannelMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopChannel
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopChannel> list(NideshopChannelArgs param){

		//参数类型转化
		NideshopChannel nideshopChannel = new NideshopChannel();

		BeanUtils.copyProperties(param,nideshopChannel);

		List<NideshopChannel> result=nideshopChannelMapper.list(nideshopChannel);

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
	public Integer count(NideshopChannelArgs param){

		//参数类型转化
		NideshopChannel nideshopChannel = new NideshopChannel();

		BeanUtils.copyProperties(param,nideshopChannel);

		Integer result=nideshopChannelMapper.count(nideshopChannel);

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
	public NideshopChannel selectByPrimaryKey(Integer id){

		NideshopChannel result=nideshopChannelMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopChannel:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopChannel> pageInfo(NideshopChannelArgs param,PageParam pageParam){

		//参数类型转化
		NideshopChannel nideshopChannel = new NideshopChannel();
		BeanUtils.copyProperties(param,nideshopChannel);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopChannel> result=nideshopChannelMapper.list(nideshopChannel);
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
	public int insert(NideshopChannel param){

		int result=nideshopChannelMapper.insert(param);
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
	public int insertSelective(NideshopChannelArgs param){

		//参数类型转化
		NideshopChannel nideshopChannel = new NideshopChannel();
		BeanUtils.copyProperties(param,nideshopChannel);

		int result=nideshopChannelMapper.insertSelective(nideshopChannel);

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
	public int batchInsert(List<NideshopChannel> param){

		int result=nideshopChannelMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopChannel param){

		int result=nideshopChannelMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopChannelArgs param){

		//参数类型转化
		NideshopChannel nideshopChannel = new NideshopChannel();
		BeanUtils.copyProperties(param,nideshopChannel);

		int result=nideshopChannelMapper.updateSelectiveByPrimaryKey( nideshopChannel);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopChannel> param){

		int result=nideshopChannelMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopChannel> param){

		int result=nideshopChannelMapper.batchUpdate(param);
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

		int result=nideshopChannelMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopChannel param){

		int result=nideshopChannelMapper.deleteBySelect(param);
		return result;
	}



}