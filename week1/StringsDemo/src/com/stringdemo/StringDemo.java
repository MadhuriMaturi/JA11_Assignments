package com.stringdemo;

public class StringDemo 
{
	public static void main(String[] args)
	{
		String name1="Madhuri";
		String name3="Madhuri";
		
		String name2=new String("Madhuri");
		String name4=new String("Madhuri");
		System.out.println("compare values "+name1.equals(name3));
		System.out.println(name1 == name3);
		System.out.println(name1.hashCode());
		System.out.println(name3.hashCode());
		System.out.println("compare values 2,4 "+name2.equals(name4));
		System.out.println(name2 == name4);
		String s1="A";
		String s2="B";
		System.out.println(s1.compareTo(s2));//65-66=-1
		System.out.println(s2.compareTo(s1));
		String city1 ="HYDERABAD";
		String city2="hyderabad";
		System.out.println(city1.equalsIgnoreCase(city2));
		String name="Javeed";
		name=name.concat("Mohamad");
		//string is immutable
		//stringBuffer or String bulider they are mutable in nature
		StringBuffer sb=new StringBuffer("rohi");
		 sb = sb.append("tha");
		 System.out.println(sb);
		 System.out.println(sb.reverse());
		 System.out.println(sb);
		 
		
		
				
		
	}

}
