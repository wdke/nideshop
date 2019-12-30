package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopCart;
import com.wdk.nideshop.web.args.NideshopCartArgs;
import com.wdk.nideshop.service.NideshopCartService;
import com.wdk.nideshop.storage.dao.NideshopCartMapper;
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
public class NideshopCartServiceImpl implements NideshopCartService{

	private static Logger logger=LoggerFactory.getLogger(NideshopCartServiceImpl.class);

	@Autowired
	private NideshopCartMapper nideshopCartMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopCartMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopCart
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopCart> selectListByMap(Map<String,Object> param){

		List<NideshopCart> result=nideshopCartMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopCart
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopCart> list(NideshopCartArgs param){

		//参数类型转化
		NideshopCart nideshopCart = new NideshopCart();

		BeanUtils.copyProperties(param,nideshopCart);

		List<NideshopCart> result=nideshopCartMapper.list(nideshopCart);

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
	public Integer count(NideshopCartArgs param){

		//参数类型转化
		NideshopCart nideshopCart = new NideshopCart();

		BeanUtils.copyProperties(param,nideshopCart);

		Integer result=nideshopCartMapper.count(nideshopCart);

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
	public NideshopCart selectByPrimaryKey(Integer id){

		NideshopCart result=nideshopCartMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopCart:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopCart> pageInfo(NideshopCartArgs param,PageParam pageParam){

		//参数类型转化
		NideshopCart nideshopCart = new NideshopCart();
		BeanUtils.copyProperties(param,nideshopCart);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopCart> result=nideshopCartMapper.list(nideshopCart);
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
	public int insert(NideshopCart param){

		int result=nideshopCartMapper.insert(param);
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
	public int insertSelective(NideshopCartArgs param){

		//参数类型转化
		NideshopCart nideshopCart = new NideshopCart();
		BeanUtils.copyProperties(param,nideshopCart);

		int result=nideshopCartMapper.insertSelective(nideshopCart);

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
	public int batchInsert(List<NideshopCart> param){

		int result=nideshopCartMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopCart param){

		int result=nideshopCartMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopCartArgs param){

		//参数类型转化
		NideshopCart nideshopCart = new NideshopCart();
		BeanUtils.copyProperties(param,nideshopCart);

		int result=nideshopCartMapper.updateSelectiveByPrimaryKey( nideshopCart);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopCart> param){

		int result=nideshopCartMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopCart> param){

		int result=nideshopCartMapper.batchUpdate(param);
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

		int result=nideshopCartMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopCart param){

		int result=nideshopCartMapper.deleteBySelect(param);
		return result;
	}



}