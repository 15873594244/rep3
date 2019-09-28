package com.zl.service;

import java.util.List;

import com.zl.pojo.Book;
import com.zl.pojo.FenYe;
import com.zl.pojo.Query;

public interface BookService {
	int delBook(int []listId);
	int inBook(Book book);
	int updBook(Book book);
	Book queryBookById(int id);
	List<Book> queryBookLikeFy(FenYe fenYe);

}
