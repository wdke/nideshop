package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopShipper;
import com.wdk.nideshop.web.args.NideshopShipperArgs;
import com.wdk.nideshop.service.NideshopShipperService;
import com.wdk.nideshop.storage.dao.NideshopShipperMapper;
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
 *快递公司
 * @author wdke
 * @date 2019/12/30
 */
@Service
public class NideshopShipperServiceImpl implements NideshopShipperService{

	private static Logger logger=LoggerFactory.getLogger(NideshopShipperServiceImpl.class);

	@Autowired
	private NideshopShipperMapper nideshopShipperMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopShipperMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopShipper
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopShipper> selectListByMap(Map<String,Object> param){

		List<NideshopShipper> result=nideshopShipperMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopShipper
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopShipper> list(NideshopShipperArgs param){

		//参数类型转化
		NideshopShipper nideshopShipper = new NideshopShipper();

		BeanUtils.copyProperties(param,nideshopShipper);

		List<NideshopShipper> result=nideshopShipperMapper.list(nideshopShipper);

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
	public Integer count(NideshopShipperArgs param){

		//参数类型转化
		NideshopShipper nideshopShipper = new NideshopShipper();

		BeanUtils.copyProperties(param,nideshopShipper);

		Integer result=nideshopShipperMapper.count(nideshopShipper);

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
	public NideshopShipper selectByPrimaryKey(Integer id){

		NideshopShipper result=nideshopShipperMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopShipper:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopShipper> pageInfo(NideshopShipperArgs param,PageParam pageParam){

		//参数类型转化
		NideshopShipper nideshopShipper = new NideshopShipper();
		BeanUtils.copyProperties(param,nideshopShipper);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopShipper> result=nideshopShipperMapper.list(nideshopShipper);
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
	public int insert(NideshopShipper param){

		int result=nideshopShipperMapper.insert(param);
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
	public int insertSelective(NideshopShipperArgs param){

		//参数类型转化
		NideshopShipper nideshopShipper = new NideshopShipper();
		BeanUtils.copyProperties(param,nideshopShipper);

		int result=nideshopShipperMapper.insertSelective(nideshopShipper);

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
	public int batchInsert(List<NideshopShipper> param){

		int result=nideshopShipperMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopShipper param){

		int result=nideshopShipperMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopShipperArgs param){

		//参数类型转化
		NideshopShipper nideshopShipper = new NideshopShipper();
		BeanUtils.copyProperties(param,nideshopShipper);

		int result=nideshopShipperMapper.updateSelectiveByPrimaryKey( nideshopShipper);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopShipper> param){

		int result=nideshopShipperMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopShipper> param){

		int result=nideshopShipperMapper.batchUpdate(param);
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

		int result=nideshopShipperMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopShipper param){

		int result=nideshopShipperMapper.deleteBySelect(param);
		return result;
	}



}