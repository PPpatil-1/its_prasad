package seleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandling {

	static WebDriver driver;

	public static  void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\lecture\\Java\\chromedriver.exe");
        driver = new ChromeDriver();
    	}
	
	public static void Openapllictionurl(String url) {
		
		driver.get(url); 
	}
	
	/*public static void radiobuttonhandle() {          // to fetch one output 
		
		driver.findElement(By.cssSelector("label[class='custom-control-label']")).click();
		
    }*/
	
	
	public static void radiobuttonhandle1() {             // to fetch all output
		
		List<WebElement> ele = driver.findElements(By.cssSelector("label[class*='custom-control-label']"));
		for(WebElement btn:ele) {
		System.out.println(btn.getText());
		}
		
	}
	
	public static void Radiohandlebutton2() {    // in some cases we have to change the path to fetch value or perform operation
		
		List<WebElement> ele1=driver.findElements(By.xpath("//input[@class='custom-control-input'or@class='custom-control-input disabled']"));
		for(WebElement btn:ele1) {
			System.err.println(btn.getAttribute("id")+" btn Status is "+btn.isEnabled());
		}
	}
	public static void main(String[] args) {
		
		launchbrowser();
		Openapllictionurl("https://demoqa.com/radio-button");
		radiobuttonhandle1();
		Radiohandlebutton2();
	}
}
