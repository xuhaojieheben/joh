package com.base.library;

import java.util.Date;

public class LoginUserModel {
	private int Id;
	private String Account;
	private String RealName;
/*	private  Date CreateDate;*/
	public String getAccount() {
		return Account;
	}
	public void setAccount(String account) {
		Account = account;
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
/*	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}*/
}
