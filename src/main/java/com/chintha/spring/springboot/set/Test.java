package com.chintha.spring.springboot.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext Context = new ClassPathXmlApplicationContext(
				"com/chintha/spring/springboot/set/Setconfig.xml");
		CarDealer cardealer = (CarDealer)Context.getBean("CarDealer");
		System.out.println(cardealer.getName());
		System.out.println(cardealer.getModels());
		
		

	}

}
