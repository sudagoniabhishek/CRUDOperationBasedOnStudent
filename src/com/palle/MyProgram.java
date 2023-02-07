package com.palle;

import java.util.ArrayList;

public class MyProgram {

	public static void main(String[] args) {
		//Student.creating();
		
        // Student.inserting("Abhishek", "java", "abhi@gmail.com");
        // Student.inserting("Sanju", "python", "sanju@gmail.com");
         //Student.inserting("Bhanu", "c++", "Bhanu@gmail.com");
		
		//Student.update(3, "riyaz@gmail.com", ".net");
		
		//Student.delete(3);
		
		ArrayList<Details> ad=Student.reading();
		
		for(Details s:ad) {
		  System.out.println(s.getNo());
		  System.out.println(s.getName());
		  System.out.println(s.getEsub());
		  System.out.println(s.getMail());
		}

	}
	
	
	

}
