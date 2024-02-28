package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		//maximize the screen to the browser
		driver.manage().window().maximize();
		//full screen of the monitor
		driver.manage().window().fullscreen();
	

		driver.quit();

	}

}

//Get page Source
//String pagecontent=driver.getPageSource();
//System.out.println(pagecontent);
//System.out.println("------------------------------");
//System.out.println(pagecontent.contains("end details section"));


// Refresh web page
//driver.navigate().refresh();
//System.out.println(driver.getTitle());
//driver.get(driver.getCurrentUrl());
//System.out.println(driver.getTitle());