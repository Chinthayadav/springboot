package com.chintha.spring.springboot.lc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	private int ticketnumber;

	public int getTicketnumber() {
		return ticketnumber;
	}

	public void setTicketnumber(int ticketnumber) {
		System.out.println("Inside setter method");
		this.ticketnumber = ticketnumber;
	}
    @PostConstruct
	public void initialize() {
		System.out.println("inside initialize()");
	}
    @PreDestroy
	public void cleanup() {
		System.out.println("inside cleanup()");
	}

	@Override
	public String toString() {
		return "TicketReservation [ticketnumber=" + ticketnumber + "]";
	}

}
