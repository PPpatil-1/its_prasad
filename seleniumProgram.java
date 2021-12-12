package seleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {
  
	static WebDriver driver;

	public static  void Launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\lecture\\Java\\chromedriver.exe");
        driver = new ChromeDriver();
    	}
	
	public static void Openapllictionurl() {
		
		driver.get("https://www.google.com/");  // to get appliction url
		try {
		Thread.sleep(3000);	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void close() {
		
	//	driver.close(); // to close current tab 
	
	}
	
	public static void quit() {
		
//		driver.quit();  // to close all tab that is open
	}
	
	public static void pagesource() {
		
		String Pagesource = driver.getPageSource();    // to fecth all page design done on html 
		System.out.println(" Pagesource = "+Pagesource.substring(0,10));  // 0 to 10 given to fetch only 1st item we can remove it 
	}
	public static void gettitle() {
		
		String ActualTitle = driver.getTitle();         // to get title of site 
		String ExpectedTitle = "Google";
		
		if (ActualTitle.equals(ExpectedTitle))          // validate title 
			System.out.println("Actual title is same as expected title");
		else
			System.out.println("Actual title is  not same as Expected title [ Actual String = "+ActualTitle+ " ]" );
	}
	
	public static void getcurrenturl() {
		
		String Currenturl = driver.getCurrentUrl();      // to get current url
		System.out.println("Current url = "+Currenturl);
	}
	
	public static void NavigationOperation() {
		
		driver.navigate().back();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://naukri.com/");
	}
	
	
	public static void main(String[] args) {
		
		Launchbrowser();
		Openapllictionurl();
		close();
		quit();
		gettitle();
		getcurrenturl();
		pagesource();
		NavigationOperation();
		
		
		
		
	}
}    
