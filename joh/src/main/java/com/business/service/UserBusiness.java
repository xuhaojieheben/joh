package com.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.business.iservice.IUserBusiness;
import com.data.iservice.ISysUserService;
import com.data.sysmodel.Sys_User;

@Service("userBusiness")
public class UserBusiness implements IUserBusiness{
	@Autowired
	private ISysUserService _iSysUserService;
	
	@Override
	public boolean DoUserBusiness(Sys_User user) {
		// TODO 自动生成的方法存根
		boolean res = true;
		_iSysUserService.Add(user);
		//int num = Integer.parseInt("ccc");
		_iSysUserService.Delete(12);
		
		return res;
	}
	
}
