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


import com.dao.KetangtongjiDao;
import com.entity.KetangtongjiEntity;
import com.service.KetangtongjiService;
import com.entity.vo.KetangtongjiVO;
import com.entity.view.KetangtongjiView;

@Service("ketangtongjiService")
public class KetangtongjiServiceImpl extends ServiceImpl<KetangtongjiDao, KetangtongjiEntity> implements KetangtongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KetangtongjiEntity> page = this.selectPage(
                new Query<KetangtongjiEntity>(params).getPage(),
                new EntityWrapper<KetangtongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KetangtongjiEntity> wrapper) {
		  Page<KetangtongjiView> page =new Query<KetangtongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KetangtongjiVO> selectListVO(Wrapper<KetangtongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KetangtongjiVO selectVO(Wrapper<KetangtongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KetangtongjiView> selectListView(Wrapper<KetangtongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KetangtongjiView selectView(Wrapper<KetangtongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
