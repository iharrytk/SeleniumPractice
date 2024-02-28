package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		//navigate methods:
		//to
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		
		try {
			driver.navigate().to(new URL("https://www.google.com/"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//back
		driver.navigate().back();
		System.out.println(driver.getTitle());
		//forward
		driver.navigate().forward();
		System.out.println(driver.getTitle());
//		
		driver.quit();

	}

}
