package com.dao;

import com.entity.KetangtongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KetangtongjiVO;
import com.entity.view.KetangtongjiView;


/**
 * 课堂统计
 * 
 * @author 
 * @email 
 * @date 2021-03-04 21:23:55
 */
public interface KetangtongjiDao extends BaseMapper<KetangtongjiEntity> {
	
	List<KetangtongjiVO> selectListVO(@Param("ew") Wrapper<KetangtongjiEntity> wrapper);
	
	KetangtongjiVO selectVO(@Param("ew") Wrapper<KetangtongjiEntity> wrapper);
	
	List<KetangtongjiView> selectListView(@Param("ew") Wrapper<KetangtongjiEntity> wrapper);

	List<KetangtongjiView> selectListView(Pagination page,@Param("ew") Wrapper<KetangtongjiEntity> wrapper);
	
	KetangtongjiView selectView(@Param("ew") Wrapper<KetangtongjiEntity> wrapper);
	
}
