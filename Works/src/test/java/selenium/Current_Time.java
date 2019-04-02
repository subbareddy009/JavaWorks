package selenium;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
public class Current_Time {
	public static void main(String n[]) {
		    Date date=new Date();
		    DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss a");
		    String formattedDate=dateFormat.format(date);
		    System.out.println("Current time of the day using Calendar - 12 hour format: "+ formattedDate); 
		    System.setProperty("webdriver.chrome.driver", "C:\\drivers\\SUBU\\chromedriver_win32\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
		    driver.get("http://www.google.com");
		    
		 // Take screenshot and store as a file format
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
		  // now copy the  screenshot to desired location using copyFile //method
			 Files.copy(src, new File("C:\\Users\\subba.r.annapureddy\\eclipse-workspace\\Works\\Test"));
		 }
		 catch (IOException e)
		  {
		   System.out.println(e.getMessage());
		  
		  }
		  }
	}

