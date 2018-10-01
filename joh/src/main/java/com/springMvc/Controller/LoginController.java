package com.springMvc.Controller;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.library.BaseController;
import com.base.library.LoginUserModel;
import com.base.library.MessageEnum;
import com.base.library.SessionEnum;
import com.custom.annotation.AllowAnonymous;
import com.custom.annotation.AllowAnonymousType;
import com.data.iservice.ISysUserService;
import com.data.sysmodel.Sys_User;
import com.fun.library.CreateLoginUserModel;
import com.param.model.UserParam;

import sun.misc.BASE64Encoder;

@Controller
@RequestMapping("/login")
@AllowAnonymous(value=AllowAnonymousType.Allow)
public class LoginController extends BaseController{
	@Autowired
	private ISysUserService _iSysUserService;
	
	@RequestMapping("/login.do")
	public void Login(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.sendRedirect(request.getContextPath()+"/login.jsp");
	}

	@RequestMapping(value="/doLogin.do",method= {RequestMethod.POST})
	@ResponseBody
	public Map<String, Object> UserLogin(@RequestBody UserParam user, HttpSession session) throws Exception {
	   //Map<String, Object> map = new HashMap<String, Object>();
	   MessageDigest md5 = MessageDigest.getInstance("MD5");
	   BASE64Encoder base64en = new BASE64Encoder();
	   //加密后的字符串
	   String newstr = base64en.encode(md5.digest(user.getPassword().getBytes("utf-8")));
	   mapParam = new HashMap<String, Object>();
	   mapParam.put("Account", user.getUserName());
	   mapParam.put("Password", newstr);
	   
	   List<Sys_User> userList = _iSysUserService.ValidateUser(mapParam);
	   if(userList.size() > 0) {
		   LoginUserModel _lUserModel = CreateLoginUserModel.Bind(userList.get(0));
		   session.setAttribute(SessionEnum.USER_SESSION.name(), _lUserModel);
		   return JsonData(_lUserModel);
	   }else {
		   return Failure(MessageEnum.Error_NameOrPwError);
		}
	   //ModelAndView mv = new ModelAndView();
	   //mv.addObject("msg","hello myfirst mvc");
	   //mv.setViewName("login");return "/common/html/index";
	}
}
