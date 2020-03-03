package basicKT;

import java.util.Scanner;

public class ReverseaString {

	public static void main(String[] args) {
		
		//Reverse a StringSu
		String Original,reverse="";
		Scanner s=new Scanner(System.in);
		System.out.println("please Enter the String :");
		Original=s.nextLine();
		System.out.println("reverse:"+reverse);

		for(int i=Original.length()-1;i>=0;i--) {
			
			reverse=reverse+Original.charAt(i);
			System.out.println(reverse);
		}
		System.out.println("Final reverse:"+reverse);

//Using String Buffer
		StringBuffer sb=new StringBuffer(Original);
		sb.reverse();
		sb.append(10.2);
		System.out.println(sb);
	}

}
