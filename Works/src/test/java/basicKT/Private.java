package basicKT;

public class Private {

	public static void main(String[] args) {
		sub1 s=new sub1();
		s.main(null);
		//System.out.println(s.name);
	}

}

class sub1{
	
	private String name="Subba";
	public void main(String args[]) {
		System.out.print(name);
	}
}
