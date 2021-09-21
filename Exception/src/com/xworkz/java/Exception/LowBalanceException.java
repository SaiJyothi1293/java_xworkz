package com.xworkz.java.Exception;
import java.util.Scanner;

public class LowBalanceException extends Exception {
	
	public LowBalanceException()
	{
		super("Insufficient balance");
		}

}

class Exceptiontest
{
	public void atm(int m) 
	{
		int money = m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdraw Amount: ");
		int withdraw = sc.nextInt();
		if(money<withdraw)
		{
			try
			{
			
			throw new LowBalanceException();
		}
			catch(LowBalanceException e)
			{
				System.out.println(e);
		}
	}
		else
		{
			int remain = money - withdraw;
			System.out.println("Remain Balance: "+remain);
		}
		
	}
	
}
