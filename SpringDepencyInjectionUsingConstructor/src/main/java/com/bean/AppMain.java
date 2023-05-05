package com.bean;


public class AppMain {

	public static void main(String[] args) {
	
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContent.xml");
		Student s=(Student) context.getBean("student");
		System.out.println(s.getName());
		System.out.println(s.getAdd().getAddress());
	}

}
