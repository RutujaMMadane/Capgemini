package com.bean;

public class AppMain {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Question q=(Question) factory.getBean("q");
		q.displayInfo();
		
	}

}
