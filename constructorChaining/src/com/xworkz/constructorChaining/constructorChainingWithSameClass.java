package com.xworkz.constructorChaining;

public class constructorChainingWithSameClass {
	
	public static void main(String[] args) {
		
		Book book1 = new Book("ClassMate",50);
		System.out.println(book1.name +" "+ book1.noOfPages);
	}

}
