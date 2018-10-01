package com.data.sysmodel;

import java.util.Date;

import com.base.library.SysBaseModel;

public class Sys_User extends SysBaseModel{
	private int Id;
	private String Account;
	private String Password;
	private String RealName;
	
	public String getAccount() {
		return Account;
	}
	public void setAccount(String account) {
		Account = account;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getRealName() {
		return RealName;
	}
	public void setRealName(String realName) {
		RealName = realName;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
}