package cn.Lionel.service;

import java.util.Map;

import cn.Lionel.dao.BookDao;
import cn.Lionel.domain.Book;

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
	
}
