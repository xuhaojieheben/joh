package com.springMvc.Controller;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.enterprise.inject.Model;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.business.iservice.IUserBusiness;
import com.custom.annotation.AllowAnonymous;
import com.custom.annotation.AllowAnonymousType;
import com.data.iservice.ISysUserService;
import com.param.model.UserParam;

@Controller
@RequestMapping("/index")
@AllowAnonymous(value=AllowAnonymousType.Authorize)
public class IndexController {
	@Autowired
	private IUserBusiness _iUserBusiness;
	
	@RequestMapping("/index.do")
	public void Index(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	}
	
/*	@RequestMapping("/index.do")
	public String Index(){
		return "index";
	}*/
	
	@RequestMapping("/main.do")
	public String Main() {
		return "main";
	}
	
	@RequestMapping("/menu.do")
	public String Menu() {
		return "menu";
	}
}
