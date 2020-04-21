package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {
	 public static void main(String[] args) throws IOException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
	        String baseUrl = "http://demo.guru99.com/test/upload/";
	        WebDriver driver = new ChromeDriver();

	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	        
	        WebElement iframe=driver.findElement(By.id("flow_close_btn_iframe"));
	        driver.switchTo().frame(iframe);
	        WebElement close=driver.findElement(By.xpath("//div[@id='closeBtn']"));
	        close.click();
	        driver.switchTo().defaultContent();
	        
	       WebElement web= driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
	       web.click();
	       
	       Runtime.getRuntime().exec("C:\\AutoIt\\FileUpload\\FileUpload.exe");
	        // check the "I accept the terms of service" check box
	        driver.findElement(By.id("terms")).click();

	        // click the "UploadFile" button
	        driver.findElement(By.name("send")).click();
	        }
}
