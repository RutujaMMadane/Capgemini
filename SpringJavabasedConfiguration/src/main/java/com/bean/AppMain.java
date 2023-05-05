package com.bean;

public class AppMain {

	public static void main(String[] args) {
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		System.out.println(context.getBean("employee1"));
		System.out.println(context.getBean("employee2"));
		
	}

}
