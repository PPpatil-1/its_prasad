package seleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriBrowserLaunch {

	static WebDriver driver;
	
	public static void  LaunchBrowser() {
		
	
		System.setProperty("webdriver.chrome.driver", "D:\\lecture\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void appilicationurl() {
		
		driver.get("https://www.naukri.com/");
	}
	
	public static void pagesource() {
		
		driver.getPageSource();
	}
	
	
	
	//public static void closemethod() {
		
	//	driver.close();
	//}
	
	//public static void Quitmethod() {
		
	//	driver.quit();
	//}
	public static void gettitle() {
	
		String Actualtitle = driver.getTitle();
		String Expectedtitle = "Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com";
		
		if (Actualtitle.equals(Expectedtitle)) {
			System.out.println("actaul title is same as expected ");
		} else {
             System.out.println("actaul title is not same as expected  Actaul title = "+Actualtitle );
		}
	}
	
	public static void navigationmethod() {
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://amazon.com/");
	}
	
	public static void main(String[] args) {
		
		LaunchBrowser();
		appilicationurl();
		//closemethod();
		//Quitmethod();
		gettitle();	
		pagesource();
		navigationmethod();
	}		
}
