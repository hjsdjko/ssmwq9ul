package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 请假信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-04 21:23:55
 */
@TableName("qingjiaxinxi")
public class QingjiaxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QingjiaxinxiEntity() {
		
	}
	
	public QingjiaxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 请假单号
	 */
					
	private String qingjiadanhao;
	
	/**
	 * 请假开始时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date qingjiakaishishijian;
	
	/**
	 * 请假结束时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date qingjiajieshushijian;
	
	/**
	 * 请假理由
	 */
					
	private String qingjialiyou;
	
	/**
	 * 相关凭证
	 */
					
	private String xiangguanpingzheng;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教师工号
	 */
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
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
	 * 设置：请假单号
	 */
	public void setQingjiadanhao(String qingjiadanhao) {
		this.qingjiadanhao = qingjiadanhao;
	}
	/**
	 * 获取：请假单号
	 */
	public String getQingjiadanhao() {
		return qingjiadanhao;
	}
	/**
	 * 设置：请假开始时间
	 */
	public void setQingjiakaishishijian(Date qingjiakaishishijian) {
		this.qingjiakaishishijian = qingjiakaishishijian;
	}
	/**
	 * 获取：请假开始时间
	 */
	public Date getQingjiakaishishijian() {
		return qingjiakaishishijian;
	}
	/**
	 * 设置：请假结束时间
	 */
	public void setQingjiajieshushijian(Date qingjiajieshushijian) {
		this.qingjiajieshushijian = qingjiajieshushijian;
	}
	/**
	 * 获取：请假结束时间
	 */
	public Date getQingjiajieshushijian() {
		return qingjiajieshushijian;
	}
	/**
	 * 设置：请假理由
	 */
	public void setQingjialiyou(String qingjialiyou) {
		this.qingjialiyou = qingjialiyou;
	}
	/**
	 * 获取：请假理由
	 */
	public String getQingjialiyou() {
		return qingjialiyou;
	}
	/**
	 * 设置：相关凭证
	 */
	public void setXiangguanpingzheng(String xiangguanpingzheng) {
		this.xiangguanpingzheng = xiangguanpingzheng;
	}
	/**
	 * 获取：相关凭证
	 */
	public String getXiangguanpingzheng() {
		return xiangguanpingzheng;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
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
