package seleniumProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartProduct {

	static WebDriver driver;

	public static  void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\lecture\\Java\\chromedriver.exe");
        driver = new ChromeDriver();
    	}
	
	public static void Openapllictionurl(String url) {
		
		driver.get(url); 
	}
	
	public static void Steptoaddtocart() {
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("laptop Bags");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        
        driver.findElement(By.xpath("//a[contains(@title,'16 inch Laptop')]")).click();
        
        String handle = driver.getWindowHandle();
       System.out.println(handle);
        
      Set<String> windowhandles = driver.getWindowHandles();
       System.out.println(windowhandles);
       Iterator<String> itr = windowhandles.iterator();
       while(itr.hasNext()) {
    	   driver.switchTo().window(itr.next());
           
       }
      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
        
	}
	
	
	
	public static void main(String[] args) {
		
		launchbrowser();
		Openapllictionurl("https://flipkart.com/");
		Steptoaddtocart();
	}
}
