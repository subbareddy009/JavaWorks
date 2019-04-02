package myJava;

import java.util.Scanner;


class Sample {
    int i,j, k; 
    float M;

	
	
	  public Sample() {
		
	  System.out.println("**********Entered To Defaultconstructor***************");
	  
	  int sum= i+j;
	  System.out.println("\t"+sum+"\t"+"isthe Sum"); 
	  
	  }
	 
	 
	
	  public Sample(int i,int j) {
	  
	  System.out.println("************Parameterised Defaultconstructor************");
	  
	  int sum= i+j;
	  
	  System.out.println("\t"+sum+"\t"+"isthe Sum in Para Constructor");
	 

    }

  public int add(int a,int b) {
    	   i=a;
           j=b;
           k=a+b;
           System.out.println("********************************************");
           System.out.println("valueof k"+"\t"+ k  );
           M=k*k;
           System.out.println("********************************************");
          System.out.println("Multiplication:"+M);
          System.out.println("********************************************");
         System.out.println("Concatination:"+M+k);
         System.out.println("********************************************");
         System.out.println("sum of M and K:"+(M+k));
         System.out.println("********************************************");
          System.out.println("Multiplication of m and k:"+M*k);
          System.out.println("********************************************");
          System.out.println("division:"+M/k);
		return b;
         
          
    }
 
  
}

 class Parameter_Return_Constructor {
	
     static public void main(String[] ll) {
    	 int y;
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("enter value of a:"); 
    	int a=sc.nextInt();
    	System.out.println();
          System.out.print("enter value of b:"); 
        int  b=sc.nextInt();
    	Sample s=new Sample();
    	new Sample();
        Sample s1=new Sample(11,20);
        Sample s2=new Sample(100,200);
        Sample s3=new Sample(1000,2000);
		s.add(a,b); 
       
          System.out.println("*************Returned value***************");
          System.out.println("value of return a:"+ s.add(a, b));
         // System.out.println(s.M+20);
        
  
    }
	
	

}




