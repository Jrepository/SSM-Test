package indi.ssm.dao;

import indi.ssm.bean.User;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	List<User> selectUser();
	List<User> selectTest(@Param("table")String table);
}
