package com.bean;

public class Person {
	private Ability ability;
	public Person()
	{
		
	}
	public Person(Ability ability) {
		super();
		this.ability = ability;
	}
	public Ability getAbility() {
		return ability;
	}
	public void setAbility(Ability ability) {
		this.ability = ability;
	}
	@Override
	public String toString() {
		return "Person [ability=" + ability + "]";
	}
	

}
