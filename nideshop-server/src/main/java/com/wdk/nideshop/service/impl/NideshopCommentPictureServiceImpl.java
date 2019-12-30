package com.wdk.nideshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdk.nideshop.common.model.PageParam;
import com.wdk.nideshop.storage.entity.NideshopCommentPicture;
import com.wdk.nideshop.web.args.NideshopCommentPictureArgs;
import com.wdk.nideshop.service.NideshopCommentPictureService;
import com.wdk.nideshop.storage.dao.NideshopCommentPictureMapper;
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
public class NideshopCommentPictureServiceImpl implements NideshopCommentPictureService{

	private static Logger logger=LoggerFactory.getLogger(NideshopCommentPictureServiceImpl.class);

	@Autowired
	private NideshopCommentPictureMapper nideshopCommentPictureMapper;



	/**
	* 查询返回key为数据库字段的map
	* @param param ：查询条件Map,key为数据库字段，value为值
	* @return ：List<Map<String,Object>>
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<Map<String,Object>> selectListByMapReturnMap(Map<String,Object> param){

		List<Map<String,Object>> result=nideshopCommentPictureMapper.selectListByMapReturnMap(param);
		return result;
	}

	/**
	* 根据map获取查询列表
	* @param param ：查询条件Map,key为java对应字段，value为值
	* @return ：List<NideshopCommentPicture
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopCommentPicture> selectListByMap(Map<String,Object> param){

		List<NideshopCommentPicture> result=nideshopCommentPictureMapper.selectListByMap(param);
		return result;
	}

	/**
	* 获取查询列表
	* @param param
	* @return ：List<NideshopCommentPicture
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public List<NideshopCommentPicture> list(NideshopCommentPictureArgs param){

		//参数类型转化
		NideshopCommentPicture nideshopCommentPicture = new NideshopCommentPicture();

		BeanUtils.copyProperties(param,nideshopCommentPicture);

		List<NideshopCommentPicture> result=nideshopCommentPictureMapper.list(nideshopCommentPicture);

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
	public Integer count(NideshopCommentPictureArgs param){

		//参数类型转化
		NideshopCommentPicture nideshopCommentPicture = new NideshopCommentPicture();

		BeanUtils.copyProperties(param,nideshopCommentPicture);

		Integer result=nideshopCommentPictureMapper.count(nideshopCommentPicture);

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
	public NideshopCommentPicture selectByPrimaryKey(Integer id){

		NideshopCommentPicture result=nideshopCommentPictureMapper.selectByPrimaryKey(id);
		return result;
	}

	/**
	* 分页查询
	* @param param：查询参数
	* @param pageParam ::分页参数
	* @return ：PageInfo<NideshopCommentPicture:分页结果集
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public PageInfo<NideshopCommentPicture> pageInfo(NideshopCommentPictureArgs param,PageParam pageParam){

		//参数类型转化
		NideshopCommentPicture nideshopCommentPicture = new NideshopCommentPicture();
		BeanUtils.copyProperties(param,nideshopCommentPicture);

		PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());

		List<NideshopCommentPicture> result=nideshopCommentPictureMapper.list(nideshopCommentPicture);
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
	public int insert(NideshopCommentPicture param){

		int result=nideshopCommentPictureMapper.insert(param);
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
	public int insertSelective(NideshopCommentPictureArgs param){

		//参数类型转化
		NideshopCommentPicture nideshopCommentPicture = new NideshopCommentPicture();
		BeanUtils.copyProperties(param,nideshopCommentPicture);

		int result=nideshopCommentPictureMapper.insertSelective(nideshopCommentPicture);

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
	public int batchInsert(List<NideshopCommentPicture> param){

		int result=nideshopCommentPictureMapper.batchInsert(param);
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
	public int updateByPrimaryKey(NideshopCommentPicture param){

		int result=nideshopCommentPictureMapper.updateByPrimaryKey(param);
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
	public int updateSelectiveByPrimaryKey(NideshopCommentPictureArgs param){

		//参数类型转化
		NideshopCommentPicture nideshopCommentPicture = new NideshopCommentPicture();
		BeanUtils.copyProperties(param,nideshopCommentPicture);

		int result=nideshopCommentPictureMapper.updateSelectiveByPrimaryKey( nideshopCommentPicture);

		return result;
	}

	/**
	* 存在即更新，不存在就插入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchInsertUpdate(List<NideshopCommentPicture> param){

		int result=nideshopCommentPictureMapper.batchInsertUpdate(param);
		return result;
	}

	/**
	* 批量更新入
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int batchUpdate(List<NideshopCommentPicture> param){

		int result=nideshopCommentPictureMapper.batchUpdate(param);
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

		int result=nideshopCommentPictureMapper.deleteByPrimaryKey(id);
		return result;
	}

	/**
	* 根据查询删除数据
	* @param param
	* @author jack
	* @date 2019/12/30 19:37
	*/
	@Override
	public int deleteBySelect(NideshopCommentPicture param){

		int result=nideshopCommentPictureMapper.deleteBySelect(param);
		return result;
	}



}