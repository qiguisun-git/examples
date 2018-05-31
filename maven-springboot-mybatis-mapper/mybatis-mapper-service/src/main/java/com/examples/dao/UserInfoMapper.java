package com.examples.dao;

import org.apache.ibatis.annotations.Param;

import com.examples.base.mapper.CommonMapper;
import com.examples.po.UserInfo;

public interface UserInfoMapper extends CommonMapper<UserInfo>{
	
	UserInfo findOneByUserId(@Param("userId")String userId);
}
