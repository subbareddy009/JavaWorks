package basicKT;

  class Abc{
	
	private int i=10;
	protected int i1=20;
	int i2=30;
	public int i3=40;
	
}

class Bcd extends Abc {
	void main() {
	//System.out.println(i);
	System.out.println(i1);
	System.out.println(i2);
	System.out.println(i3);
	
  }
} 

class x extends Bcd{
	
}


 public class Accesmodifiers {
	public static void main(String args[]) {
		Abc a=new Abc();
		//System.out.println(a.i);
		System.out.println(a.i1);
		System.out.println(a.i2);
		System.out.println(a.i3);
	}

}
