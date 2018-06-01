package com.examples;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application的启动注解@SpringBootApplication
 * 
 * @SpringBootApplication = (默认属性)@Configuration + @EnableAutoConfiguration + @ComponentScan。
 * 	@Configuration：表示将该类作用springboot配置文件类。
 * 	@EnableAutoConfiguration:表示程序启动时，自动加载springboot默认的配置。
 * 	@ComponentScan:表示程序启动是，自动扫描当前包及子包下所有类。
 * 
 * @MapperScan:可以指定要扫描的Mapper类的包的路径,指定路径的Mapper接口类可以不要求加@Mapper，否则必须在Mapper接口类直接在Mapper类上面添加注解@Mapper
 * 
 * 我们在开发中可能会有这样的情景。需要在容器启动的时候执行一些内容。比如读取配置文件，数据库连接之类的。
 * SpringBoot给我们提供了两个接口来帮助我们实现这种需求。这两个接口分别为CommandLineRunner和ApplicationRunner。
 * 他们的执行时机为容器启动完成的时候。
 * 
 * 这两个接口中有一个run方法，我们只需要实现这个方法即可。
 * 这两个接口的不同之处在于：ApplicationRunner中run方法的参数为ApplicationArguments，
 * 而CommandLineRunner接口中run方法的参数为String数组。下面我写两个简单的例子，来看一下这两个接口的实现。
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.examples.dao"})
public class WebApplication implements CommandLineRunner{

	public static void main( String[] args ){
    	SpringApplication.run(WebApplication.class, args);
    }

	/**
	 * 容器启动完成的时候执行此方法
	 */
	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("User");
	}
}
