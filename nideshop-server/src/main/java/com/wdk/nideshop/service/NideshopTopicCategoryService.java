package com.wdk.nideshop.service;

import com.wdk.nideshop.storage.entity.NideshopTopicCategory;
import com.wdk.nideshop.web.args.NideshopTopicCategoryArgs;

import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import java.util.List;
import java.util.Map;

/**
 *
 * @author wdke
 * @date 2019/12/30
 */
public interface NideshopTopicCategoryService{

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
	* @return ：List<NideshopTopicCategory
	* @author jack
	* @date 2019/12/30 19:37
	*/
	List<NideshopTopicCategory> selectListByMap(Map<String,Object> param);

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopTopicCategory
	* @author jack
	* @date 2019/12/30 19:37
	*/
	List<NideshopTopicCategory> list(NideshopTopicCategoryArgs param);

	/**
	* 统计接口

	* @param param
	* @return Integer
	* @author jack
	* @date 2019/12/30 19:37
	*/
	Integer count(NideshopTopicCategoryArgs param);

	/**
	* 根据主键查询数据
	*
	* @param id
	* @author jack
	* @date 2019/12/30 19:37
	*/
	NideshopTopicCategory selectByPrimaryKey(Integer id);

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopTopicCategory:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	PageInfo<NideshopTopicCategory> pageInfo(NideshopTopicCategoryArgs param,PageParam pageParam);

	/**
	* 获取查询列表
	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int insert(NideshopTopicCategory param);

	/**
	* 不为空新增
	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int insertSelective(NideshopTopicCategoryArgs param);

	/**
	* 批量新增
	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int batchInsert(List<NideshopTopicCategory> param);

	/**
	* 根据主键更新全量
	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int updateByPrimaryKey(NideshopTopicCategory param);

	/**
	* 根据主键更新全量
	* @param param
	* @return ：int 数量
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int updateSelectiveByPrimaryKey(NideshopTopicCategoryArgs param);

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int batchInsertUpdate(List<NideshopTopicCategory> param);

	/**
	* 批量更新
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	int batchUpdate(List<NideshopTopicCategory> param);

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
	int deleteBySelect(NideshopTopicCategory param);



}