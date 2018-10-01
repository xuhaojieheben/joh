package com.springMvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.custom.annotation.AllowAnonymous;
import com.custom.annotation.AllowAnonymousType;

@Controller
@RequestMapping("/menu")
@AllowAnonymous(value=AllowAnonymousType.Authorize)
public class MenuController {	
	@RequestMapping("/userManage.do")
	public String UserManage() {
		return "usermanage";
	}
	
	@RequestMapping("/power.do")
	public String Power() {
		return "power";
	}
}