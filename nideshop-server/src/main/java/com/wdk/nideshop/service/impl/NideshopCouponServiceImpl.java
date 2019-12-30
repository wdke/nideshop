package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopCoupon;
import com.wdk.nideshop.web.args.NideshopCouponArgs;
import com.wdk.nideshop.service.NideshopCouponService;
import com.wdk.nideshop.storage.dao.NideshopCouponMapper;
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
public class NideshopCouponServiceImpl implements NideshopCouponService{

	private static Logger logger=LoggerFactory.getLogger(NideshopCouponServiceImpl.class);

	@Autowired
	private NideshopCouponMapper nideshopCouponMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopCouponMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopCoupon
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopCoupon> selectListByMap(Map<String,Object> param){

		List<NideshopCoupon> result=nideshopCouponMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopCoupon
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopCoupon> list(NideshopCouponArgs param){

		//参数类型转化
		NideshopCoupon nideshopCoupon = new NideshopCoupon();

		BeanUtils.copyProperties(param,nideshopCoupon);

		List<NideshopCoupon> result=nideshopCouponMapper.list(nideshopCoupon);

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
	public Integer count(NideshopCouponArgs param){

		//参数类型转化
		NideshopCoupon nideshopCoupon = new NideshopCoupon();

		BeanUtils.copyProperties(param,nideshopCoupon);

		Integer result=nideshopCouponMapper.count(nideshopCoupon);

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
	public NideshopCoupon selectByPrimaryKey(Short id){

		NideshopCoupon result=nideshopCouponMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopCoupon:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopCoupon> pageInfo(NideshopCouponArgs param,PageParam pageParam){

		//参数类型转化
		NideshopCoupon nideshopCoupon = new NideshopCoupon();
		BeanUtils.copyProperties(param,nideshopCoupon);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopCoupon> result=nideshopCouponMapper.list(nideshopCoupon);
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
	public int insert(NideshopCoupon param){

		int result=nideshopCouponMapper.insert(param);
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
	public int insertSelective(NideshopCouponArgs param){

		//参数类型转化
		NideshopCoupon nideshopCoupon = new NideshopCoupon();
		BeanUtils.copyProperties(param,nideshopCoupon);

		int result=nideshopCouponMapper.insertSelective(nideshopCoupon);

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
	public int batchInsert(List<NideshopCoupon> param){

		int result=nideshopCouponMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopCoupon param){

		int result=nideshopCouponMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopCouponArgs param){

		//参数类型转化
		NideshopCoupon nideshopCoupon = new NideshopCoupon();
		BeanUtils.copyProperties(param,nideshopCoupon);

		int result=nideshopCouponMapper.updateSelectiveByPrimaryKey( nideshopCoupon);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopCoupon> param){

		int result=nideshopCouponMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopCoupon> param){

		int result=nideshopCouponMapper.batchUpdate(param);
		return result;
	}

	/**
	* 根据主键删除数据
	* @param id
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteByPrimaryKey(Short id){

		int result=nideshopCouponMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopCoupon param){

		int result=nideshopCouponMapper.deleteBySelect(param);
		return result;
	}



}