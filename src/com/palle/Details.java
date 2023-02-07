package com.palle;

public class Details {
	
	private int no;
	private String name;
	private String esub;
	private String mail;
	public Details(int no, String name, String esub, String mail) {
		super();
		this.no = no;
		this.name = name;
		this.esub = esub;
		this.mail = mail;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEsub() {
		return esub;
	}
	public void setEsub(String esub) {
		this.esub = esub;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}


}
	