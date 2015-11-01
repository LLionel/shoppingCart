package cn.Lionel.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.Lionel.domain.Book;
import cn.Lionel.domain.Cart;
import cn.Lionel.service.BusinessService;

public class BuyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		BusinessService bs = new BusinessService();
		//找到这本书
		Book book = bs.findBook(id);
		Cart cart = (Cart) request.getSession().getAttribute("cart");
		
		if(cart == null)
		{
			cart = new Cart();
			request.getSession().setAttribute("cart", cart);
		}
		//添加这本书到购物车
		cart.add(book);
//		request.getSession().setAttribute("cart", cart);
		request.getRequestDispatcher("/WEB-INF/jsp/listcart.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}