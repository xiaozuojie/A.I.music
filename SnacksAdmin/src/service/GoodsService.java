package service;

import util.PageData;
import entify.Goods;

import java.util.List;
import dao.GoodsDao;

public class GoodsService {
GoodsDao gd =new GoodsDao();

public List<Goods> getGoods() {
	
	return (List<Goods>)gd.getGoods();
}
public void deletegoods(int goodsid){
	gd.deletegoods(goodsid);
}
public void changegoodsstatus(int goodsid,String goodsstatus) {
	gd.changegoodsstatus(goodsid, goodsstatus);
}
public void addgoods(Goods g) {
	gd.addgoods(g);

}
}
