package com.bean;

public class Language {
	
	private String name;
	private String languageType;
	
	public Language()
	{
		
	}

	public Language(String name, String languageType) {
		super();
		this.name = name;
		this.languageType = languageType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguageType() {
		return languageType;
	}

	public void setLanguageType(String languageType) {
		this.languageType = languageType;
	}

	@Override
	public String toString() {
		return "Language [name=" + name + ", languageType=" + languageType + "]";
	}
	
	
}