package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopUserCoupon;
import com.wdk.nideshop.web.args.NideshopUserCouponArgs;
import com.wdk.nideshop.service.NideshopUserCouponService;
import com.wdk.nideshop.storage.dao.NideshopUserCouponMapper;
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
public class NideshopUserCouponServiceImpl implements NideshopUserCouponService{

	private static Logger logger=LoggerFactory.getLogger(NideshopUserCouponServiceImpl.class);

	@Autowired
	private NideshopUserCouponMapper nideshopUserCouponMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopUserCouponMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopUserCoupon
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopUserCoupon> selectListByMap(Map<String,Object> param){

		List<NideshopUserCoupon> result=nideshopUserCouponMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopUserCoupon
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopUserCoupon> list(NideshopUserCouponArgs param){

		//参数类型转化
		NideshopUserCoupon nideshopUserCoupon = new NideshopUserCoupon();

		BeanUtils.copyProperties(param,nideshopUserCoupon);

		List<NideshopUserCoupon> result=nideshopUserCouponMapper.list(nideshopUserCoupon);

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
	public Integer count(NideshopUserCouponArgs param){

		//参数类型转化
		NideshopUserCoupon nideshopUserCoupon = new NideshopUserCoupon();

		BeanUtils.copyProperties(param,nideshopUserCoupon);

		Integer result=nideshopUserCouponMapper.count(nideshopUserCoupon);

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
	public NideshopUserCoupon selectByPrimaryKey(Integer id){

		NideshopUserCoupon result=nideshopUserCouponMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopUserCoupon:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopUserCoupon> pageInfo(NideshopUserCouponArgs param,PageParam pageParam){

		//参数类型转化
		NideshopUserCoupon nideshopUserCoupon = new NideshopUserCoupon();
		BeanUtils.copyProperties(param,nideshopUserCoupon);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopUserCoupon> result=nideshopUserCouponMapper.list(nideshopUserCoupon);
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
	public int insert(NideshopUserCoupon param){

		int result=nideshopUserCouponMapper.insert(param);
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
	public int insertSelective(NideshopUserCouponArgs param){

		//参数类型转化
		NideshopUserCoupon nideshopUserCoupon = new NideshopUserCoupon();
		BeanUtils.copyProperties(param,nideshopUserCoupon);

		int result=nideshopUserCouponMapper.insertSelective(nideshopUserCoupon);

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
	public int batchInsert(List<NideshopUserCoupon> param){

		int result=nideshopUserCouponMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopUserCoupon param){

		int result=nideshopUserCouponMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopUserCouponArgs param){

		//参数类型转化
		NideshopUserCoupon nideshopUserCoupon = new NideshopUserCoupon();
		BeanUtils.copyProperties(param,nideshopUserCoupon);

		int result=nideshopUserCouponMapper.updateSelectiveByPrimaryKey( nideshopUserCoupon);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopUserCoupon> param){

		int result=nideshopUserCouponMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopUserCoupon> param){

		int result=nideshopUserCouponMapper.batchUpdate(param);
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

		int result=nideshopUserCouponMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopUserCoupon param){

		int result=nideshopUserCouponMapper.deleteBySelect(param);
		return result;
	}



}