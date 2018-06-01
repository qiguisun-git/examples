package com.examples;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.examples.page.PageChange;
import com.examples.page.PageResult;
import com.examples.po.UserInfo;
import com.examples.service.UserInfoServiceImpl;
import com.github.pagehelper.PageHelper;

/**
 * 
 * SpringBoot是1.4.0之前的话，所用的注解稍有不同。 你需要把@SpringBootTest注解换成@SpringApplicationConfiguration和@WebAppConfiguration
 * 。 另外：@RunWith和@SprintBootTest这两个注解上都有@Inherited这个注解，所以我们可以定义一个单元测的父类，
 * 然后所有的单元测试类继承这个父类就行了
 * 
 * Logback是log4j框架的作者开发的新一代日志框架，它效率更高、能够适应诸多的运行环境，同时天然支持SLF4J。
 * 
 * @author sunqigui
 * @version 创建时间 2018年5月24日 下午3:12:38
 * @Title WebApplicationTest.java
 * @Package com.examples
 */
public class WebApplicationTest extends WebApplicationBaseTest {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserInfoServiceImpl userInfoServiceImpl;
	
	@Test
	public void test1() {
		try {
			String userId = "sunleicg0";
			UserInfo findOneByUserId = userInfoServiceImpl.findOneByUserId(userId);
			System.out.println(findOneByUserId.getComId());
			logger.info("======================logger======================");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	@Test
	public void test2(){
		try {
			PageResult<UserInfo> result = new PageResult<UserInfo>();
			PageHelper.startPage(1,15); 
			List<UserInfo> findAll = userInfoServiceImpl.findAll();
			PageChange.pageResult(findAll, result);
			UserInfo userInfo = findAll.get(1);
			System.out.println(userInfo.getUserId());
		} catch (Exception e) {
			e.getStackTrace();
		}
	}


}
