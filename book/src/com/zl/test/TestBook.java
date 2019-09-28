package com.zl.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.zl.dao.BookDao;

public class TestBook {

	public static void main(String[] args) {
		ApplicationContext app=new  ClassPathXmlApplicationContext("classpath:spring_ioc.xml");
		BookDao bookDao=app.getBean(BookDao.class);
		Map map=new HashMap();
		map.put("bookName", "springboot");
		map.put("bookMan", "明明");
		System.out.println(bookDao.queryBookByNameAndMan("springboot","明明"));
	}

}
