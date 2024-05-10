package com.dao;

import com.entity.GerenrenzhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GerenrenzhengVO;
import com.entity.view.GerenrenzhengView;


/**
 * 个人认证
 * 
 * @author 
 * @email 
 * @date 2021-03-04 21:23:55
 */
public interface GerenrenzhengDao extends BaseMapper<GerenrenzhengEntity> {
	
	List<GerenrenzhengVO> selectListVO(@Param("ew") Wrapper<GerenrenzhengEntity> wrapper);
	
	GerenrenzhengVO selectVO(@Param("ew") Wrapper<GerenrenzhengEntity> wrapper);
	
	List<GerenrenzhengView> selectListView(@Param("ew") Wrapper<GerenrenzhengEntity> wrapper);

	List<GerenrenzhengView> selectListView(Pagination page,@Param("ew") Wrapper<GerenrenzhengEntity> wrapper);
	
	GerenrenzhengView selectView(@Param("ew") Wrapper<GerenrenzhengEntity> wrapper);
	
}
