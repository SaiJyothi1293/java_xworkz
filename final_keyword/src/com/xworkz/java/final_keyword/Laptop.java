package com.xworkz.java.final_keyword;

public class Laptop {

	final String BRAND;
    final String COLOR;
	final int PRICE;
	
	Laptop()
	{
		BRAND = "Lenovo";
		COLOR = "Black";
		PRICE = 60000;
		
	}
	Laptop(String brand)
	{
		BRAND = "Dell";
		COLOR = "silver";
		PRICE = 49000;
	}
    Laptop(String brand,String color)	
    {
    	BRAND = "hp";
    	COLOR = "Blue";
    	PRICE = 56000;
    }
}
