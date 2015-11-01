package cn.Lionel.DB;

import java.util.LinkedHashMap;
import java.util.Map;

import cn.Lionel.domain.Book;

public class DB {
	
	private static Map<String , Book> map = new LinkedHashMap();
	
	static{
		map.put("1",new Book("1","Spring","��",12.3,"����Ŷ"));
		map.put("2",new Book("2","Struct" , "��" , 53.32,"����"));
		map.put("3",new Book("3","C++" , "��" , 35.26 , "�պ�"));
		map.put("4",new Book("4" , "hibernet","��" , 42.212 , "ֵ�ÿ�"));
		map.put("5",new Book("5","java","Ҷ",25.32,"����"));
	}

	public static Map<String , Book>getAll()
	{
		return map;
	}
	
	
}
