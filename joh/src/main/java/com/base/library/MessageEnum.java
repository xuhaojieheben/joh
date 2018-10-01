package com.base.library;

public enum MessageEnum {
	Error_OperationFailed("操作失败!"),
	Error_NameOrPwError("用户名或密码错误!"),
	Success_OperationSuccess ("操作成功!");

	private final String value;
    //构造方法必须是private或者默认
    private MessageEnum(String value) {
        this.value = value;
    }

    public String GetMessage(){
        return value;
    }
}
