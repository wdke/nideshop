package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopAdmin;
import com.wdk.nideshop.web.args.NideshopAdminArgs;
import com.wdk.nideshop.service.NideshopAdminService;
import com.wdk.nideshop.storage.dao.NideshopAdminMapper;
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
public class NideshopAdminServiceImpl implements NideshopAdminService{

	private static Logger logger=LoggerFactory.getLogger(NideshopAdminServiceImpl.class);

	@Autowired
	private NideshopAdminMapper nideshopAdminMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopAdminMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopAdmin
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopAdmin> selectListByMap(Map<String,Object> param){

		List<NideshopAdmin> result=nideshopAdminMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopAdmin
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopAdmin> list(NideshopAdminArgs param){

		//参数类型转化
		NideshopAdmin nideshopAdmin = new NideshopAdmin();

		BeanUtils.copyProperties(param,nideshopAdmin);

		List<NideshopAdmin> result=nideshopAdminMapper.list(nideshopAdmin);

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
	public Integer count(NideshopAdminArgs param){

		//参数类型转化
		NideshopAdmin nideshopAdmin = new NideshopAdmin();

		BeanUtils.copyProperties(param,nideshopAdmin);

		Integer result=nideshopAdminMapper.count(nideshopAdmin);

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
	public NideshopAdmin selectByPrimaryKey(Integer id){

		NideshopAdmin result=nideshopAdminMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopAdmin:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopAdmin> pageInfo(NideshopAdminArgs param,PageParam pageParam){

		//参数类型转化
		NideshopAdmin nideshopAdmin = new NideshopAdmin();
		BeanUtils.copyProperties(param,nideshopAdmin);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopAdmin> result=nideshopAdminMapper.list(nideshopAdmin);
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
	public int insert(NideshopAdmin param){

		int result=nideshopAdminMapper.insert(param);
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
	public int insertSelective(NideshopAdminArgs param){

		//参数类型转化
		NideshopAdmin nideshopAdmin = new NideshopAdmin();
		BeanUtils.copyProperties(param,nideshopAdmin);

		int result=nideshopAdminMapper.insertSelective(nideshopAdmin);

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
	public int batchInsert(List<NideshopAdmin> param){

		int result=nideshopAdminMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopAdmin param){

		int result=nideshopAdminMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopAdminArgs param){

		//参数类型转化
		NideshopAdmin nideshopAdmin = new NideshopAdmin();
		BeanUtils.copyProperties(param,nideshopAdmin);

		int result=nideshopAdminMapper.updateSelectiveByPrimaryKey( nideshopAdmin);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopAdmin> param){

		int result=nideshopAdminMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopAdmin> param){

		int result=nideshopAdminMapper.batchUpdate(param);
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

		int result=nideshopAdminMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopAdmin param){

		int result=nideshopAdminMapper.deleteBySelect(param);
		return result;
	}



}