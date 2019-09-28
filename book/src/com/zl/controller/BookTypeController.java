package com.zl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.service.BookTypeService;

@Controller
@RequestMapping("/bookType")
public class BookTypeController {
	@Autowired
	private BookTypeService bts;
	@RequestMapping("/allBookType")
	@ResponseBody
	public Object queryBookType() {
		return bts.queryAllBookType();
	}
}
