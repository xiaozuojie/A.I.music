package entify;
/*
 * 商品信息的实体类
 * 
 */

import java.util.Date;

public class Goods {
//商品编号
private int GOODS_ID;
//商品名称
private String GOODS_NAME;
//商品类别
private String GOODS_TYPE;
//商品价格
private  double GOODS_PRICE;
//商品库存
private int GOODS_NUMBER;
//商品介绍
private String GOODS_DETAIL;
//商品保质期
private String GOODS_DATE;
//商品生产日期
private String GOODS_TIME;
//商品规格
private int GOODS_SPEC;
//商品状态
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
