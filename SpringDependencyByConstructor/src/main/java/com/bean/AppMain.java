package com.bean;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Developer developer=(Developer) context.getBean("developer");
		System.out.println(developer.getLanguage());
		System.out.println(developer.getLanguage().getName());
		System.out.println(developer.getLanguage().getLanguageType());


	}

}
