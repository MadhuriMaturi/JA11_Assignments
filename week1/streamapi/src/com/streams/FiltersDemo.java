package com.streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FiltersDemo
{
	public static void main(String[] args)
	{
		int arr[]= {34,12,67,55,23,11,34};
		IntStream stream=Arrays.stream(arr);
		//stream.limit(4).forEach(System.out::println);
		//stream.distinct().forEach(System.out::println);
		stream.skip(3).forEach(System.out::println);
		int ar2[]= {15,10,5,10};
		IntStream stream2 =Arrays.stream(ar2);
		OptionalInt optional=stream2.reduce((a,b)->{return a+b;});
		if(optional.isPresent())
		{
			 int result=optional.getAsInt();
			 System.out.println("result from optional reduced: "+result);
		}
		else
		{
			System.out.println("no result found");
		}
		IntStream stream3=Arrays.stream(ar2);
		int result=stream3.reduce((a,b)->{return a+b;}).orElse(0);
		System.out.println(result);
		IntStream stream4=Arrays.stream(ar2);
		int total=stream4.max().orElse(0);
		System.out.println(total);
		
	}

}
