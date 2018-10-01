package com.data.iservice;

import java.util.List;
import java.util.Map;

import com.core.dbservice.IDbServiceReposity;
import com.data.sysmodel.Sys_User;

public interface ISysUserService extends IDbServiceReposity<Sys_User> {
	List<Sys_User> ValidateUser(Map<String, Object> map);
	
	List<Sys_User> QuerySysUserByPage(Map<String, Object> map);
}
