package dao;

import util.BaseDao;
import util.PageData;

import java.util.List;
import entify.Goods;

public class GoodsDao {
	public List<Goods> getGoods() {
		String sql = "select * from SNACKS_GOODS";
		return (List<Goods>) BaseDao.select(sql, Goods.class);
	}
	public void deletegoods(int goodsid) {
		String sql="delete from SNACKS_GOODS where GOODS_ID = ?";
		BaseDao.execute(sql, goodsid);
	}
	public void changegoodsstatus(int goodsid,String goodsstatus) {
		String sql="update SNACKS_GOODS set GOODS_STATUS = ? where GOODS_ID = ?";
		BaseDao.execute(sql, goodsstatus,goodsid);
	}
	public void addgoods(Goods g) {
		String sql="insert into SNACKS_GOODS (GOODS_ID, GOODS_NAME, GOODS_TYPE, GOODS_PRICE, GOODS_NUMBER, GOODS_DETAIL, GOODS_DATE, GOODS_TIME, GOODS_SPEC, GOODS_STATUS) VALUES (?,?,?,?,?,?,to_date(?,'YYYY-MM-DD HH24:MI:SS'),to_date(?,'YYYY-MM-DD HH24:MI:SS'),?,?)" ;
BaseDao.execute(sql, g.getGOODS_ID(),g.getGOODS_NAME(),g.getGOODS_TYPE(),g.getGOODS_PRICE(),g.getGOODS_NUMBER(),g.getGOODS_DETAIL(),g.getGOODS_DATE(),g.getGOODS_TIME(),g.getGOODS_SPEC(),g.getGOODS_STATUS());	
	}
}
