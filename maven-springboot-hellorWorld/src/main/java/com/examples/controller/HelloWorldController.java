package com.examples.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * maven-springBoot-helloWorld
 * 访问地址：http://localhost:7002/hello
 * @author sunqigui
 * @version 创建时间 2018年5月24日 下午4:37:54
 * @Title HelloWorldController.java
 * @Package com.examples.controller
 * 注意：SpringMVC的运行方式是将打成的war包放到tomcat中运行，这种情况下访问需要在url中加入项目名。
 * SpringBoot同样可以打成war包部署，但也提供了另一种方式：直接执行public static void main()函数
 * 并启动一个内嵌的应用服务器（取决于类路径上的依赖是Tomcat还是jetty）来处理应用请求，这时是不需要添加项目名的。
 */
@RestController
public class HelloWorldController {
	
	@ResponseBody
	@RequestMapping(value="/hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String index() {
		System.out.println();
        return "Hello World";
    }
}
