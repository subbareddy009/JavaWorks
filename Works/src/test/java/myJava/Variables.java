package myJava;

public class Variables {
    
	 int a;
	 float b;
	 double d;
	 char ch;//insatnce variables
	 String Name;
	 boolean bol;
	 static int i; // static variables
	public static void main(String[] args) {
		int i=1;//local variables
		
		//System.out.println(i);
		//Variables.i;
		Variables v=new Variables();
		System.out.println("int"+"\t"+v.a);
		System.out.println("Float"+"\n"+v.b);
		System.out.println("double"+"\n"+v.d);
		System.out.println("Char"+"\n"+v.ch);
		System.out.println("Boolean"+"\n"+v.bol);
		System.out.println("String"+"\n"+v.Name);//insatance variables
		System.out.println("Static int"+"\n"+Variables.i);//static variable
	
	
	}
	
 }


//Static

/*
* static int count=0; public void increment() { count++; } public static void
* main(String args[]) { VariableDemo obj1=new VariableDemo(); VariableDemo
* obj2=new VariableDemo(); obj1.increment(); obj2.increment();
* System.out.println("Obj1: count is="+obj1.count);
* System.out.println("Obj2: count is="+obj2.count); }
*/

/* Static methods */
/*
* static int age; static String name; //This is a Static Method static void
* disp(){ System.out.println("Age is: "+age);
* System.out.println("Name is: "+name); } // This is also a static method
* public static void main(String args[]) { age = 30; name = "Steve"; disp();
* }
*/


