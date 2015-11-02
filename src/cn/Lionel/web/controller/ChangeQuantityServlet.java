package cn.Lionel.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.Lionel.domain.Cart;
import cn.Lionel.service.BusinessService;

public class ChangeQuantityServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String quantity = request.getParameter("quantity");
		Cart cart = (Cart) request.getSession().getAttribute("cart");
		BusinessService service = new BusinessService();
		service.changeQuantity(cart , id , Integer.parseInt(quantity));
		
		request.getRequestDispatcher("/WEB-INF/jsp/listcart.jsp").forward(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
