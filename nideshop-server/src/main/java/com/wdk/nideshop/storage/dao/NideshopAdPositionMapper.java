package com.wdk.nideshop.storage.dao;

import com.wdk.nideshop.storage.entity.NideshopAdPosition;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**

 * @author wdke
 * @date 2019/12/30
 */
@Repository
public interface NideshopAdPositionMapper{

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
	List<NideshopAdPosition> selectListByMap(Map<String,Object> param);

	/**
	 * 获取查询列表
	 * @param param ：不为空的属性
	 * @return
	 */
	List<NideshopAdPosition> list(NideshopAdPosition param);

	/**
	 * 统计接口
	 * @param param ：不为空的属性
	 * @return
	 */
	Integer count(NideshopAdPosition param);

	/**
	 * 全量新增
	 * @param param
	 * @return
	 */
	int insert(NideshopAdPosition param);

	/**
	 * 不为空新增
	 * @param param
	 * @return
	 */
	int insertSelective(NideshopAdPosition param);

	/**
	 * 批量新增
	 * @param param
	 * @return
	 */
	int batchInsert(List<NideshopAdPosition> param);

	/**
	 * 获取查询列表
	 * @param param ：不为空的属性
	 * @return
	 */
	NideshopAdPosition selectByPrimaryKey(@Param("id") Byte param);

	/**
	 * 更新全量
	 * @param param
	 * @return
	 */
	int updateByPrimaryKey(NideshopAdPosition param);

	/**
	 * 更新不为空
	 * @param param
	 * @return
	 */
	int updateSelectiveByPrimaryKey(NideshopAdPosition param);

	/**
	 * 批量存在就更新，不存在就新增
	 * @param param：需要新增或根据key值更新的对象数组
	 * @return
	 */
	int batchInsertUpdate(List<NideshopAdPosition> param);

	/**
	 * 批量更新
	 * @param param：需要根据key值更新的对象数组
	 * @return
	 */
	int batchUpdate(List<NideshopAdPosition> param);

	/**
	 * 根据主键删除
	 * @param param：对应数据库唯一健
	 * @return
	 */
	int deleteByPrimaryKey(@Param("id") Byte param);

	/**
	 * 根据条件删除
	 * @param param
	 * @return
	 */
	int deleteBySelect(NideshopAdPosition param);

}