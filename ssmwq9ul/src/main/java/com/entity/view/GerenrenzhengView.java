package com.entity.view;

import com.entity.GerenrenzhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 个人认证
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-04 21:23:55
 */
@TableName("gerenrenzheng")
public class GerenrenzhengView  extends GerenrenzhengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GerenrenzhengView(){
	}
 
 	public GerenrenzhengView(GerenrenzhengEntity gerenrenzhengEntity){
 	try {
			BeanUtils.copyProperties(this, gerenrenzhengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
