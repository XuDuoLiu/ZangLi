package com.entity;


/**
 * ����
 * @author Administrator
 *
 */
public class Xiu {
	/**
	 * ������ʮһ�����ԣ�
	 * ǰ�������ʾ���ԣ����ڶ��⽻��������
	 * xiu�����Ǹ������ʾ���������ģ�ֵΪ27�ޣ��ǽ������Ϊ27��
	 * ke�����Ǵδ�ģ����޵�60��֮һ
	 * fen����������ģ��ǿ̵�60��֮һ
	 * xi�����Ǵ�С�ģ��Ƿֵ�6��֮һ
	 * zi�������С�ģ���Ϣ��67��֮һ
	 */
	private Integer xiu;
	private Integer ke;
	private Integer fen;
	private Integer xi;
	private Integer zi;
	/**
	 * �м�������������ԣ����ڽ��и���λ֮��Ļ��㣬�������еĹ�������
	 */
	public static final Integer xiuJinZhi = 27;
	public static final Integer keJinZHi = 60;
	public static final Integer fenJinZhi = 60;
	public static final Integer xiJinZhi = 6;
	public static final Integer ziJinZhi = 67;
	/**
	 * ���һ������������
	 * quanXiShu�ǽ��������е���ֵ����ȫ������Ϊzi����֮�����ֵ������ֵ��ͬʱȫϢ��Ҳ��ͬ
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
	 * һ�����ڼ����ĵ��������ķ���
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
	 * �ӷ�����
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
	 * ��������
	 */
	public void mul(Xiu x){
		
	}
}
