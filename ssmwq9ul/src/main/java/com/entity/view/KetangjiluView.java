package com.entity.view;

import com.entity.KetangjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课堂记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-04 21:23:55
 */
@TableName("ketangjilu")
public class KetangjiluView  extends KetangjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KetangjiluView(){
	}
 
 	public KetangjiluView(KetangjiluEntity ketangjiluEntity){
 	try {
			BeanUtils.copyProperties(this, ketangjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
