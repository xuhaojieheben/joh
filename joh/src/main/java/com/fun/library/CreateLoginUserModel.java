package com.fun.library;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.aspectj.weaver.ast.Var;

import com.base.library.LoginUserModel;
import com.base.library.SysBaseModel;

/**
 * @author john
 *只要继承sysbasemodel的系统表类都可传入最后将验证是否有效的可被使用的LoginUserModel
 *(验证方式是否存在主要关键字段Id,Account,RealName)最终返回LoginUserModel
 */
public class CreateLoginUserModel {
	public static LoginUserModel Bind(SysBaseModel m) throws NumberFormatException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException, ClassNotFoundException {
		Class<? extends SysBaseModel> obj = m.getClass();
		Field[] fields = obj.getDeclaredFields();
		LoginUserModel _userModel = new LoginUserModel();
		//Field[] loginUserFields = LoginUserModel.class.getFields();
		Field[] loginUserFields = _userModel.getClass().getDeclaredFields();
		for(Field luf : loginUserFields) {
			luf.setAccessible(true);
			String key = luf.getName();
			//String type = luf.getGenericType().toString();
		    for (Field field : fields) {
		    	if(key == field.getName()) {
		    		field.setAccessible(true);
		    		Method setMethod = LoginUserModel.class.getMethod("set" + key, luf.getType());
		    		setMethod.invoke(_userModel, field.get(m));
		    	}
		    }
		}
		return _userModel;
	}
}
