package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageWithXpath {

	static WebDriver driver;

	public static void launchbrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\lecture\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void applicationurl(String url) {

		driver.get(url);
	}

	public static void email() {
		driver.findElement(By.xpath("//input[@value='admin@yourstore.com']")).clear();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@yourstore.com");
	}

	public static void password() {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
	}

	public static void login() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	public static void main(String[] args) {
		launchbrowser();
		applicationurl("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		email();
		password();
		login();

	}
}
