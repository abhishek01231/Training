package com.Ha.groups;

import com.Ha.base.Person;

public class Student extends Person {
	private int studentid;
	private String coursecode;
	private double studentpercentage;


	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) 
	{
		if (studentid <= 100) {
			System.out.println("invalid id");
		} 
		else
		{
			this.studentid = studentid;
			studentid++;
		}
		
	}

	public double getStudentpercentage() {
		return studentpercentage;
	}

	public void setStudentpercentage(double studentpercentage) {
		this.studentpercentage = studentpercentage;
	}

	public void studentdetail() 
	{
		System.out.println("student id: "+this.studentid);
		System.out.println("student name: "+super.getName());
		System.out.println("student phonenumber: "+super.getPhonenumber());
		System.out.println("student percentage: "+this.getStudentpercentage());

	}

}
