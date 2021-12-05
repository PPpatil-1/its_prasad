package seleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LuanchBrowsweCoustomisation {

	static WebDriver driver;
	
	public static void Launchbrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\lecture\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void Applicationurl(String url) {
		driver.get(url);
		
	}
	
	public static String gettitle() {
		return driver.getTitle();
	}
 
	public static String getpagesource() {
		
		return driver.getPageSource();
	}
	
	public static String getcurrenturl() {
		
		return driver.getCurrentUrl();
		}
	
	public static void navigateback() {
		
		 driver.navigate().back();
	}
	public static void main(String[] args) {
		
		Launchbrowser();
		Applicationurl("https://naukri.com/");
		gettitle();
		getpagesource();
		getcurrenturl();
		navigateback();
	}
}

