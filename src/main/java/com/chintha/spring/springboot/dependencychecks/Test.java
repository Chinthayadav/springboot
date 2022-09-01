package com.chintha.spring.springboot.dependencychecks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chintha/spring/springboot/dependencychecks/config.xml");
		
		University university = (University) ctx.getBean("University");
		System.out.println(university.hashCode());
		
		University university1 = (University) ctx.getBean("University");
		System.out.println(university1.hashCode());
		

	}

}
