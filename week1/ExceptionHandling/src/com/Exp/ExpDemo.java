package com.Exp;

public class ExpDemo
{
	public static int div(int a,int b) throws ArithmeticException
	{
		return a/b;
	}
	 
public static void main(String[] args)
{
	System.out.println("openfile");
	System.out.println("read data to file");
	try
	{
	 int result = ExpDemo.div(4,0);
	 System.out.println("result " +result);
	 String name = new String("madhuri");
	 System.out.println(name.length());
	}
	catch(ArithmeticException e)
	{
		//e.printStackTrace();
	 System.err.println("you cannot divide by zero");
	}
	catch(NullPointerException e)
	{
		e.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.println("closing");
	}
	System.out.println("updatefile");

	
	
	
	
	

}
}
