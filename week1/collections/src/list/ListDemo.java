package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListDemo 
{
	public static void main(String[] args)
	{
		List<Object> list=new ArrayList<Object>();
		list.add(101);//new integer(101);
		list.add(4.5);// new Double(4.5);
	    list.add(new String("tom"));
	    list.add(new ListDemo());
	    System.out.println(list);
	    List<Integer> list2=new ArrayList<Integer>();
	    list2.add(102);
	    list2.add(103);
	    list2.add(104);
	    list2.add(103);
	    list2.add(null);
	    System.out.println("using for each loop");
	    System.out.println(list2); 
	    for(Integer i:list2)
	    {
	    	System.out.println(i);
	    }
	    System.out.println("iterator");
	   Iterator<Integer> it = list2.iterator();
	       while(it.hasNext())
	       {
	    	   Integer in=(Integer)it.next();
	    	   System.out.println(in);
	       }
	    
	}

}
