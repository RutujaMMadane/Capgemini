package com.bean;

import java.util.List;

public class Liberary {
	private int lid;
	private String lname;
	private List<String>book;
	public Liberary()
	{
		
	}
	public Liberary(int lid, String lname, List<String> book) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.book = book;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<String> getBook() {
		return book;
	}
	public void setBook(List<String> book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Liberary [lid=" + lid + ", lname=" + lname +",book="+book+ "]";
	}
	

}
