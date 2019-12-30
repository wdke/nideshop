package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopAdPosition;
import com.wdk.nideshop.web.args.NideshopAdPositionArgs;
import com.wdk.nideshop.service.NideshopAdPositionService;
import com.wdk.nideshop.storage.dao.NideshopAdPositionMapper;
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
public class NideshopAdPositionServiceImpl implements NideshopAdPositionService{

	private static Logger logger=LoggerFactory.getLogger(NideshopAdPositionServiceImpl.class);

	@Autowired
	private NideshopAdPositionMapper nideshopAdPositionMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopAdPositionMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopAdPosition
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopAdPosition> selectListByMap(Map<String,Object> param){

		List<NideshopAdPosition> result=nideshopAdPositionMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopAdPosition
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopAdPosition> list(NideshopAdPositionArgs param){

		//参数类型转化
		NideshopAdPosition nideshopAdPosition = new NideshopAdPosition();

		BeanUtils.copyProperties(param,nideshopAdPosition);

		List<NideshopAdPosition> result=nideshopAdPositionMapper.list(nideshopAdPosition);

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
	public Integer count(NideshopAdPositionArgs param){

		//参数类型转化
		NideshopAdPosition nideshopAdPosition = new NideshopAdPosition();

		BeanUtils.copyProperties(param,nideshopAdPosition);

		Integer result=nideshopAdPositionMapper.count(nideshopAdPosition);

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
	public NideshopAdPosition selectByPrimaryKey(Byte id){

		NideshopAdPosition result=nideshopAdPositionMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopAdPosition:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopAdPosition> pageInfo(NideshopAdPositionArgs param,PageParam pageParam){

		//参数类型转化
		NideshopAdPosition nideshopAdPosition = new NideshopAdPosition();
		BeanUtils.copyProperties(param,nideshopAdPosition);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopAdPosition> result=nideshopAdPositionMapper.list(nideshopAdPosition);
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
	public int insert(NideshopAdPosition param){

		int result=nideshopAdPositionMapper.insert(param);
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
	public int insertSelective(NideshopAdPositionArgs param){

		//参数类型转化
		NideshopAdPosition nideshopAdPosition = new NideshopAdPosition();
		BeanUtils.copyProperties(param,nideshopAdPosition);

		int result=nideshopAdPositionMapper.insertSelective(nideshopAdPosition);

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
	public int batchInsert(List<NideshopAdPosition> param){

		int result=nideshopAdPositionMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopAdPosition param){

		int result=nideshopAdPositionMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopAdPositionArgs param){

		//参数类型转化
		NideshopAdPosition nideshopAdPosition = new NideshopAdPosition();
		BeanUtils.copyProperties(param,nideshopAdPosition);

		int result=nideshopAdPositionMapper.updateSelectiveByPrimaryKey( nideshopAdPosition);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopAdPosition> param){

		int result=nideshopAdPositionMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopAdPosition> param){

		int result=nideshopAdPositionMapper.batchUpdate(param);
		return result;
	}

	/**
	* 根据主键删除数据
	* @param id
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteByPrimaryKey(Byte id){

		int result=nideshopAdPositionMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopAdPosition param){

		int result=nideshopAdPositionMapper.deleteBySelect(param);
		return result;
	}



}