package basicKT;

 class Defalt1{
	 
	 float f1=20.00f;
	 
	 void main() {
		 
		 System.out.println(f1);
		 
	 }
 }
	 class Defalt extends Defalt1 {
	 public static void main(String args[]) {
		 
		 Defalt1 d=new Defalt1();
		 d.f1=20.5f;
	 }

}
 
