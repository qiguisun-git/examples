package com.examples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examples.dao.UserInfoMapper;
import com.examples.po.UserInfo;

@Service
@Transactional(readOnly=false)
public class UserInfoServiceImpl {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public UserInfo findOneByUserId(String userId){
		return userInfoMapper.findOneByUserId(userId);
	}
	
	public List<UserInfo> findAll(){
		return userInfoMapper.findAll();
	}
}
