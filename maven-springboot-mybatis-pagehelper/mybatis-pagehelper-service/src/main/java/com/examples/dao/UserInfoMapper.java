package com.examples.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.examples.po.UserInfo;

public interface UserInfoMapper {
	
	UserInfo findOneByUserId(@Param("userId")String userId);
	
	List<UserInfo> findAll();
}
