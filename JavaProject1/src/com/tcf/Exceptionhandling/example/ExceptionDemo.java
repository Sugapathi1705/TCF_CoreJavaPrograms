package com.tcf.Exceptionhandling.example;

public class ExceptionDemo {

	public static void main(String[] args) {
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("Division :"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception: "+e.getMessage());
		}

	}

}
