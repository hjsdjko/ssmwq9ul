package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GerenrenzhengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GerenrenzhengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GerenrenzhengView;


/**
 * 个人认证
 *
 * @author 
 * @email 
 * @date 2021-03-04 21:23:55
 */
public interface GerenrenzhengService extends IService<GerenrenzhengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GerenrenzhengVO> selectListVO(Wrapper<GerenrenzhengEntity> wrapper);
   	
   	GerenrenzhengVO selectVO(@Param("ew") Wrapper<GerenrenzhengEntity> wrapper);
   	
   	List<GerenrenzhengView> selectListView(Wrapper<GerenrenzhengEntity> wrapper);
   	
   	GerenrenzhengView selectView(@Param("ew") Wrapper<GerenrenzhengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GerenrenzhengEntity> wrapper);
   	
}

