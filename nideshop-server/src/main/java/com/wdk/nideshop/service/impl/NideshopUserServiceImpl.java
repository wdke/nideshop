package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopUser;
import com.wdk.nideshop.web.args.NideshopUserArgs;
import com.wdk.nideshop.service.NideshopUserService;
import com.wdk.nideshop.storage.dao.NideshopUserMapper;
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
public class NideshopUserServiceImpl implements NideshopUserService{

	private static Logger logger=LoggerFactory.getLogger(NideshopUserServiceImpl.class);

	@Autowired
	private NideshopUserMapper nideshopUserMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopUserMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopUser
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopUser> selectListByMap(Map<String,Object> param){

		List<NideshopUser> result=nideshopUserMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopUser
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopUser> list(NideshopUserArgs param){

		//参数类型转化
		NideshopUser nideshopUser = new NideshopUser();

		BeanUtils.copyProperties(param,nideshopUser);

		List<NideshopUser> result=nideshopUserMapper.list(nideshopUser);

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
	public Integer count(NideshopUserArgs param){

		//参数类型转化
		NideshopUser nideshopUser = new NideshopUser();

		BeanUtils.copyProperties(param,nideshopUser);

		Integer result=nideshopUserMapper.count(nideshopUser);

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
	public NideshopUser selectByPrimaryKey(Integer id){

		NideshopUser result=nideshopUserMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopUser:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopUser> pageInfo(NideshopUserArgs param,PageParam pageParam){

		//参数类型转化
		NideshopUser nideshopUser = new NideshopUser();
		BeanUtils.copyProperties(param,nideshopUser);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopUser> result=nideshopUserMapper.list(nideshopUser);
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
	public int insert(NideshopUser param){

		int result=nideshopUserMapper.insert(param);
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
	public int insertSelective(NideshopUserArgs param){

		//参数类型转化
		NideshopUser nideshopUser = new NideshopUser();
		BeanUtils.copyProperties(param,nideshopUser);

		int result=nideshopUserMapper.insertSelective(nideshopUser);

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
	public int batchInsert(List<NideshopUser> param){

		int result=nideshopUserMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopUser param){

		int result=nideshopUserMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopUserArgs param){

		//参数类型转化
		NideshopUser nideshopUser = new NideshopUser();
		BeanUtils.copyProperties(param,nideshopUser);

		int result=nideshopUserMapper.updateSelectiveByPrimaryKey( nideshopUser);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopUser> param){

		int result=nideshopUserMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopUser> param){

		int result=nideshopUserMapper.batchUpdate(param);
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

		int result=nideshopUserMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopUser param){

		int result=nideshopUserMapper.deleteBySelect(param);
		return result;
	}



}