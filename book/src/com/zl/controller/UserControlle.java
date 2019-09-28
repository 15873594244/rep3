package com.zl.controller;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.zl.pojo.Tuser;
import com.zl.service.TuserService;

@RequestMapping("/user")
//把request中数据同步到session中
//@SessionAttributes("username")
@Controller
public class UserControlle {
	@Autowired
	private TuserService userService;
	
	@RequestMapping("/logoin")
	public ModelAndView logoin(Tuser user,HttpServletRequest req,HttpServletResponse rep) {
		ModelAndView v=new ModelAndView();
			if(req.getSession().getAttribute("user")==null) {
				if(user.getUsername()!=null) {
					user=userService.logoin(user);
					if(user==null) {
						v.addObject("error","用户名或密码错误");
						v.setViewName("/logoin");
						return v;
					}
					//System.out.println(user);
					req.getSession().setAttribute("username", user.getUsername());
					req.getSession().setAttribute("user", user);
					Cookie userC=null;
					try {
						userC = new Cookie("username",URLDecoder.decode(user.getUsername(),"utf-8"));
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Cookie pwdC=new Cookie("pwd",user.getPwd());
					
					userC.setPath(req.getContextPath());
					pwdC.setPath(req.getContextPath());
					userC.setMaxAge(60*60*24*10);
					pwdC.setMaxAge(60*60*24*10);
					rep.addCookie(userC);
					rep.addCookie(pwdC);
					v.setViewName("redirect:/books");
				}else {
					v.setViewName("/logoin");
					Cookie[] cookies=req.getCookies();
					if(cookies!=null) {
						for(int i=0;i<cookies.length;i++) {
							if(cookies[i].getName().equals("username")) {
								try {
									v.addObject("username",URLEncoder.encode(cookies[i].getValue(),"utf-8"));
								} catch (UnsupportedEncodingException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							if(cookies[i].getName().equals("pwd")) {
								v.addObject("pwd",cookies[i].getValue());
							}
						}
					}
					
				}
		}else {
			v.setViewName("redirect:/books");
		}
		return v;
	}

	
	
	
	

	

}
