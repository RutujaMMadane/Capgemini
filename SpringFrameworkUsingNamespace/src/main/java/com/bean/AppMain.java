package com.bean;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContent.xml");
		Employee emp=(Employee) context.getBean("emp");
		System.out.println(emp);
	}

}

