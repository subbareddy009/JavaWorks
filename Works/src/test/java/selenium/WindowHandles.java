package selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	


	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/popup.php");
	System.out.println(driver.getWindowHandles());
	driver.findElement(By.xpath("//*[text()='Click Here']")).click();
	String parentwin=driver.getWindowHandle();
	System.out.println("parent:"+parentwin);
	Set<String> Childwin= driver.getWindowHandles();
	Iterator<String> child=Childwin.iterator();
	String patrntwin1=child.next();
	String childwin1=child.next();
    System.out.println(childwin1);
    if(!patrntwin1.equalsIgnoreCase(childwin1)) {
    	System.out.println(childwin1);
    	driver.switchTo().window(childwin1);
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.findElement(By.name("emailid")).sendKeys("Subba@test1.com");
    	driver.findElement(By.name("btnLogin")).click();
    	driver.close();
    }
    driver.switchTo().window(patrntwin1);
	driver.close();
	
	}
}
