package com.chintha.spring.springboot.lc.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chintha/spring/springboot/lc/annotations/config.xml");

		Patient patient = (Patient) ctx.getBean("Patient");
		System.out.println(patient);
		ctx.registerShutdownHook();

	}

}
