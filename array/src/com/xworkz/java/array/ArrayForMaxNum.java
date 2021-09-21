package com.xworkz.java.array;

public class ArrayForMaxNum {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60,70,80,90};
		
		int maxNumber = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maxNumber)
			{
				maxNumber = arr[i];
			}
		}
		 System.out.println("The Largest number is:" + maxNumber);
		
	}

}
