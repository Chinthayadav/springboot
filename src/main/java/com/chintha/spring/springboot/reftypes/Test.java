package com.chintha.spring.springboot.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chintha/spring/springboot/reftypes/Reftypes.xml");
		
		Student student = (Student) ctx.getBean("Student");
		System.out.println("Student scores:" +student);

	}

}
