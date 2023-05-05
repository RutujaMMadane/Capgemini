package com.bean;


public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		A a=(A) context.getBean("a");
		a.msg();

	}

}
