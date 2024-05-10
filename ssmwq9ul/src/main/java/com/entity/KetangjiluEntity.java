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
 * 课堂记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-04 21:23:55
 */
@TableName("ketangjilu")
public class KetangjiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KetangjiluEntity() {
		
	}
	
	public KetangjiluEntity(T t) {
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
	 * 课程编号
	 */
					
	private String kechengbianhao;
	
	/**
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
	/**
	 * 签到时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date qiandaoshijian;
	
	/**
	 * 课堂图片
	 */
					
	private String ketangtupian;
	
	/**
	 * 课堂内容
	 */
					
	private String ketangneirong;
	
	/**
	 * 课后反馈
	 */
					
	private String kehoufankui;
	
	/**
	 * 学生掌握程度
	 */
					
	private String xueshengzhangwochengdu;
	
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
	 * 设置：课程编号
	 */
	public void setKechengbianhao(String kechengbianhao) {
		this.kechengbianhao = kechengbianhao;
	}
	/**
	 * 获取：课程编号
	 */
	public String getKechengbianhao() {
		return kechengbianhao;
	}
	/**
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
	/**
	 * 设置：签到时间
	 */
	public void setQiandaoshijian(Date qiandaoshijian) {
		this.qiandaoshijian = qiandaoshijian;
	}
	/**
	 * 获取：签到时间
	 */
	public Date getQiandaoshijian() {
		return qiandaoshijian;
	}
	/**
	 * 设置：课堂图片
	 */
	public void setKetangtupian(String ketangtupian) {
		this.ketangtupian = ketangtupian;
	}
	/**
	 * 获取：课堂图片
	 */
	public String getKetangtupian() {
		return ketangtupian;
	}
	/**
	 * 设置：课堂内容
	 */
	public void setKetangneirong(String ketangneirong) {
		this.ketangneirong = ketangneirong;
	}
	/**
	 * 获取：课堂内容
	 */
	public String getKetangneirong() {
		return ketangneirong;
	}
	/**
	 * 设置：课后反馈
	 */
	public void setKehoufankui(String kehoufankui) {
		this.kehoufankui = kehoufankui;
	}
	/**
	 * 获取：课后反馈
	 */
	public String getKehoufankui() {
		return kehoufankui;
	}
	/**
	 * 设置：学生掌握程度
	 */
	public void setXueshengzhangwochengdu(String xueshengzhangwochengdu) {
		this.xueshengzhangwochengdu = xueshengzhangwochengdu;
	}
	/**
	 * 获取：学生掌握程度
	 */
	public String getXueshengzhangwochengdu() {
		return xueshengzhangwochengdu;
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
