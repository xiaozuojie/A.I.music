package entify;
/*
 * ��Ʒ��Ϣ��ʵ����
 * 
 */

import java.util.Date;

public class Goods {
//��Ʒ���
private int GOODS_ID;
//��Ʒ����
private String GOODS_NAME;
//��Ʒ���
private String GOODS_TYPE;
//��Ʒ�۸�
private  double GOODS_PRICE;
//��Ʒ���
private int GOODS_NUMBER;
//��Ʒ����
private String GOODS_DETAIL;
//��Ʒ������
private String GOODS_DATE;
//��Ʒ��������
private String GOODS_TIME;
//��Ʒ���
private int GOODS_SPEC;
//��Ʒ״̬
private String GOODS_STATUS;
public int getGOODS_ID() {
	return GOODS_ID;
}
public void setGOODS_ID(int gOODS_ID) {
	GOODS_ID = gOODS_ID;
}
public String getGOODS_NAME() {
	return GOODS_NAME;
}
public void setGOODS_NAME(String gOODS_NAME) {
	GOODS_NAME = gOODS_NAME;
}
public String getGOODS_TYPE() {
	return GOODS_TYPE;
}
public void setGOODS_TYPE(String gOODS_TYPE) {
	GOODS_TYPE = gOODS_TYPE;
}
public double getGOODS_PRICE() {
	return GOODS_PRICE;
}
public void setGOODS_PRICE(double gOODS_PRICE) {
	GOODS_PRICE = gOODS_PRICE;
}
public int getGOODS_NUMBER() {
	return GOODS_NUMBER;
}
public void setGOODS_NUMBER(int gOODS_NUMBER) {
	GOODS_NUMBER = gOODS_NUMBER;
}
public String getGOODS_DETAIL() {
	return GOODS_DETAIL;
}
public void setGOODS_DETAIL(String gOODS_DETAIL) {
	GOODS_DETAIL = gOODS_DETAIL;
}
public String getGOODS_DATE() {
	return GOODS_DATE;
}
public void setGOODS_DATE(String gOODS_DATE) {
	GOODS_DATE = gOODS_DATE;
}
public String getGOODS_TIME() {
	return GOODS_TIME;
}
public void setGOODS_TIME(String gOODS_TIME) {
	GOODS_TIME = gOODS_TIME;
}
public int getGOODS_SPEC() {
	return GOODS_SPEC;
}
public void setGOODS_SPEC(int gOODS_SPEC) {
	GOODS_SPEC = gOODS_SPEC;
}
public String getGOODS_STATUS() {
	return GOODS_STATUS;
}
public void setGOODS_STATUS(String gOODS_STATUS) {
	GOODS_STATUS = gOODS_STATUS;
}
public Goods(int gOODS_ID, String gOODS_NAME, String gOODS_TYPE, double gOODS_PRICE, int gOODS_NUMBER,
		String gOODS_DETAIL, String gOODS_DATE, String gOODS_TIME, int gOODS_SPEC, String gOODS_STATUS) {
	super();
	GOODS_ID = gOODS_ID;
	GOODS_NAME = gOODS_NAME;
	GOODS_TYPE = gOODS_TYPE;
	GOODS_PRICE = gOODS_PRICE;
	GOODS_NUMBER = gOODS_NUMBER;
	GOODS_DETAIL = gOODS_DETAIL;
	GOODS_DATE = gOODS_DATE;
	GOODS_TIME = gOODS_TIME;
	GOODS_SPEC = gOODS_SPEC;
	GOODS_STATUS = gOODS_STATUS;
}
public Goods() {
	super();
}
@Override
public String toString() {
	return "Goods [GOODS_ID=" + GOODS_ID + ", GOODS_NAME=" + GOODS_NAME + ", GOODS_TYPE=" + GOODS_TYPE
			+ ", GOODS_PRICE=" + GOODS_PRICE + ", GOODS_NUMBER=" + GOODS_NUMBER + ", GOODS_DETAIL=" + GOODS_DETAIL
			+ ", GOODS_DATE=" + GOODS_DATE + ", GOODS_TIME=" + GOODS_TIME + ", GOODS_SPEC=" + GOODS_SPEC
			+ ", GOODS_STATUS=" + GOODS_STATUS + "]";
}


}
