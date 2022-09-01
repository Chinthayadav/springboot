package com.chintha.spring.springboot.lc.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chintha.spring.springboot.lc.annotations.Patient;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chintha/spring/springboot/lc/annotation/config.xml");

		TicketReservation ticketreservation = (TicketReservation) ctx.getBean("TicketReservation");
		System.out.println(ticketreservation);
		ctx.registerShutdownHook();

	}

}
