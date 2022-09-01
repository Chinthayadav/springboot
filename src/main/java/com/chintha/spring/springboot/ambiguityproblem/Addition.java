package com.chintha.spring.springboot.ambiguityproblem;

public class Addition {

	Addition(int id, double no) {
		System.out.println("Inside the constructer");
		System.out.println(id);
		System.out.println(no);
	}

//	Addition(double id, double no){
//		System.out.println("Inside double");
//	}
//	Addition(int id, int no){
//		System.out.println("Inside int");
//	}
//	Addition(String id, String no){
//		System.out.println("Inside String");
//	}

}
