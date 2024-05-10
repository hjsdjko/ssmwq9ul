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


import com.dao.KetangjiluDao;
import com.entity.KetangjiluEntity;
import com.service.KetangjiluService;
import com.entity.vo.KetangjiluVO;
import com.entity.view.KetangjiluView;

@Service("ketangjiluService")
public class KetangjiluServiceImpl extends ServiceImpl<KetangjiluDao, KetangjiluEntity> implements KetangjiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KetangjiluEntity> page = this.selectPage(
                new Query<KetangjiluEntity>(params).getPage(),
                new EntityWrapper<KetangjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KetangjiluEntity> wrapper) {
		  Page<KetangjiluView> page =new Query<KetangjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KetangjiluVO> selectListVO(Wrapper<KetangjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KetangjiluVO selectVO(Wrapper<KetangjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KetangjiluView> selectListView(Wrapper<KetangjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KetangjiluView selectView(Wrapper<KetangjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
