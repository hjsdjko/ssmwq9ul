package com.dao;

import com.entity.KetangjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KetangjiluVO;
import com.entity.view.KetangjiluView;


/**
 * 课堂记录
 * 
 * @author 
 * @email 
 * @date 2021-03-04 21:23:55
 */
public interface KetangjiluDao extends BaseMapper<KetangjiluEntity> {
	
	List<KetangjiluVO> selectListVO(@Param("ew") Wrapper<KetangjiluEntity> wrapper);
	
	KetangjiluVO selectVO(@Param("ew") Wrapper<KetangjiluEntity> wrapper);
	
	List<KetangjiluView> selectListView(@Param("ew") Wrapper<KetangjiluEntity> wrapper);

	List<KetangjiluView> selectListView(Pagination page,@Param("ew") Wrapper<KetangjiluEntity> wrapper);
	
	KetangjiluView selectView(@Param("ew") Wrapper<KetangjiluEntity> wrapper);
	
}
