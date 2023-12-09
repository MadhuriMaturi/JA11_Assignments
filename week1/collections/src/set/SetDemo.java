package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

 class SetDemo
{
	public static void main(String[] args)
	{ 
		Set<String> set1=new HashSet<String>();
		set1.add("don");
		set1.add("ama");
		set1.add("papa");
		set1.add(null);
		set1.add("javeed");
		System.out.println(set1);
		Set<Employee> set2=new HashSet<Employee>();
	    set2.add(new Employee(103,"anand",3000));
	    set2.add(new Employee(104,"ram",4000));
	    set2.add(new Employee(101,"madhu",6000));
	    set2.add(new Employee(107,"rohi",7000));
	    System.out.println(set2);
	    Set<Integer> set3 = new LinkedHashSet<Integer>();
	    set3.add(105);
		set3.add(104);
		set3.add(105);
		set3.add(103);
		System.out.println(set3);
	
	}

}
