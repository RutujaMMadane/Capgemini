package com.bean;


@Configuration
@ComponentScan(basePackages="com.bean")
public class Config { 
	
	
	@Bean(name="employee")
	@Scope("singleton")
	public Employee emp1()
	{
		return new Employee(101,"Mr kk",2400.3f);
		
	}
	@Bean(name="employee2")
	@Scope("prototype")
	public Employee emp2()
	{
		return new Employee(102,"Mr ka",2500.3f);
		
	}

}
