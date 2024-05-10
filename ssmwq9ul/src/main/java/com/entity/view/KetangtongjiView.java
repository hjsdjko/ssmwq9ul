package com.entity.view;

import com.entity.KetangtongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课堂统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-04 21:23:55
 */
@TableName("ketangtongji")
public class KetangtongjiView  extends KetangtongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KetangtongjiView(){
	}
 
 	public KetangtongjiView(KetangtongjiEntity ketangtongjiEntity){
 	try {
			BeanUtils.copyProperties(this, ketangtongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
