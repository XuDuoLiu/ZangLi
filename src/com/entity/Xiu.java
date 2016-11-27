package com.entity;


/**
 * 宿类
 * @author Administrator
 *
 */
public class Xiu {
	/**
	 * 宿类有十一个属性：
	 * 前五个死显示属性，用于对外交流、计算
	 * xiu属性是该类的显示属性中最大的，值为27宿，是将周天分为27份
	 * ke属性是次大的，是宿的60分之一
	 * fen属性是三大的，是刻的60分之一
	 * xi属性是次小的，是分的6分之一
	 * zi输出是最小的，是息的67分之一
	 */
	private Integer xiu;
	private Integer ke;
	private Integer fen;
	private Integer xi;
	private Integer zi;
	/**
	 * 中间是五个进制属性，用于进行各单位之间的换算，是宿类中的公共常量
	 */
	public static final Integer xiuJinZhi = 27;
	public static final Integer keJinZHi = 60;
	public static final Integer fenJinZhi = 60;
	public static final Integer xiJinZhi = 6;
	public static final Integer ziJinZhi = 67;
	/**
	 * 最后一个是描述属性
	 * quanXiShu是将宿类所有的数值换算全部换算为zi属性之后的数值，当其值相同时全息数也相同
	 */
	private Integer quanXiShu;
	
	public Xiu(Integer xiu, Integer ke, Integer fen, Integer xi, Integer zi) {
		super();
		setXiu(xiu);
		setKe(ke);
		setFen(fen);
		setXi(xi);
		setZi(zi);
		setQuanXiShu();
	}

	public Integer getXiu() {
		return xiu;
	}

	public void setXiu(Integer xiu) {
		if (xiu < xiuJinZhi && xiu >= 0) {
			this.xiu = xiu;
		}
	}

	public Integer getKe() {
		return ke;
	}

	public void setKe(Integer ke) {
		if (ke < keJinZHi && ke >= 0) {
			this.ke = ke;
		}
	}

	public Integer getFen() {
		return fen;
	}

	public void setFen(Integer fen) {
		if (fen < fenJinZhi && fen >= 0) {
			this.fen = fen;
		}
	}

	public Integer getXi() {
		return xi;
	}

	public void setXi(Integer xi) {
		if (xi < xiJinZhi && xi >= 0) {
			this.xi = xi;
		}
	}

	public Integer getZi() {
		return zi;
	}

	public void setZi(Integer zi) {
		if (zi < ziJinZhi && zi >= 0) {
			this.zi = zi;
		}
	}

	public Integer getQuanXiShu() {
		return quanXiShu;
	}

	private void setQuanXiShu() {
		quanXiShu = xiu;
		quanXiShu *= keJinZHi;
		quanXiShu += ke;
		quanXiShu *= fenJinZhi;
		quanXiShu += fen;
		quanXiShu *= xiJinZhi;
		quanXiShu += xi;
		quanXiShu *= ziJinZhi;
		quanXiShu += zi;
	}
	
	/**
	 * 一个用于计算后的调整工作的方法
	 */
	private void adjust(){
		xi += (zi / ziJinZhi);
		zi %= ziJinZhi;
		fen += (xi / xiJinZhi);
		xi %= xiJinZhi;
		ke += (fen / fenJinZhi);
		fen %= fenJinZhi;
		xiu += (ke / keJinZHi);
		ke %= keJinZHi;
		xiu %= xiuJinZhi;
		setQuanXiShu();
	}
	
	/**
	 * 加法运算
	 */
	public void add(Xiu x){
		this.xiu += x.getXiu();
		this.ke += x.getKe();
		this.fen += x.getFen();
		this.xi += x.getXi();
		this.zi += x.getZi();
		adjust();
	}
	
	/**
	 * 减法运算
	 */
	public void mul(Xiu x){
		
	}
}
