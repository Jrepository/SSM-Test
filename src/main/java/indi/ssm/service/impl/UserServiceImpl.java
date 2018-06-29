package indi.ssm.service.impl;

import indi.ssm.bean.User;
import indi.ssm.dao.UserMapper;
import indi.ssm.service.UserService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;
	
	@Override
	public List<User> selectUser() {
		return userMapper.selectUser();
	}

	@Override
	public List<User> selectTest(String table) {
		return userMapper.selectTest(table);
	}
}
