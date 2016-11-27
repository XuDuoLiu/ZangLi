package com.entity;

/**
 * 曜类
 * @author Administrator
 *
 */
public class Yao {
	/**
	 * 曜类十三个属性：
	 * 前五个是显示属性，用于对外交流、计算之用
	 * yao属性是该类显示属性中最大的，值为日月金木水火土七曜，曜即为古代和藏历七天一周期的时间计量单位，与星期同步
	 * ke属性是次大的，是将一曜分为60份而得的
	 * fen属性是三大的，为再将刻分为60份而得的
	 * xi属性是次小的，为人的一呼一吸所用时间，是分的6分之1，约4秒
	 * zi属性是最小的，是息的707分之一
	 */
	private Integer yao;
	private Integer ke;
	private Integer fen;
	private Integer xi;
	private Integer zi;
	/**
	 * 中间五个是进制属性，用于各个属性之间的换算，是曜类的 公共常量
	 */
	public static final Integer yaoJinZhi = 7;
	public static final Integer keJinZhi = 60;
	public static final Integer fenJinZhi = 60;
	public static final Integer xiJinZhi = 6;
	public static final Integer ziJinZhi = 707;
	/**
	 * 最后三个是描述属性
	 * 是对前五个显示属性的进一步描述
	 * quanXiShu是指的对该对象的显示数值全部换算成zi所得的数值，当两个对象的值一样是，其quanXiShu也是一样的
	 * wuZi是指的将zi属性用Xiu类的zi属性进制重新运算所得的结果，用于后面和Xiu类的运算中
	 * liuZi是指的计算wuZi后所得的余数，留用
	 */
}
