package com.examples;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.examples.dao.UserInfoMapper;
import com.examples.po.UserInfo;
import com.examples.service.UserInfoServiceImpl;


/**
 * 
 * SpringBoot是1.4.0之前的话，所用的注解稍有不同。 你需要把@SpringBootTest注解换成@SpringApplicationConfiguration和@WebAppConfiguration
 * 。 另外：@RunWith和@SprintBootTest这两个注解上都有@Inherited这个注解，所以我们可以定义一个单元测的父类，
 * 然后所有的单元测试类继承这个父类就行了
 * 
 * 注意：测试了必须加上“abstract”不然Spring Boot单元测试编译报错 No runnable methods
 * 
 * @author sunqigui
 * @version 创建时间 2018年5月24日 下午3:12:38
 * @Title WebApplicationTest.java
 * @Package com.examples
 */
public class WebApplicationTest extends WebApplicationBaseTest {

	@Autowired
	private UserInfoServiceImpl userInfoServiceImpl;
	
	@Test
	public void test1() {
		try {
			String userId = "sunleicg0";
			UserInfo findOneByUserId = userInfoServiceImpl.findOneByUserId(userId);
			System.out.println(findOneByUserId.getComId());
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	
	@Test
	public void test2(){
		try {
			UserInfo queryUserInfo = new UserInfo();
			queryUserInfo.setUserId("sunleicg0");
			UserInfo selectOne = userInfoServiceImpl.findOne(queryUserInfo);
			System.out.println("++++++++++++++++++++");
			System.out.println(selectOne.getSid()+"++++++++++++++++++++");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test3(){
		try {
			UserInfo queryUserInfo = new UserInfo();
			queryUserInfo.setSid("a96a761d-6b78-4286-b8ba-3bc58665c424");
			queryUserInfo.setLastUpdateTime(new Date());
			int updateByPrimaryKey = userInfoServiceImpl.updateByPrimaryKeySelective(queryUserInfo);
			System.out.println(updateByPrimaryKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
