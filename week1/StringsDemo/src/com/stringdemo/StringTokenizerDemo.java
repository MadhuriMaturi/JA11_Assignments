package com.stringdemo;

public class StringTokenizerDemo 
{
	public static void main(String[] args)
	{
		String data="Hello friends how are you I am fine here Thank you";
		String arr[]=data.split("");
		for(String token:arr) {
			System.out.print(token);
		}
	}

}
