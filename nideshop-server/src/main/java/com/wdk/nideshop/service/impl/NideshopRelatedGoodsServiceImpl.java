package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopRelatedGoods;
import com.wdk.nideshop.web.args.NideshopRelatedGoodsArgs;
import com.wdk.nideshop.service.NideshopRelatedGoodsService;
import com.wdk.nideshop.storage.dao.NideshopRelatedGoodsMapper;
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
public class NideshopRelatedGoodsServiceImpl implements NideshopRelatedGoodsService{

	private static Logger logger=LoggerFactory.getLogger(NideshopRelatedGoodsServiceImpl.class);

	@Autowired
	private NideshopRelatedGoodsMapper nideshopRelatedGoodsMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopRelatedGoodsMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopRelatedGoods
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopRelatedGoods> selectListByMap(Map<String,Object> param){

		List<NideshopRelatedGoods> result=nideshopRelatedGoodsMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopRelatedGoods
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopRelatedGoods> list(NideshopRelatedGoodsArgs param){

		//参数类型转化
		NideshopRelatedGoods nideshopRelatedGoods = new NideshopRelatedGoods();

		BeanUtils.copyProperties(param,nideshopRelatedGoods);

		List<NideshopRelatedGoods> result=nideshopRelatedGoodsMapper.list(nideshopRelatedGoods);

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
	public Integer count(NideshopRelatedGoodsArgs param){

		//参数类型转化
		NideshopRelatedGoods nideshopRelatedGoods = new NideshopRelatedGoods();

		BeanUtils.copyProperties(param,nideshopRelatedGoods);

		Integer result=nideshopRelatedGoodsMapper.count(nideshopRelatedGoods);

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
	public NideshopRelatedGoods selectByPrimaryKey(Integer id){

		NideshopRelatedGoods result=nideshopRelatedGoodsMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopRelatedGoods:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopRelatedGoods> pageInfo(NideshopRelatedGoodsArgs param,PageParam pageParam){

		//参数类型转化
		NideshopRelatedGoods nideshopRelatedGoods = new NideshopRelatedGoods();
		BeanUtils.copyProperties(param,nideshopRelatedGoods);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopRelatedGoods> result=nideshopRelatedGoodsMapper.list(nideshopRelatedGoods);
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
	public int insert(NideshopRelatedGoods param){

		int result=nideshopRelatedGoodsMapper.insert(param);
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
	public int insertSelective(NideshopRelatedGoodsArgs param){

		//参数类型转化
		NideshopRelatedGoods nideshopRelatedGoods = new NideshopRelatedGoods();
		BeanUtils.copyProperties(param,nideshopRelatedGoods);

		int result=nideshopRelatedGoodsMapper.insertSelective(nideshopRelatedGoods);

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
	public int batchInsert(List<NideshopRelatedGoods> param){

		int result=nideshopRelatedGoodsMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopRelatedGoods param){

		int result=nideshopRelatedGoodsMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopRelatedGoodsArgs param){

		//参数类型转化
		NideshopRelatedGoods nideshopRelatedGoods = new NideshopRelatedGoods();
		BeanUtils.copyProperties(param,nideshopRelatedGoods);

		int result=nideshopRelatedGoodsMapper.updateSelectiveByPrimaryKey( nideshopRelatedGoods);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopRelatedGoods> param){

		int result=nideshopRelatedGoodsMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopRelatedGoods> param){

		int result=nideshopRelatedGoodsMapper.batchUpdate(param);
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

		int result=nideshopRelatedGoodsMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopRelatedGoods param){

		int result=nideshopRelatedGoodsMapper.deleteBySelect(param);
		return result;
	}



}