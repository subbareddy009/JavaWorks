package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionn1 {
	
	public static void main(String args[]) {
		
		
	
		 System.setProperty("webdriver.chrome.driver", "C:\\drivers\\SUBU\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 Actions a=new Actions(driver);
		 
		// a.moveToElement();;
	}
	

}
