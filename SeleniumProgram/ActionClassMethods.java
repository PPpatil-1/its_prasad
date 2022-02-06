package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionClassMethods {

	static WebDriver driver;

	public static  void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\lecture\\Java\\chromedriver.exe");
        driver = new ChromeDriver();
    	}
	
	public static void Openapllictionurl(String applicationUrl) {
		
		driver.get(applicationUrl); 
	}
	
	public static void mouceevents() {
		
		WebElement signlnk = driver.findElement(By.cssSelector("a#nav-link-accountList"));
		
		Actions action = new Actions(driver);
      //  action.moveToElement(signlnk).perform();            // to move mouce(over) on particular webelement
		
     //   action.moveToElement(driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"))).click().build().perform();  //two action perform by build method
        
     //   action.click(driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"))).perform();
        
        action.clickAndHold(driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"))).perform();  // to hold that webelement
       
        action.clickAndHold(driver.findElement(By.linkText("Gift a Smile"))).perform();
        
        action.clickAndHold(driver.findElement(By.linkText("About Us"))).perform();
        
        action.contextClick().perform();         // to perform right click
        
        action.clickAndHold(driver.findElement(By.linkText("About Us"))).doubleClick().perform();  // to open particular webelement
	}
	public static void main(String[] args) {
		
		launchbrowser();
		Openapllictionurl("https:\\www.amazon.in");
		mouceevents();
		
	}
}
