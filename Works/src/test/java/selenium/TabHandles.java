package selenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandles {

	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\SUBU\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.open();");
		ArrayList<String> list=new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		driver.get("https://facebook.com");
		driver.close();
	}
}
