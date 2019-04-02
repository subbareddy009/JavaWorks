package selenium;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionss {
	
	 static public  void main(String []k) {
		 
		 String tool=null;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the tool value:");
			tool=s.nextLine();
		 System.setProperty("webdriver.chrome.driver", "C:\\drivers\\SUBU\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 Actions builder = new Actions(driver);
		String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
		String URL1="https://www.google.com";
		 driver.get(URL1);
		  
		 
		  
		 driver.manage().window().maximize();
		  
		 driver.manage().timeouts().implicitlyWait(1000000000, TimeUnit.MILLISECONDS);
		 driver.manage().timeouts().implicitlyWait(1000000000, TimeUnit.MILLISECONDS);
		 driver.manage().timeouts().implicitlyWait(1000000000, TimeUnit.MILLISECONDS);
		 driver.manage().timeouts().implicitlyWait(1000000000, TimeUnit.MILLISECONDS);
		 
		
		
		 WebElement toolTip=driver.findElement(By.xpath("//*[@title='Google apps']"));
		 
		builder.moveToElement(toolTip).build().perform();
		 String s1=toolTip.getAttribute("title");
		   System.out.println(toolTip);
        if(s1.equals(tool) ) {
	    System.out.println("Tooltip value is: " + s1);
	    int i=10,f=90,l;
	    System.out.println(i+f);
         }
        else {
        	System.out.println("Tooltip value is:  Error occured");
        }
		   
		    
		/* 
		 WebElement From = driver.findElement(By.xpath("//div[@id='treebox1']//span[text()='Thrillers']"));
		 
		 builder.moveToElement(From).click();
		
		 
		  
		 WebElement To = driver.findElement(By.xpath("//*[@id='treebox2']//span[text()='Bestsellers']"));
		  
		builder.moveToElement(From).click();
		  
		 Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
		  
		 dragAndDrop.perform();
		 */
        
        
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        Actions a=new Actions(driver);
        WebElement from=driver.findElement(By.xpath("//*[@id=\'credit2\']/a"));
         WebElement to=driver.findElement(By.xpath("//*[@id=\'bank\']/li"));
          a.dragAndDrop(from, to).build().perform();
          driver.close();

          
         // Keyboard Events
        
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
       //   WebDriver driver=new ChromeDriver();
          driver.get("http://demowebshop.tricentis.com/");
          driver.manage().window().maximize();
          WebElement search=driver.findElement(By.xpath("//*[@id=\'small-searchterms\']"));
         // Actions a=new Actions(driver);
          a.keyDown(search, Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
          //Thread.sleep(2000);   
          a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
          driver.close();
                  

		  
		 }
		  
		 }
	 


		
	 

