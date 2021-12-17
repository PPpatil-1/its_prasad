package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrateNewAccountWithCssSelector {

	static WebDriver driver;

	public static void launchbrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\lecture\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void applicationurl(String url) {

		driver.get(url);
	}

	public static void Createnewaccountbutton() {
		driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public static void firstname() {
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Prasad");
	}

	public static void lasttname() {
		driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-'][name='lastname']"))
				.sendKeys("patil");
	}

	public static void mobileno() {
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("8698719369");
	}

	public static void newpassword() {
		driver.findElement(By.cssSelector("input[id='password_step_input']")).sendKeys("abc");
	}

	public static void dateselction() {
		driver.findElement(By.cssSelector("select[id='day']")).sendKeys("16");
		driver.findElement(By.cssSelector("select[name='birthday_month']")).sendKeys("may");
		driver.findElement(By.cssSelector("select[title='Year']")).sendKeys("1997");
	}

	public static void gender() {
		driver.findElement(By.cssSelector("input[value='2']")).click();
	}

	public static void signup() {
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
	}

	public static void main(String[] args) {

		launchbrowser();
		applicationurl("https://www.facebook.com/");
		Createnewaccountbutton();
		firstname();
		lasttname();
		mobileno();
		newpassword();
		dateselction();
		gender();
		signup();

	}
}
