package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.BookTypeDao;
import com.zl.pojo.BookType;
import com.zl.service.BookTypeService;
@Service
public class BookTypeServiceImpl implements BookTypeService {
	@Autowired
	private BookTypeDao bt;
	@Override
	public List<BookType> queryAllBookType() {
		// TODO Auto-generated method stub
		return bt.queryAllBookType();
	}

}
