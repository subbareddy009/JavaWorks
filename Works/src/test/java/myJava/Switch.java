package myJava;
import java.util.Scanner;
    public class Switch {
	 public static void main(String[] args) 
	    { 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Year:");
	        int year =sc.nextInt();
		 System.out.println("Enter the Branch:");
	        String Branch=sc.nextLine();
	       
	        switch (year) { 
	        case 1: 
	            System.out.println("elective courses : Advance english, Algebra"); 
	            break;
            
	        case 2: 
	            switch(Branch) // nested switch 
	            { 
	           
	            case "CSE": 
	            case "CCE": 
	                System.out.println("elective courses : Machine Learning, Big Data"); 
	               
	           
	            case "ECE": 
	                System.out.println("elective courses : Antenna Engineering"); 
	                break; 
	            
	            default: 
	                System.out.println("Elective courses : Optimization");
	            } 
	        default: 
                System.out.println("Elective courses : Optimization");
	        } 
	    } 
  }

