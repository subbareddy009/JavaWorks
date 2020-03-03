package basicKT;

public class Static {

	static int z=20;
	int i=10;
	public static void main(String args[]) {

		Static n=new Static();
		Static n1=new Static();
		n.i++;
		z++;
		System.out.println(z);
		System.out.println(n.i);
		System.out.println(n1.i);
		
	}
}
