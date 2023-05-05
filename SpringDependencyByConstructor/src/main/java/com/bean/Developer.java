package com.bean;

public class Developer {
	
	private Language language;
	public Developer()
	{
		
	}
	public Developer(Language language) 
	{
		super();
		this.language = language;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Developer [language=" + language + "]";
	}
	
	

}
