package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktestmethod {

	static WebDriver driver;
	
	public static void Launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\lecture\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void Applicationurl(String url) {
		driver.get(url);

	}

	//public static void linktestmethod() {
//		driver.findElement(By.linkText("click here")).click();   // after using click method this page goes to google page
//	}
	
	public static void partiallinktestmethod() {
		driver.findElement(By.partialLinkText("click")).click();
	}                                                            // at a time only method call
	public static void main(String[] args) {
		Launchbrowser();
		Applicationurl("http://demo.guru99.com/test/link.html");
       // linktestmethod();
       partiallinktestmethod();
	}

	
}

