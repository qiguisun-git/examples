package com.examples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试父类 SpringBoot是1.4.0之前的话，所用的注解稍有不同。 你需要把@SpringBootTest注解换成@SpringApplicationConfiguration和@WebAppConfiguration
 * 。 另外：@RunWith和@SprintBootTest这两个注解上都有@Inherited这个注解，所以我们可以定义一个单元测的父类，
 * 然后所有的单元测试类继承这个父类就行了
 * 
 * 注意：测试类必须加上“abstract” 或者 写一个方法（没任何操作），添加@Test注解，不然Spring Boot单元测试编译报错 No runnable methods
 * 而继承此父类的子类也也需要做相同处理，且必须是（写一个方法（没任何操作），添加@Test注解）处理。
 * 如果父类处理方式为(写一个方法（没任何操作），添加@Test注解)，则继承的子类不需要任何处理
 * @author sunqigui
 * @version 创建时间 2018年5月24日 下午3:18:59
 * @Title WebApplicationBaseTest.java
 * @Package com.examples
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebApplication.class)
public class WebApplicationBaseTest {
	
	@Test
	public void testSys(){
		
	}
}
