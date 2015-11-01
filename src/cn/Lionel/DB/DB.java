package cn.Lionel.DB;

import java.util.LinkedHashMap;
import java.util.Map;

import cn.Lionel.domain.Book;

public class DB {
	
	private static Map<String , Book> map = new LinkedHashMap();
	
	static{
		map.put("1",new Book("1","Spring","刘",12.3,"不错哦"));
		map.put("2",new Book("2","Struct" , "方" , 53.32,"还行"));
		map.put("3",new Book("3","C++" , "张" , 35.26 , "凑合"));
		map.put("4",new Book("4" , "hibernet","李" , 42.212 , "值得看"));
		map.put("5",new Book("5","java","叶",25.32,"垃圾"));
	}

	public static Map<String , Book>getAll()
	{
		return map;
	}
	
	
}
