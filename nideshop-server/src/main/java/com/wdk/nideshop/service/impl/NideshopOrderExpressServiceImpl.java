package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopOrderExpress;
import com.wdk.nideshop.web.args.NideshopOrderExpressArgs;
import com.wdk.nideshop.service.NideshopOrderExpressService;
import com.wdk.nideshop.storage.dao.NideshopOrderExpressMapper;
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
 *订单物流信息表，发货时生成
 * @author wdke
 * @date 2019/12/30
 */
@Service
public class NideshopOrderExpressServiceImpl implements NideshopOrderExpressService{

	private static Logger logger=LoggerFactory.getLogger(NideshopOrderExpressServiceImpl.class);

	@Autowired
	private NideshopOrderExpressMapper nideshopOrderExpressMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopOrderExpressMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopOrderExpress
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopOrderExpress> selectListByMap(Map<String,Object> param){

		List<NideshopOrderExpress> result=nideshopOrderExpressMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopOrderExpress
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopOrderExpress> list(NideshopOrderExpressArgs param){

		//参数类型转化
		NideshopOrderExpress nideshopOrderExpress = new NideshopOrderExpress();

		BeanUtils.copyProperties(param,nideshopOrderExpress);

		List<NideshopOrderExpress> result=nideshopOrderExpressMapper.list(nideshopOrderExpress);

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
	public Integer count(NideshopOrderExpressArgs param){

		//参数类型转化
		NideshopOrderExpress nideshopOrderExpress = new NideshopOrderExpress();

		BeanUtils.copyProperties(param,nideshopOrderExpress);

		Integer result=nideshopOrderExpressMapper.count(nideshopOrderExpress);

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
	public NideshopOrderExpress selectByPrimaryKey(Integer id){

		NideshopOrderExpress result=nideshopOrderExpressMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopOrderExpress:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopOrderExpress> pageInfo(NideshopOrderExpressArgs param,PageParam pageParam){

		//参数类型转化
		NideshopOrderExpress nideshopOrderExpress = new NideshopOrderExpress();
		BeanUtils.copyProperties(param,nideshopOrderExpress);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopOrderExpress> result=nideshopOrderExpressMapper.list(nideshopOrderExpress);
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
	public int insert(NideshopOrderExpress param){

		int result=nideshopOrderExpressMapper.insert(param);
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
	public int insertSelective(NideshopOrderExpressArgs param){

		//参数类型转化
		NideshopOrderExpress nideshopOrderExpress = new NideshopOrderExpress();
		BeanUtils.copyProperties(param,nideshopOrderExpress);

		int result=nideshopOrderExpressMapper.insertSelective(nideshopOrderExpress);

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
	public int batchInsert(List<NideshopOrderExpress> param){

		int result=nideshopOrderExpressMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopOrderExpress param){

		int result=nideshopOrderExpressMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopOrderExpressArgs param){

		//参数类型转化
		NideshopOrderExpress nideshopOrderExpress = new NideshopOrderExpress();
		BeanUtils.copyProperties(param,nideshopOrderExpress);

		int result=nideshopOrderExpressMapper.updateSelectiveByPrimaryKey( nideshopOrderExpress);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopOrderExpress> param){

		int result=nideshopOrderExpressMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopOrderExpress> param){

		int result=nideshopOrderExpressMapper.batchUpdate(param);
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

		int result=nideshopOrderExpressMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopOrderExpress param){

		int result=nideshopOrderExpressMapper.deleteBySelect(param);
		return result;
	}



}