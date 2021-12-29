package seleniumProgram;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleMeathod {

	static WebDriver driver;
	private static Object FileUtils;

	public static void launchbrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\lecture\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void Openapllictionurl(String url) {

		driver.get(url);
	}
	
	

	public static void getwindowhandle() {

		String handle = driver.getWindowHandle(); // to get an window handle of main tab
		// System.out.println(handle);

		Set<String> windowhandles = driver.getWindowHandles();      // to get an window handle of all tabs that open
		/*
		  System.out.println(windowhandles); 
		  Iterator<String> itr = windowhandles.iterator();
		   while(itr.hasNext()) {
		  System.out.println(itr.next());                         // we can get all tab with iterator
		   }
		 */
		/*Iterator<String> itr1 = windowhandles.iterator();
		while (itr1.hasNext()) {
			driver.switchTo().window(itr1.next());                 // we can switch to next tab with iterator

			System.out.println("title is =" + driver.getTitle());
			System.out.println("url is =" + driver.getCurrentUrl());
		}*/
	
		Iterator<String> itr2 = windowhandles.iterator();
		while (itr2.hasNext()) {
			driver.switchTo().window(itr2.next());                 // we can switch to particular tab and make operation on it.
          if(driver.getTitle().equals("IQVIA")) {
        	  System.out.println("url is =" + driver.getCurrentUrl());
            driver.manage().window().maximize();
        	  break;
          }
			
		}
		driver.switchTo().window(handle);                        // again back to main tab
		System.out.println("main tab ="+handle);
	}

	public static void TakeScreenshot() {
		
		Date date = new Date();                                                 // add unique date so that we can save screenshot uniquely
		SimpleDateFormat simpleformat = new SimpleDateFormat("ddMMyyyy_hhmmss");
		String timestamp = simpleformat.format(date);
		  
		TakesScreenshot ts = (TakesScreenshot) driver;
	     File file =  ts.getScreenshotAs(OutputType.FILE);
	     File destfile = new File("D:\\lecture\\CoreJavaProgram\\Screenshot\\Screenshot_"+timestamp+".png");
	     try {
			org.apache.commons.io.FileUtils.copyFile(file, destfile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}  
	     


	}
	

	
	public static void main(String[] args) {

		launchbrowser();
		Openapllictionurl("https://www.naukri.com/");
		getwindowhandle();
		TakeScreenshot();

	}
}
