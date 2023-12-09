package com.hexaware;

public class Main
{
	public static void main(String[] args)
	{
		MyInterface mi = (int a,int b)->{return a+b;};//lambda expression
		int result=mi.add(5, 5);
		System.out.println("Result :"+result);

	}

}
