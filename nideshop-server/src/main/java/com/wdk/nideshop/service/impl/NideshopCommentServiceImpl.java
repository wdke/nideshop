package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopComment;
import com.wdk.nideshop.web.args.NideshopCommentArgs;
import com.wdk.nideshop.service.NideshopCommentService;
import com.wdk.nideshop.storage.dao.NideshopCommentMapper;
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
public class NideshopCommentServiceImpl implements NideshopCommentService{

	private static Logger logger=LoggerFactory.getLogger(NideshopCommentServiceImpl.class);

	@Autowired
	private NideshopCommentMapper nideshopCommentMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopCommentMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopComment
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopComment> selectListByMap(Map<String,Object> param){

		List<NideshopComment> result=nideshopCommentMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopComment
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopComment> list(NideshopCommentArgs param){

		//参数类型转化
		NideshopComment nideshopComment = new NideshopComment();

		BeanUtils.copyProperties(param,nideshopComment);

		List<NideshopComment> result=nideshopCommentMapper.list(nideshopComment);

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
	public Integer count(NideshopCommentArgs param){

		//参数类型转化
		NideshopComment nideshopComment = new NideshopComment();

		BeanUtils.copyProperties(param,nideshopComment);

		Integer result=nideshopCommentMapper.count(nideshopComment);

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
	public NideshopComment selectByPrimaryKey(Integer id){

		NideshopComment result=nideshopCommentMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopComment:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopComment> pageInfo(NideshopCommentArgs param,PageParam pageParam){

		//参数类型转化
		NideshopComment nideshopComment = new NideshopComment();
		BeanUtils.copyProperties(param,nideshopComment);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopComment> result=nideshopCommentMapper.list(nideshopComment);
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
	public int insert(NideshopComment param){

		int result=nideshopCommentMapper.insert(param);
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
	public int insertSelective(NideshopCommentArgs param){

		//参数类型转化
		NideshopComment nideshopComment = new NideshopComment();
		BeanUtils.copyProperties(param,nideshopComment);

		int result=nideshopCommentMapper.insertSelective(nideshopComment);

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
	public int batchInsert(List<NideshopComment> param){

		int result=nideshopCommentMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopComment param){

		int result=nideshopCommentMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopCommentArgs param){

		//参数类型转化
		NideshopComment nideshopComment = new NideshopComment();
		BeanUtils.copyProperties(param,nideshopComment);

		int result=nideshopCommentMapper.updateSelectiveByPrimaryKey( nideshopComment);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopComment> param){

		int result=nideshopCommentMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopComment> param){

		int result=nideshopCommentMapper.batchUpdate(param);
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

		int result=nideshopCommentMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopComment param){

		int result=nideshopCommentMapper.deleteBySelect(param);
		return result;
	}



}