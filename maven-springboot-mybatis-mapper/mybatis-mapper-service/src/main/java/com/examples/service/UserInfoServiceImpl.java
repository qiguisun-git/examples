package com.examples.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examples.base.service.BaseService;
import com.examples.dao.UserInfoMapper;
import com.examples.po.UserInfo;

@Service
@Transactional(readOnly = false)
public class UserInfoServiceImpl extends BaseService<UserInfo>{
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public UserInfo findOneByUserId(String userId){
		return userInfoMapper.findOneByUserId(userId);
	}

}
