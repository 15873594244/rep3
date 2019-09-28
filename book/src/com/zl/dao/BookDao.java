package com.zl.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zl.pojo.Book;
import com.zl.pojo.FenYe;
import com.zl.pojo.Query;

public interface BookDao {
	int delBook(int id);
	int updBook(Book book);
	int inBook(Book book);
	Book queryBookById(int id);
	List<Book> queryBookFy(FenYe fenYe);
	int queryBookFyCount(Query query);
	List<Book> queryBookByNameAndMan(@Param("bookName")String a,@Param("bookMan")String b);
}
