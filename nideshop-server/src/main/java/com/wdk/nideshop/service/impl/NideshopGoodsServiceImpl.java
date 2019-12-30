package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopGoods;
import com.wdk.nideshop.web.args.NideshopGoodsArgs;
import com.wdk.nideshop.service.NideshopGoodsService;
import com.wdk.nideshop.storage.dao.NideshopGoodsMapper;
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
 *商品表
 * @author wdke
 * @date 2019/12/30
 */
@Service
public class NideshopGoodsServiceImpl implements NideshopGoodsService{

	private static Logger logger=LoggerFactory.getLogger(NideshopGoodsServiceImpl.class);

	@Autowired
	private NideshopGoodsMapper nideshopGoodsMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopGoodsMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopGoods
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopGoods> selectListByMap(Map<String,Object> param){

		List<NideshopGoods> result=nideshopGoodsMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopGoods
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopGoods> list(NideshopGoodsArgs param){

		//参数类型转化
		NideshopGoods nideshopGoods = new NideshopGoods();

		BeanUtils.copyProperties(param,nideshopGoods);

		List<NideshopGoods> result=nideshopGoodsMapper.list(nideshopGoods);

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
	public Integer count(NideshopGoodsArgs param){

		//参数类型转化
		NideshopGoods nideshopGoods = new NideshopGoods();

		BeanUtils.copyProperties(param,nideshopGoods);

		Integer result=nideshopGoodsMapper.count(nideshopGoods);

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
	public NideshopGoods selectByPrimaryKey(Integer id){

		NideshopGoods result=nideshopGoodsMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopGoods:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopGoods> pageInfo(NideshopGoodsArgs param,PageParam pageParam){

		//参数类型转化
		NideshopGoods nideshopGoods = new NideshopGoods();
		BeanUtils.copyProperties(param,nideshopGoods);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopGoods> result=nideshopGoodsMapper.list(nideshopGoods);
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
	public int insert(NideshopGoods param){

		int result=nideshopGoodsMapper.insert(param);
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
	public int insertSelective(NideshopGoodsArgs param){

		//参数类型转化
		NideshopGoods nideshopGoods = new NideshopGoods();
		BeanUtils.copyProperties(param,nideshopGoods);

		int result=nideshopGoodsMapper.insertSelective(nideshopGoods);

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
	public int batchInsert(List<NideshopGoods> param){

		int result=nideshopGoodsMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopGoods param){

		int result=nideshopGoodsMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopGoodsArgs param){

		//参数类型转化
		NideshopGoods nideshopGoods = new NideshopGoods();
		BeanUtils.copyProperties(param,nideshopGoods);

		int result=nideshopGoodsMapper.updateSelectiveByPrimaryKey( nideshopGoods);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopGoods> param){

		int result=nideshopGoodsMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopGoods> param){

		int result=nideshopGoodsMapper.batchUpdate(param);
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

		int result=nideshopGoodsMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopGoods param){

		int result=nideshopGoodsMapper.deleteBySelect(param);
		return result;
	}



}