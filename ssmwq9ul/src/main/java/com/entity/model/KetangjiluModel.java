package com.entity.model;

import com.entity.KetangjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 课堂记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-04 21:23:55
 */
public class KetangjiluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
