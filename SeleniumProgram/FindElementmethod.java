package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementmethod {

	static WebDriver driver;
	
	public static void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\lecture\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void applicationurl(String url) {
		
		driver.get(url);
	}
	
	public static void findelement()  {
		
		WebElement usernamelbl = driver.findElement(By.name("Username"));          // to get Attribute value
		String usernametext = usernamelbl.getText();                         // to read the text 
		System.out.println(usernametext);
		
		driver.findElement(By.tagName("input")).sendKeys("Prasad");     // with tagname we can get value but for only at 1st instance 
		                                                               // when same tagname use at any position we cant fetch it
	                                                                   // with sendkeys we add user define values
	
	 driver.findElement(By.id("456")).sendKeys("prasad16@");      // to get value from same tagname but different attribute name
	 
	 driver.findElement(By.className("password_#123")).clear();    // to clear the value
	}
	
	public static void main (String[] args) {
		  
		  launchbrowser();
		  applicationurl("file:///D:/Webdriver/html/loginpage.html");
		  findelement();
		  
	  }
}
