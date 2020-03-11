package com.niit.junit.Demo;

public class Calculator {
	public static double add(double a,double b)
	{
		return a+b;
	}
	public static double subtract(double a,double b)
	{
		return a-b;
	}
	public static double multiply(double a,double b)
	{
		return a*b;
	}
	public static double divide(double a,double b)
	{	if(b==0)
			throw new ArithmeticException();
		return a/b;
	}
	public static void main(String args[])
	{	System.out.println(add(2.0,2.0));
	 	System.out.println(subtract(2.0,2.0));
	 	System.out.println(multiply(2.0,2.0));
	 	System.out.println(divide(2.0,2.0));
	}
}
