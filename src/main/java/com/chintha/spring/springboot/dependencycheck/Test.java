package com.chintha.spring.springboot.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chintha/spring/springboot/dependencycheck/config.xml");

		Prescription Prescription = (Prescription) ctx.getBean("Prescription");
		System.out.println(Prescription);
	

	}

}
