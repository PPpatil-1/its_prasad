package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorMethod {

	static WebDriver driver;

	public static  void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\lecture\\Java\\chromedriver.exe");
        driver = new ChromeDriver();
    	}
	
	public static void Openapllictionurl(String url) {
		
		driver.get(url); 
	}
	
	public static void handlewebelement() {
		 String Product = "laptop";
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		
	//	driver.findElement(By.cssSelector("input[class='_3704LK'")).sendKeys("t.v.");
		
	//	driver.findElement(By.cssSelector("[type='submit']")).click();
		
	//	String s=driver.findElement(By.cssSelector("input[name='q']")).getAttribute("placeholder");
	//     System.out.println("Actual placeholder ="+s);

	    
	WebElement serchbar= driver.findElement(By.cssSelector("input[name='q']"));
	serchbar.sendKeys(Product);
	String s1 = serchbar.getAttribute("value");
	System.out.println("value ="+s1);
	
	String fontfamily = serchbar.getCssValue("fontfamily");
	System.out.println("fontfamily :"+fontfamily);
	
	System.out.println(driver.findElement(By.cssSelector("a[class='_1_3w1N']")).getText());
	}
	
	public static void main(String[] args) {
		
		
		launchbrowser();
		Openapllictionurl("https://www.flipkart.com/");
		handlewebelement();	
		
	}
}


