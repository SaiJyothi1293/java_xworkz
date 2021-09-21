package com.xworkz.java.array;

import java.util.Scanner;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("how many days in a week");
		num = input.nextInt();
		
		String[] names = new String[num];
		
		for (int count=0;count<num;count++)
		{
			System.out.println("Enter the name of a day"+ (count+1));
			names[count] = input.next();
		}
		input.close();
		
		for(int count=0;count<num;count++)
		{
			System.out.println(names[count]);
		}
	}
}
