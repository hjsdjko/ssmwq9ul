package com.entity.vo;

import com.entity.KetangtongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 课堂统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-04 21:23:55
 */
public class KetangtongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 月份
	 */
	
	private String yuefen;
		
	/**
	 * 本月课堂数
	 */
	
	private String benyueketangshu;
		
	/**
	 * 本月请假数
	 */
	
	private String benyueqingjiashu;
		
	/**
	 * 实际上课数
	 */
	
	private String shijishangkeshu;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：月份
	 */
	 
	public void setYuefen(String yuefen) {
		this.yuefen = yuefen;
	}
	
	/**
	 * 获取：月份
	 */
	public String getYuefen() {
		return yuefen;
	}
				
	
	/**
	 * 设置：本月课堂数
	 */
	 
	public void setBenyueketangshu(String benyueketangshu) {
		this.benyueketangshu = benyueketangshu;
	}
	
	/**
	 * 获取：本月课堂数
	 */
	public String getBenyueketangshu() {
		return benyueketangshu;
	}
				
	
	/**
	 * 设置：本月请假数
	 */
	 
	public void setBenyueqingjiashu(String benyueqingjiashu) {
		this.benyueqingjiashu = benyueqingjiashu;
	}
	
	/**
	 * 获取：本月请假数
	 */
	public String getBenyueqingjiashu() {
		return benyueqingjiashu;
	}
				
	
	/**
	 * 设置：实际上课数
	 */
	 
	public void setShijishangkeshu(String shijishangkeshu) {
		this.shijishangkeshu = shijishangkeshu;
	}
	
	/**
	 * 获取：实际上课数
	 */
	public String getShijishangkeshu() {
		return shijishangkeshu;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
