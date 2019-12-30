package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopFeedback;
import com.wdk.nideshop.web.args.NideshopFeedbackArgs;
import com.wdk.nideshop.service.NideshopFeedbackService;
import com.wdk.nideshop.storage.dao.NideshopFeedbackMapper;
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
public class NideshopFeedbackServiceImpl implements NideshopFeedbackService{

	private static Logger logger=LoggerFactory.getLogger(NideshopFeedbackServiceImpl.class);

	@Autowired
	private NideshopFeedbackMapper nideshopFeedbackMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopFeedbackMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopFeedback
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopFeedback> selectListByMap(Map<String,Object> param){

		List<NideshopFeedback> result=nideshopFeedbackMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopFeedback
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopFeedback> list(NideshopFeedbackArgs param){

		//参数类型转化
		NideshopFeedback nideshopFeedback = new NideshopFeedback();

		BeanUtils.copyProperties(param,nideshopFeedback);

		List<NideshopFeedback> result=nideshopFeedbackMapper.list(nideshopFeedback);

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
	public Integer count(NideshopFeedbackArgs param){

		//参数类型转化
		NideshopFeedback nideshopFeedback = new NideshopFeedback();

		BeanUtils.copyProperties(param,nideshopFeedback);

		Integer result=nideshopFeedbackMapper.count(nideshopFeedback);

		return result;
	}

	/**
	* 根据主键查询数据
	*
	* @param msg_id
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public NideshopFeedback selectByPrimaryKey(Integer msg_id){

		NideshopFeedback result=nideshopFeedbackMapper.selectByPrimaryKey(msg_id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopFeedback:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopFeedback> pageInfo(NideshopFeedbackArgs param,PageParam pageParam){

		//参数类型转化
		NideshopFeedback nideshopFeedback = new NideshopFeedback();
		BeanUtils.copyProperties(param,nideshopFeedback);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopFeedback> result=nideshopFeedbackMapper.list(nideshopFeedback);
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
	public int insert(NideshopFeedback param){

		int result=nideshopFeedbackMapper.insert(param);
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
	public int insertSelective(NideshopFeedbackArgs param){

		//参数类型转化
		NideshopFeedback nideshopFeedback = new NideshopFeedback();
		BeanUtils.copyProperties(param,nideshopFeedback);

		int result=nideshopFeedbackMapper.insertSelective(nideshopFeedback);

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
	public int batchInsert(List<NideshopFeedback> param){

		int result=nideshopFeedbackMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopFeedback param){

		int result=nideshopFeedbackMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopFeedbackArgs param){

		//参数类型转化
		NideshopFeedback nideshopFeedback = new NideshopFeedback();
		BeanUtils.copyProperties(param,nideshopFeedback);

		int result=nideshopFeedbackMapper.updateSelectiveByPrimaryKey( nideshopFeedback);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopFeedback> param){

		int result=nideshopFeedbackMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopFeedback> param){

		int result=nideshopFeedbackMapper.batchUpdate(param);
		return result;
	}

	/**
	* 根据主键删除数据
	* @param msg_id
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteByPrimaryKey(Integer msg_id){

		int result=nideshopFeedbackMapper.deleteByPrimaryKey(msg_id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopFeedback param){

		int result=nideshopFeedbackMapper.deleteBySelect(param);
		return result;
	}



}