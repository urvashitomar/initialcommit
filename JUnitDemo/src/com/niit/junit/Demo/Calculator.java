package com.niit.junit.Demo;

public class Calculator {
	public double add(double a,double b)
	{
		return a+b;
	}
	public double subtract(double a,double b)
	{
		return a-b;
	}
	public double multiply(double a,double b)
	{
		return a*b;
	}
	public double divide(double a,double b)
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
