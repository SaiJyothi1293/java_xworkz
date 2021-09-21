package com.xworkz.constructorChaining;

public class Balloon {

	String color;
	double price;
	int size;
	
	 Balloon()
	{
	    System.out.println("Default");
	}
    Balloon(String color){
    	this.color = color;
    	System.out.println(color);
    }
    Balloon(String color,int size){
    	System.out.println("Two");
    }
    Balloon(String color, int size,double price)
    {
    	System.out.println("Three");
    }
}


