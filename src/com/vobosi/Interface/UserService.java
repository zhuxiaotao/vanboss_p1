package com.vobosi.Interface;

import com.vobosi.pojo.user.user;

public interface UserService {
	//保存一条用户注册记录
	public boolean userRegister(String userName, String passWord,String email);
	//查找用户名几条记录
	public Integer userNameCheck(user u);
	//根据用户名查找用户对象
	public user userFind(String username);
}
