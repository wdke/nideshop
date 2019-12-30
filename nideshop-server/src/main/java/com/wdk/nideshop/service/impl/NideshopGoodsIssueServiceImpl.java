package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopGoodsIssue;
import com.wdk.nideshop.web.args.NideshopGoodsIssueArgs;
import com.wdk.nideshop.service.NideshopGoodsIssueService;
import com.wdk.nideshop.storage.dao.NideshopGoodsIssueMapper;
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
 *货物的问题
 * @author wdke
 * @date 2019/12/30
 */
@Service
public class NideshopGoodsIssueServiceImpl implements NideshopGoodsIssueService{

	private static Logger logger=LoggerFactory.getLogger(NideshopGoodsIssueServiceImpl.class);

	@Autowired
	private NideshopGoodsIssueMapper nideshopGoodsIssueMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopGoodsIssueMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopGoodsIssue
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopGoodsIssue> selectListByMap(Map<String,Object> param){

		List<NideshopGoodsIssue> result=nideshopGoodsIssueMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopGoodsIssue
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopGoodsIssue> list(NideshopGoodsIssueArgs param){

		//参数类型转化
		NideshopGoodsIssue nideshopGoodsIssue = new NideshopGoodsIssue();

		BeanUtils.copyProperties(param,nideshopGoodsIssue);

		List<NideshopGoodsIssue> result=nideshopGoodsIssueMapper.list(nideshopGoodsIssue);

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
	public Integer count(NideshopGoodsIssueArgs param){

		//参数类型转化
		NideshopGoodsIssue nideshopGoodsIssue = new NideshopGoodsIssue();

		BeanUtils.copyProperties(param,nideshopGoodsIssue);

		Integer result=nideshopGoodsIssueMapper.count(nideshopGoodsIssue);

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
	public NideshopGoodsIssue selectByPrimaryKey(Integer id){

		NideshopGoodsIssue result=nideshopGoodsIssueMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopGoodsIssue:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopGoodsIssue> pageInfo(NideshopGoodsIssueArgs param,PageParam pageParam){

		//参数类型转化
		NideshopGoodsIssue nideshopGoodsIssue = new NideshopGoodsIssue();
		BeanUtils.copyProperties(param,nideshopGoodsIssue);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopGoodsIssue> result=nideshopGoodsIssueMapper.list(nideshopGoodsIssue);
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
	public int insert(NideshopGoodsIssue param){

		int result=nideshopGoodsIssueMapper.insert(param);
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
	public int insertSelective(NideshopGoodsIssueArgs param){

		//参数类型转化
		NideshopGoodsIssue nideshopGoodsIssue = new NideshopGoodsIssue();
		BeanUtils.copyProperties(param,nideshopGoodsIssue);

		int result=nideshopGoodsIssueMapper.insertSelective(nideshopGoodsIssue);

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
	public int batchInsert(List<NideshopGoodsIssue> param){

		int result=nideshopGoodsIssueMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopGoodsIssue param){

		int result=nideshopGoodsIssueMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopGoodsIssueArgs param){

		//参数类型转化
		NideshopGoodsIssue nideshopGoodsIssue = new NideshopGoodsIssue();
		BeanUtils.copyProperties(param,nideshopGoodsIssue);

		int result=nideshopGoodsIssueMapper.updateSelectiveByPrimaryKey( nideshopGoodsIssue);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopGoodsIssue> param){

		int result=nideshopGoodsIssueMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopGoodsIssue> param){

		int result=nideshopGoodsIssueMapper.batchUpdate(param);
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

		int result=nideshopGoodsIssueMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopGoodsIssue param){

		int result=nideshopGoodsIssueMapper.deleteBySelect(param);
		return result;
	}



}