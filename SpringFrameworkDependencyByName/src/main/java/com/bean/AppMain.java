package com.bean;

import org.springframework.context.ApplicationContext;

public class AppMain {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer customer=(Customer) context.getBean("customer");
		System.out.println(customer.getAddress());
		System.out.println(customer.getAddress().getFullAddress());


	}

}
