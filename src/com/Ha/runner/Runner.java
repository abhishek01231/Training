package com.Ha.runner;

import com.Ha.base.Person;
import com.Ha.groups.Student;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student();
	
		s1.setName("abhishek");
		s1.setPhonenumber(2654321359L);
		s1.setStudentpercentage(35);
		s1.setStudentid(104);
	System.out.println(s1.getName());
	s1.studentdetail();
	
	Student s2=new Student();
	
	s2.setName("abhishek");
	s2.setPhonenumber(2654321359L);
	s2.setStudentpercentage(35);
	s2.setStudentid(104);
System.out.println(s1.getName());
s2.studentdetail();
	
	}

}
