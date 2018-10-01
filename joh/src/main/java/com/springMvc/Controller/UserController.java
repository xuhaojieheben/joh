package com.springMvc.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.custom.annotation.AllowAnonymous;
import com.custom.annotation.AllowAnonymousType;
import com.data.iservice.ISysUserService;
import com.data.sysmodel.Sys_User;
import com.param.model.PageParam;

import net.sf.json.JSONObject;



@Controller
@RequestMapping("/user")
@AllowAnonymous(value=AllowAnonymousType.Authorize)
public class UserController {
	@Autowired
	private ISysUserService _iSysUserService;
	
	@RequestMapping("/userList.do")
	@ResponseBody
	public JSONObject UserList(@RequestBody PageParam page, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("currPage", page.getCurrPage());
		map.put("pageSize", page.getPageSize());
		List<Sys_User> list = _iSysUserService.QuerySysUserByPage(map);
		JSONObject jsonObject = new JSONObject();
		//Map<String, Object> _map = new HashMap<String, Object>();
		jsonObject.put("rows", list);
		jsonObject.put("total", list.size());
		return jsonObject;
	}
}