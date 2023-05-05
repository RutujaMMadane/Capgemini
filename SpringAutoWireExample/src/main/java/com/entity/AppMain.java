package com.entity;



public class AppMain {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TextEditior obj=(TextEditior) context.getBean("textEditor");
		obj.getSpellChecker().checkSpelling();
	}

}
