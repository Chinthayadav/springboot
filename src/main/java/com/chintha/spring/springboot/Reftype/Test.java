package com.chintha.spring.springboot.Reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

             ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/chintha/spring/springboot/Reftype/Reftype.xml");
             Shippingcart shippingcart = (Shippingcart) context.getBean("Shippingcart");
             System.out.println("shippingcart items = " +shippingcart);

	}

}
