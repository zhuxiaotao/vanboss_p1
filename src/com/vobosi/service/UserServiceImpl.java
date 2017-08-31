package com.vobosi.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.vobosi.Interface.UserService;
import com.vobosi.dao.user.userDao;
import com.vobosi.pojo.user.user;
import com.vobosi.pojo.user.userQuery;
import com.vobosi.pojo.user.userQuery.Criteria;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private userDao userDao;

	// 录入用户
	public boolean userRegister(String userName, String passWord, String email) {
		try {
			user user = new user();
			// 格式化时间
			String stime = new SimpleDateFormat("yyMMddHHmm").format(new Date());
			String substring = stime.substring(0, stime.length());
			int time = Integer.parseInt(substring);
			// 注册录入实体类
			user.setCreattime(time);
			user.setUid(UUID.randomUUID().toString().replace("-", ""));
			user.setUsername(userName);
			user.setPassword(passWord);
			user.setEamil(email);
			user.setLevel(1);
			user.setMony(0);
			user.setRemarks("null");
			// 保存用户
			userDao.insertSelective(user);
			// 返回
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// 用户名重复检查
	public Integer userNameCheck(user u) {
		// 创建user的查询对象并设置条件
		userQuery userQuery = new userQuery();
		Criteria createCriteria = userQuery.createCriteria();
		createCriteria.andUsernameEqualTo(u.getUsername());
		// 查询表中是否有同名用户并返回
		int countByExample = userDao.countByExample(userQuery);
		return countByExample;
	}

	// 用户名重复检查
	public user userFind(String username) {
		// 创建user的查询对象并设置条件
		userQuery userQuery = new userQuery();
		Criteria createCriteria = userQuery.createCriteria();
		createCriteria.andUsernameEqualTo(username);
		// 查询表中是否有同名用户并返回
		List<user> selectByExample = userDao.selectByExample(userQuery);
		if(selectByExample.size()==1){
			return selectByExample.get(0);
		}
		return null;
	}
}
