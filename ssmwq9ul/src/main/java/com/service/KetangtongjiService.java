package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KetangtongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KetangtongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KetangtongjiView;


/**
 * 课堂统计
 *
 * @author 
 * @email 
 * @date 2021-03-04 21:23:55
 */
public interface KetangtongjiService extends IService<KetangtongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KetangtongjiVO> selectListVO(Wrapper<KetangtongjiEntity> wrapper);
   	
   	KetangtongjiVO selectVO(@Param("ew") Wrapper<KetangtongjiEntity> wrapper);
   	
   	List<KetangtongjiView> selectListView(Wrapper<KetangtongjiEntity> wrapper);
   	
   	KetangtongjiView selectView(@Param("ew") Wrapper<KetangtongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KetangtongjiEntity> wrapper);
   	
}

