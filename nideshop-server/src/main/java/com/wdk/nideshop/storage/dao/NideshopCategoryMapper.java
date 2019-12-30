package com.wdk.nideshop.storage.dao;

import com.wdk.nideshop.storage.entity.NideshopCategory;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
类别
 * @author wdke
 * @date 2019/12/30
 */
@Repository
public interface NideshopCategoryMapper{

	/**
	 * 根据map获取查询Map列表
	 * @param param ：数据库对应key
	 * @return：数据库对应key的map数组
	 */
	List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param);

	/**
	 * 根据map获取查询列表
	 * @param param ： key为java对应字段的map
	 * @return
	 */
	List<NideshopCategory> selectListByMap(Map<String,Object> param);

	/**
	 * 获取查询列表
	 * @param param ：不为空的属性
	 * @return
	 */
	List<NideshopCategory> list(NideshopCategory param);

	/**
	 * 统计接口
	 * @param param ：不为空的属性
	 * @return
	 */
	Integer count(NideshopCategory param);

	/**
	 * 全量新增
	 * @param param
	 * @return
	 */
	int insert(NideshopCategory param);

	/**
	 * 不为空新增
	 * @param param
	 * @return
	 */
	int insertSelective(NideshopCategory param);

	/**
	 * 批量新增
	 * @param param
	 * @return
	 */
	int batchInsert(List<NideshopCategory> param);

	/**
	 * 获取查询列表
	 * @param param ：不为空的属性
	 * @return
	 */
	NideshopCategory selectByPrimaryKey(@Param("id") Integer param);

	/**
	 * 更新全量
	 * @param param
	 * @return
	 */
	int updateByPrimaryKey(NideshopCategory param);

	/**
	 * 更新不为空
	 * @param param
	 * @return
	 */
	int updateSelectiveByPrimaryKey(NideshopCategory param);

	/**
	 * 批量存在就更新，不存在就新增
	 * @param param：需要新增或根据key值更新的对象数组
	 * @return
	 */
	int batchInsertUpdate(List<NideshopCategory> param);

	/**
	 * 批量更新
	 * @param param：需要根据key值更新的对象数组
	 * @return
	 */
	int batchUpdate(List<NideshopCategory> param);

	/**
	 * 根据主键删除
	 * @param param：对应数据库唯一健
	 * @return
	 */
	int deleteByPrimaryKey(@Param("id") Integer param);

	/**
	 * 根据条件删除
	 * @param param
	 * @return
	 */
	int deleteBySelect(NideshopCategory param);

}