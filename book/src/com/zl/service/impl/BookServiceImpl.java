package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.BookDao;
import com.zl.pojo.Book;
import com.zl.pojo.FenYe;
import com.zl.pojo.Query;
import com.zl.service.BookService;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao b;
	@Override
	public int delBook(int[] listId) {
		int count=0;
		for(int i=0;i<listId.length;i++) {
			if(b.delBook(listId[i])>0) {
				count++;
			}
		}
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public int inBook(Book book) {
		// TODO Auto-generated method stub
		return b.inBook(book);
	}

	@Override
	public int updBook(Book book) {
		// TODO Auto-generated method stub
		return b.updBook(book);
	}

	@Override
	public Book queryBookById(int id) {
		// TODO Auto-generated method stub
		return b.queryBookById(id);
	}

	@Override
	public List<Book> queryBookLikeFy(FenYe fenYe) {
		int count=0;
		if(fenYe.getQuery()!=null) {
			count=b.queryBookFyCount(fenYe.getQuery());
		}else {
			count=b.queryBookFyCount(new Query());
		}
		fenYe.setRowCount(count);
		return b.queryBookFy(fenYe);
	}

	

}
