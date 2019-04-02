package Kt2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

public class list {

		
		/*public static void main(String args[]) {
		 
		List<String> str=new ArrayList<String>();
	     str.add("Paul");
		 str.add("main");
		 str.add("List"); 
		 str.add("sum");
		 str.add(" ");
		 str.add("sum");
		 str.add("subract");
		 str.add("mul");
		 System.out.println("value of list:"+str);
		 for(String s:str) 
		 { 
			 System.out.println(s);
		 
		 }
		 str.remove("sum"); 
		 str.remove(1);
		 
		 System.out.println("value of list:"+str);
		 str.add(1, "ons");
		 str.add(1, "element");
		 System.out.println("value of list:"+str);
	
		System.out.println("get value:"+str.get(3)); 
		 System.out.println("value of list:"+str);
		 
		 ListIterator<String> itr=str.listIterator(); 
		 while(itr.hasNext())
		 { 
			 Object obj=itr.next();
		    System.out.println(obj);
		 
		   }
		 }*/
		
		//Map
		 public static void main(String args[])
		 {
			/* Integer i=new Integer(1);
			 Integer i1=new Integer(2);
			 Integer i2=new Integer(3);*/
			Map<Integer,String> map1=new HashMap<Integer,String>();
		  /*  map1.put(i, "suba");
		    map1.put(i1, "suba1");
		    map1.put(i2, " ");
		    map1.put(i1, "");*/
		    map1.put(10, "suba");
		   map1.put(5, "suba");
		   map1.put(4, "suba3"); 
		   map1.put(11,"kkk");
		  // map1.putIfAbsent(i, "1");
		   System.out.println(map1);
		//  map1.replace(i1, "subaa1");
		   map1.remove(5);
		   System.out.println(map1);
		   // using keySet() for iteration over keys 
	        for (Integer value : map1.keySet())  
	            System.out.println("key: " + value); 
	          
	        // using values() for iteration over keys 
	        for (String name :map1.values())  
	            System.out.println("value: " + name); 
	        
		   Iterator<Map.Entry<Integer, String>> itr =  map1.entrySet().iterator();   
	        while(itr.hasNext()) 
	        { 
	             Entry<Integer, String> entry = itr.next(); 
	             System.out.println("Key = " + entry.getKey() +  
	                                 ", Value = " + entry.getValue()); 
	        } 
		 
		 
		 }
	


}




