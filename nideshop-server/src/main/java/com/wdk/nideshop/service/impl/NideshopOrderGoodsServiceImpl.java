package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopOrderGoods;
import com.wdk.nideshop.web.args.NideshopOrderGoodsArgs;
import com.wdk.nideshop.service.NideshopOrderGoodsService;
import com.wdk.nideshop.storage.dao.NideshopOrderGoodsMapper;
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
public class NideshopOrderGoodsServiceImpl implements NideshopOrderGoodsService{

	private static Logger logger=LoggerFactory.getLogger(NideshopOrderGoodsServiceImpl.class);

	@Autowired
	private NideshopOrderGoodsMapper nideshopOrderGoodsMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopOrderGoodsMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopOrderGoods
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopOrderGoods> selectListByMap(Map<String,Object> param){

		List<NideshopOrderGoods> result=nideshopOrderGoodsMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopOrderGoods
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopOrderGoods> list(NideshopOrderGoodsArgs param){

		//参数类型转化
		NideshopOrderGoods nideshopOrderGoods = new NideshopOrderGoods();

		BeanUtils.copyProperties(param,nideshopOrderGoods);

		List<NideshopOrderGoods> result=nideshopOrderGoodsMapper.list(nideshopOrderGoods);

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
	public Integer count(NideshopOrderGoodsArgs param){

		//参数类型转化
		NideshopOrderGoods nideshopOrderGoods = new NideshopOrderGoods();

		BeanUtils.copyProperties(param,nideshopOrderGoods);

		Integer result=nideshopOrderGoodsMapper.count(nideshopOrderGoods);

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
	public NideshopOrderGoods selectByPrimaryKey(Integer id){

		NideshopOrderGoods result=nideshopOrderGoodsMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopOrderGoods:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopOrderGoods> pageInfo(NideshopOrderGoodsArgs param,PageParam pageParam){

		//参数类型转化
		NideshopOrderGoods nideshopOrderGoods = new NideshopOrderGoods();
		BeanUtils.copyProperties(param,nideshopOrderGoods);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopOrderGoods> result=nideshopOrderGoodsMapper.list(nideshopOrderGoods);
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
	public int insert(NideshopOrderGoods param){

		int result=nideshopOrderGoodsMapper.insert(param);
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
	public int insertSelective(NideshopOrderGoodsArgs param){

		//参数类型转化
		NideshopOrderGoods nideshopOrderGoods = new NideshopOrderGoods();
		BeanUtils.copyProperties(param,nideshopOrderGoods);

		int result=nideshopOrderGoodsMapper.insertSelective(nideshopOrderGoods);

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
	public int batchInsert(List<NideshopOrderGoods> param){

		int result=nideshopOrderGoodsMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopOrderGoods param){

		int result=nideshopOrderGoodsMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopOrderGoodsArgs param){

		//参数类型转化
		NideshopOrderGoods nideshopOrderGoods = new NideshopOrderGoods();
		BeanUtils.copyProperties(param,nideshopOrderGoods);

		int result=nideshopOrderGoodsMapper.updateSelectiveByPrimaryKey( nideshopOrderGoods);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopOrderGoods> param){

		int result=nideshopOrderGoodsMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopOrderGoods> param){

		int result=nideshopOrderGoodsMapper.batchUpdate(param);
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

		int result=nideshopOrderGoodsMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopOrderGoods param){

		int result=nideshopOrderGoodsMapper.deleteBySelect(param);
		return result;
	}



}