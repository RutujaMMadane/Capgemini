package com.demo;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloService obj=context.getBean(HelloService.class);
		System.out.println(obj.displayInfo());
		context.close();
	}

}
