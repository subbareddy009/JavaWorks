package Kt2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_Example {
	 
	    public static void main(String[] args) 
	    { 
	        // Set deonstration using HashSet 
	        Set<String> hash_Set = new HashSet<String>(); 
	        hash_Set.add("Geeks"); 
	        hash_Set.add("For"); 
	        hash_Set.add("Geeks"); 
	        hash_Set.add("Example"); 
	        hash_Set.add("Set"); 
	        hash_Set.add(" ");
	        System.out.print("Set output without the duplicates"); 
	       // hash_Set.remove("");
	        System.out.println(hash_Set); 
	     // Creating an iterator 
	        Iterator value =hash_Set.iterator(); 
	  
	        // Displaying the values after iterating through the set 
	        System.out.println("The iterator values are: "); 
	        while (value.hasNext()) { 
	            System.out.println(value.next()); 
	        } 
	  
	        // Set deonstration using TreeSet 
	      System.out.print("Sorted Set after passing into TreeSet"); 
	        Set<String> tree_Set = new TreeSet<String>(hash_Set); 
	        System.out.println(tree_Set);
	    } 
	} 
