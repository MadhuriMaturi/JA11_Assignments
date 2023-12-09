package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import set.Employee;
import set.MyComparator;

public class MapDemo
{
    public static void main(String[] args)
    {
    	Map<Integer,String> map=new HashMap<Integer,String>();
    	map.put(33, "rohi");
    	map.put(15, "Javeed");
    	map.put(32, "madhu");
    	map.put(36, "rohi");
    	map.put(33, "arjun");
    	System.out.println(map);
    	Set<Integer> keySet=map.keySet();
    	System.out.println(map.get(33));
    	Map<Employee,String> set2=new TreeMap<Employee,String>(new MyComparator());
		set2.put(new Employee(103,"anand",3000),"delhi");
	    set2.put(new Employee(104,"ram",4000),"bang");
	    set2.put(new Employee(101,"madhu",6000),"elr");
	    set2.put(new Employee(107,"rohi",7000),"hyd");
	    System.out.println("set2");
	    
    }
}
