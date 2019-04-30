package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys {
	
	public static void main(String k[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\SUBU\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.navigate().to("https://www.cleartrip.com");
		
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		 WebElement si=driver.findElement(By.xpath("//a[@href='Button.html']"));
		System.out.println(si.getText());
		String Actual=driver.getTitle();
		String Manual="TestLeaf - Interact with Buttons";
		if(Manual.contains(Actual)) {
			
			System.out.println("I am in Expected page");
		}
		
		else
			System.out.println("I am not in Expected page");
		
		driver.close();
	}
	

}
