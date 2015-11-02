package cn.Lionel.service;

import java.util.Map;

import cn.Lionel.dao.BookDao;
import cn.Lionel.domain.Book;
import cn.Lionel.domain.Cart;
import cn.Lionel.domain.CartItem;

public class BusinessService {

	private BookDao dao = new BookDao();
	
	public Map<String , Book> getAll()
	{
		return dao.getAll();
	}
	
	public Book findBook(String id)
	{
		return dao.find(id);
	}
	
	public void deleteCartItem(Cart cart , String id)
	{
		cart.getMap().remove(id);
	}
	
	public void clearAll(Cart cart)
	{
		cart.getMap().clear();
	}
	public void changeQuantity(Cart cart , String id , int quantity)
	{
		
		CartItem item = cart.getMap().get(id);
		item.setQuantity(quantity);
	}
}
