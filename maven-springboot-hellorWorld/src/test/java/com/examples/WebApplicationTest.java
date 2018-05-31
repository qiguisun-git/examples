package com.examples;

import org.junit.Test;

/**
 * 
 * SpringBoot是1.4.0之前的话，所用的注解稍有不同。
 * 你需要把@SpringBootTest注解换成@SpringApplicationConfiguration和@WebAppConfiguration。
 * 另外：@RunWith和@SprintBootTest这两个注解上都有@Inherited这个注解，所以我们可以定义一个单元测的父类，然后所有的单元测试类继承这个父类就行了
 * 
 * @author sunqigui
 * @version 创建时间 2018年5月24日 下午3:12:38
 * @Title WebApplicationTest.java
 * @Package com.examples
 */
public class WebApplicationTest extends WebApplicationBaseTest{
	
}
