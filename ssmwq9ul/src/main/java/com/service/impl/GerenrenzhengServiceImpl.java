package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GerenrenzhengDao;
import com.entity.GerenrenzhengEntity;
import com.service.GerenrenzhengService;
import com.entity.vo.GerenrenzhengVO;
import com.entity.view.GerenrenzhengView;

@Service("gerenrenzhengService")
public class GerenrenzhengServiceImpl extends ServiceImpl<GerenrenzhengDao, GerenrenzhengEntity> implements GerenrenzhengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GerenrenzhengEntity> page = this.selectPage(
                new Query<GerenrenzhengEntity>(params).getPage(),
                new EntityWrapper<GerenrenzhengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GerenrenzhengEntity> wrapper) {
		  Page<GerenrenzhengView> page =new Query<GerenrenzhengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GerenrenzhengVO> selectListVO(Wrapper<GerenrenzhengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GerenrenzhengVO selectVO(Wrapper<GerenrenzhengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GerenrenzhengView> selectListView(Wrapper<GerenrenzhengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GerenrenzhengView selectView(Wrapper<GerenrenzhengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
