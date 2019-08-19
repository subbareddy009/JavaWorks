package selenium;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
    static public void main(String args[]) throws MalformedURLException,UnknownHostException,InterruptedException,IOException {
    	System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
	 driver.get("https://www.crmpro.com/index.html");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(1000000000, TimeUnit.MILLISECONDS);
	 driver.findElement(By.name("username")).sendKeys("nani123");
	 driver.findElement(By.name("password")).sendKeys("nani123");
	 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	 driver.findElement(By.xpath("//*[@id='loginForm']/div//div")).click();
	 driver.switchTo().frame("mainpanel");
	 
	 //get all the links and images to a list
	 List<WebElement> list=driver.findElements(By.tagName("a"));
	 System.out.println("No of links available-->"+list.size());
	 list.addAll(driver.findElements(By.tagName("img")));
	 System.out.println("No of links and images available-->"+list.size());
	 //iterate all the link by eliminating null values 
	  List<WebElement> activelinks=new ArrayList<WebElement>();
	  for(int i=0;i<list.size();i++) {
		  System.out.println(list.get(i).getAttribute("href"));
		  if(list.get(i).getAttribute("href")!=null && !(list.get(i).getAttribute("href").contains("javascript"))) {
			  activelinks.add(list.get(i));
		  }
	  }
	 System.out.println("links with href-->"+activelinks.size());
	 
	 //make the connection of the link using URl is casting with HttpURLConnection 
	 for(int j=0;j<activelinks.size();j++) {
		 
		 HttpURLConnection connection= (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
		 connection.connect();
		 String response=connection.getResponseMessage();
		 connection.disconnect();
		 System.out.println(activelinks.get(j).getAttribute("href")+"---->"+response);
		 
	 }
	 

    }
}
