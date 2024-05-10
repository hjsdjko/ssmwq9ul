package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KetangjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KetangjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KetangjiluView;


/**
 * 课堂记录
 *
 * @author 
 * @email 
 * @date 2021-03-04 21:23:55
 */
public interface KetangjiluService extends IService<KetangjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KetangjiluVO> selectListVO(Wrapper<KetangjiluEntity> wrapper);
   	
   	KetangjiluVO selectVO(@Param("ew") Wrapper<KetangjiluEntity> wrapper);
   	
   	List<KetangjiluView> selectListView(Wrapper<KetangjiluEntity> wrapper);
   	
   	KetangjiluView selectView(@Param("ew") Wrapper<KetangjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KetangjiluEntity> wrapper);
   	
}

