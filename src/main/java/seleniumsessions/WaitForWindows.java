package seleniumsessions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindows {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		By linkeinlink = By.xpath("//a[contains(@href,'linkedin')]");
		ElementUtil eutil=new ElementUtil(driver);
		eutil.checkElementClikable(linkeinlink,10).click();
		if(waitForTotalWindows(10, 2)) {
			int numberofWindows=driver.getWindowHandles().size();
			System.out.println("the total number of windows is:"+numberofWindows);
		}
		

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		if (wait.until(ExpectedConditions.numberOfWindowsToBe(2))) {
//			driver.getWindowHandles();
//
//		}
		
		

	}

	public static Boolean waitForTotalWindows(int timeout, int totalWindowsToBe) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindowsToBe));

	}

}
