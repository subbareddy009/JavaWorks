package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Alerts {

	public static void main(String k[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\SUBU\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://google.com");
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Test@test.com");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Alert alert=driver.switchTo().alert();
		String altmsg=driver.switchTo().alert().getText();
		System.out.println(altmsg);
		alert.accept();
		driver.close();
	}
}
