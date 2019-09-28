package com.zl.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zl.pojo.Book;
import com.zl.pojo.FenYe;
import com.zl.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bs;
	@RequestMapping("/inBook")
	public String inBook(Book book,Map<String,Object>map) {
		if(bs.inBook(book)>0) {
			return "redirect:/books";
		}
		return "/error?error=添加失败";
	}
	@RequestMapping("/delBook")
	public String delBook(int []listId) {
		if(bs.delBook(listId)==listId.length) {
			return "redirect:/books";
		}
		return "/error?error=删除失败";
	}
	@RequestMapping("/updBookToJsp")
	public String updBookJsp(Book book,Map<String,Object>map) {
		book=bs.queryBookById(book.getId());
		map.put("book", book);
		return "/bookjsp/updBook";
	}
	@RequestMapping("/updBook")
	public String updBook(Book book,Map<String,Object>map) {
		if(bs.updBook(book)>0) {
			return "redirect:/books";
		}
		return "/error?error=修改失败";
	}
	@RequestMapping("/books")
	public String queryBooks(FenYe fenYe,Map<String,Object>map) {
		List<Book> books=bs.queryBookLikeFy(fenYe);
		map.put("listBook", books);
		return "/bookjsp/books";
	}
}
