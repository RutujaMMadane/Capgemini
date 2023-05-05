package com.bean;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Student student=(Student) factory.getBean("studentbean");
		System.out.println(student.displayInfo());
		

	}

}
