package com.Ha.base;

public class Person {
private String name;
private long phonenumber;
private  String mailid;
private  String address;
private  static String  schoolname;
private  static String  schooladdress;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		if(String.valueOf(phonenumber).length()==10) {
		this.phonenumber = phonenumber;
	}
		else {
			System.out.println("invalid phonenumber");
		}
	}}
