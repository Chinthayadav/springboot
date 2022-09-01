package com.chintha.spring.springboot.ambiguityproblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chintha/spring/springboot/ambiguityproblem/config.xml");
		Addition addition = (Addition) ctx.getBean("Addition");
		System.out.println(addition);

	}

}
