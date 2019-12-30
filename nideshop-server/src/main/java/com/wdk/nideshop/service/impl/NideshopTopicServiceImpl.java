package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopTopic;
import com.wdk.nideshop.web.args.NideshopTopicArgs;
import com.wdk.nideshop.service.NideshopTopicService;
import com.wdk.nideshop.storage.dao.NideshopTopicMapper;
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
 *专题推荐
 * @author wdke
 * @date 2019/12/30
 */
@Service
public class NideshopTopicServiceImpl implements NideshopTopicService{

	private static Logger logger=LoggerFactory.getLogger(NideshopTopicServiceImpl.class);

	@Autowired
	private NideshopTopicMapper nideshopTopicMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopTopicMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopTopic
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopTopic> selectListByMap(Map<String,Object> param){

		List<NideshopTopic> result=nideshopTopicMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopTopic
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopTopic> list(NideshopTopicArgs param){

		//参数类型转化
		NideshopTopic nideshopTopic = new NideshopTopic();

		BeanUtils.copyProperties(param,nideshopTopic);

		List<NideshopTopic> result=nideshopTopicMapper.list(nideshopTopic);

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
	public Integer count(NideshopTopicArgs param){

		//参数类型转化
		NideshopTopic nideshopTopic = new NideshopTopic();

		BeanUtils.copyProperties(param,nideshopTopic);

		Integer result=nideshopTopicMapper.count(nideshopTopic);

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
	public NideshopTopic selectByPrimaryKey(Integer id){

		NideshopTopic result=nideshopTopicMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopTopic:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopTopic> pageInfo(NideshopTopicArgs param,PageParam pageParam){

		//参数类型转化
		NideshopTopic nideshopTopic = new NideshopTopic();
		BeanUtils.copyProperties(param,nideshopTopic);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopTopic> result=nideshopTopicMapper.list(nideshopTopic);
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
	public int insert(NideshopTopic param){

		int result=nideshopTopicMapper.insert(param);
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
	public int insertSelective(NideshopTopicArgs param){

		//参数类型转化
		NideshopTopic nideshopTopic = new NideshopTopic();
		BeanUtils.copyProperties(param,nideshopTopic);

		int result=nideshopTopicMapper.insertSelective(nideshopTopic);

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
	public int batchInsert(List<NideshopTopic> param){

		int result=nideshopTopicMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopTopic param){

		int result=nideshopTopicMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopTopicArgs param){

		//参数类型转化
		NideshopTopic nideshopTopic = new NideshopTopic();
		BeanUtils.copyProperties(param,nideshopTopic);

		int result=nideshopTopicMapper.updateSelectiveByPrimaryKey( nideshopTopic);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopTopic> param){

		int result=nideshopTopicMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopTopic> param){

		int result=nideshopTopicMapper.batchUpdate(param);
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

		int result=nideshopTopicMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopTopic param){

		int result=nideshopTopicMapper.deleteBySelect(param);
		return result;
	}



}