package selenium;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat smd = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss ms");
		String f = smd.format(date);
		System.out.println(f);
		
        //with month
		System.out.println(new SimpleDateFormat("dd MMMM yyyy").format(date));
		//Time Zone
		System.out.println("Time Zone: "+new SimpleDateFormat("dd MMMM yyyy zzzz").format(date));
		//with week day and zone
		System.out.println("with week day and zone: "+new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z").format(date));
	}

}
