package com.bean;

public class Ability {
	
	private String skill;
	public Ability()
	{
		
	}
	public Ability(String skill) {
		super();
		this.skill = skill;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Ability [skill=" + skill + "]";
	}
	
	
	

}
