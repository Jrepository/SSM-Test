package indi.ssm.dao;

import indi.ssm.bean.User;

import java.util.List;

public interface UserMapper {
	List<User> selectUser();
}
