package com.zl.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.util.VerCodeUtil;

@Controller
@RequestMapping("/verCode")
public class VerCodeController {
	@RequestMapping("/img.do")
	public void getVerCodeImg(HttpServletResponse resp,HttpSession session) {
			System.out.println("img.....");
			VerCodeUtil vc=new VerCodeUtil();
		 	BufferedImage image = vc.getImage();
	        String text = vc.getText();
	        session.setAttribute("verCode",text);
	        try {
				vc.output(image,resp.getOutputStream());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}
	@RequestMapping("/code.do")
	@ResponseBody
	public Map<String,Object>getVerCode(HttpServletResponse resp,HttpSession session) {
			Map<String,Object>map=new HashMap<String,Object>();
	        String code=(String)session.getAttribute("verCode");
	        map.put("code", code);
	        map.put("success",true);
	      return map;
	}
}
