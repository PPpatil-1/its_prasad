package seleniumProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserWithManageMethod {

	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\lecture\\Java\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void applicationurl() {
		driver.get("https://amazon.com/");
	}

	public static void Managemethod() {

		// System.out.println("before any operation
		// ="+driver.manage().window().getSize()); // get an set or default size of page

		Dimension dim = new Dimension(600, 500);
		// driver.manage().window().setSize(dim); // to set particular size of web page

		// System.out.println("After an Operation =
		// "+driver.manage().window().getSize());

		// driver.manage().window().maximize(); // to do maximize operation

		System.out.println("to fetch position =" + driver.manage().window().getPosition()); // to fetch default set
																							// position of page

		Point point = new Point(200, 400);
		driver.manage().window().setPosition(point); // to set position of web page

		System.out.println("to fetch position after operation =" + driver.manage().window().getPosition());

		System.out.println("Before operation = " + driver.manage().getCookies()); // to fetch out cookies which is set
																					// for that website

		driver.manage().deleteAllCookies(); // to delete cookies

		System.out.println("After operation =" + driver.manage().getCookies());

		Cookie cookie = new Cookie("Cookie 1", "sp-cdn=\"L5Z9:IN\"; expires=Sun"); // once we delete cookies there is
																					// less
		// chances to add as production site does not allow to add
		driver.manage().addCookie(cookie);
		System.out.println("After deleting all cookies=" + driver.manage().getCookies());

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // to take
		// time out between process or execution
	}

	public static void main(String[] args) {
		launchBrowser();
		applicationurl();
		Managemethod();
	}
}
