package com.data.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.batis.idao.ISysUserMapper;
import com.data.iservice.ISysUserService;
import com.data.sysmodel.Sys_User;
@Repository("sysUserService")
public class SysUserService implements ISysUserService{
	@Autowired
	private ISysUserMapper _iSysUserMapper;
	
	
	public int Add(Sys_User t) {
		// TODO 自动生成的方法存根
		return _iSysUserMapper.Add(t);
	}

	
	public int Modify(Sys_User t) {
		// TODO 自动生成的方法存根
		return _iSysUserMapper.Modify(t);
	}

	
	public int Del(Sys_User t) {
		// TODO 自动生成的方法存根
		return _iSysUserMapper.Del(t);
	}

	
	public int Delete(int Id) {
		// TODO 自动生成的方法存根
		return _iSysUserMapper.Delete(Id);
	}

	
	public List<?> Select(Sys_User t) {
		// TODO 自动生成的方法存根
		return _iSysUserMapper.Select(t);
	}

	
	public List<Sys_User> ValidateUser(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return _iSysUserMapper.ValidateUser(map);
	}

	
	public List<Sys_User> QuerySysUserByPage(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return _iSysUserMapper.QuerySysUserByPage(map);
	}
	
}
