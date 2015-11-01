package cn.Lionel.dao;

import java.util.Map;

import cn.Lionel.DB.DB;
import cn.Lionel.domain.Book;

public class BookDao {

	public Map<String , Book> getAll()
	{
		return DB.getAll();
	}
	public Book find(String id)
	{
		
		return DB.getAll().get(id);
	}
	
	
	
}
