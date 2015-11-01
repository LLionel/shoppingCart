package cn.Lionel.domain;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {

	private Map<String , CartItem> map = new LinkedHashMap<String, CartItem>();
	private double price;
	
	public Map<String, CartItem> getMap() {
		return map;
	}
	public void setMap(Map<String, CartItem> map) {
		this.map = map;
	}
	public double getPrice() {
		double total = 0.0;
		for(Map.Entry<String, CartItem> entry:map.entrySet())
		{
			total += entry.getValue().getPrice();
		}
		this.price = total ;
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void add(Book book)
	{
		//查询购物车里有没有这本书
		CartItem item = map.get(book.getId());
		if(item == null)
		{
			item = new CartItem();
			item.setBook(book);
			item.setQuanlity(1);
//			item.setPrice(item.getQuanlity()*book.getPrice());
			map.put(book.getId(), item);
		}
		else
		{
			item.setQuanlity(item.getQuanlity()+1);
//			item.setPrice(price+book.getPrice());
		}
	}
	
}
