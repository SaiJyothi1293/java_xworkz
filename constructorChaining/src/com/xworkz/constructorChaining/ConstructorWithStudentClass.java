package com.xworkz.constructorChaining;

public class ConstructorWithStudentClass {

	public static void main(String[] args) {
		
		Student1 s1 = new Student1("kiran",3456);
		Student1 s2 = new Student1("kiran",3456,18);
		s1.display();
		s2.display();
		
	}
	
}
