package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.PageData;
import entify.Goods;
import service.GoodsService;

import util.MyData;
import com.google.gson.Gson;

/**
 * Servlet implementation class GoodsServlet
 */
@WebServlet("/GoodsServlet")
public class GoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	GoodsService gs =new GoodsService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		if (request.getParameter("op") != null) {
			// 将op的值取出来 判断这个值

			String op = request.getParameter("op");
			if (op.equals("deletegoods")) {
				// 查询所有
				// 调用ArticleService中的那个方法 getAllArticles
				String goodsid =request.getParameter("goodsid");
				gs.deletegoods(Integer.parseInt(goodsid));
	            response.sendRedirect("goods.jsp");
			}
			if (op.equals("deleteAll")) {
				String str=request.getParameter("str");
				String[] arr=str.split(",");
				for (int i = 0; i < arr.length; i++) {
					int goodsid=Integer.valueOf(arr[i]);
					gs.deletegoods(goodsid);
					
				}response.sendRedirect("goods.jsp");
				
			}
			if(op.equals("changestatus")) {
				String goodsid=request.getParameter("GOODS_ID");
				System.out.println(goodsid);
				String goodsstatus=request.getParameter("GOODS_STATUS");
				System.out.println(goodsstatus);
				gs.changegoodsstatus(Integer.parseInt(goodsid), goodsstatus);

			}
			if (op.equals("addgoods")) {
				String goodsid=request.getParameter("GOODS_ID");
				String goodsname=request.getParameter("GOODS_NAME");
				String goodstype=request.getParameter("GOODS_TYPE");
				String goodsprice=request.getParameter("GOODS_PRICE");
				String goodsnumber=request.getParameter("GOODS_NUMBER");
				String goodsdetall=request.getParameter("GOODS_DETALL");
				String goodsdate=request.getParameter("GOODS_DATE");
				String goodstime=request.getParameter("GOODS_TIME");
				String goodsspec=request.getParameter("GOODS_SPEC");
				String goodsstatus=request.getParameter("GOODS_STATUS");
				
				Goods  g =new Goods(Integer.parseInt(goodsid), goodsname, goodstype, Double.parseDouble(goodsprice), Integer.parseInt(goodsnumber), goodsdetall, goodsdate, goodstime, Integer.parseInt(goodsspec), goodsstatus);
				gs.addgoods(g);
			}
			if(op.equals("queryall"))
			{
				List<Goods> list = gs.getGoods();
				
				// Ajax来实现
						// 返回数据最好是json格式 外部的jar包 gson
			   MyData<Goods> md = new MyData<Goods>();
			    md.setData(list);
				Gson gson = new Gson();
				String jsonString = gson.toJson(md);
				// 使用printWriter对象
				

				out.print(jsonString);

				out.close();
			}
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
