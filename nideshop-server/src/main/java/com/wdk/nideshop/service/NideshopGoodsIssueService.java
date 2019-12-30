package com.wdk.nideshop.service;

import com.wdk.nideshop.storage.entity.NideshopGoodsIssue;
import com.wdk.nideshop.web.args.NideshopGoodsIssueArgs;

import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import java.util.List;
import java.util.Map;

/**
 *货物的问题
 * @author wdke
 * @date 2019/12/30
 */
public interface NideshopGoodsIssueService{

	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param);

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopGoodsIssue
	* @author jack
	* @date 2019/12/30 19:37
	*/
	List<NideshopGoodsIssue> selectListByMap(Map<String,Object> param);

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopGoodsIssue
	* @author jack
	* @date 2019/12/30 19:37
	*/
	List<NideshopGoodsIssue> list(NideshopGoodsIssueArgs param);

	/**
	* 统计接口

	* @param param
	* @return Integer
	* @author jack
	* @date 2019/12/30 19:37
	*/
	Integer count(NideshopGoodsIssueArgs param);

	/**
	* 根据主键查询数据
	*
	* @param id
	* @author jack
	* @date 2019/12/30 19:37
	*/
	NideshopGoodsIssue selectByPrimaryKey(Integer id);

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopGoodsIssue:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	PageInfo<NideshopGoodsIssue> pageInfo(NideshopGoodsIssueArgs param,PageParam pageParam);

	/**
	* 获取查询列表
	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int insert(NideshopGoodsIssue param);

	/**
	* 不为空新增
	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int insertSelective(NideshopGoodsIssueArgs param);

	/**
	* 批量新增
	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int batchInsert(List<NideshopGoodsIssue> param);

	/**
	* 根据主键更新全量
	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int updateByPrimaryKey(NideshopGoodsIssue param);

	/**
	* 根据主键更新全量
	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int updateSelectiveByPrimaryKey(NideshopGoodsIssueArgs param);

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int batchInsertUpdate(List<NideshopGoodsIssue> param);

	/**
	* 批量更新
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int batchUpdate(List<NideshopGoodsIssue> param);

	/**
	* 根据主键删除数据
	* @param id
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int deleteByPrimaryKey(Integer id);

	/**
	* 根据查询条件删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int deleteBySelect(NideshopGoodsIssue param);



}