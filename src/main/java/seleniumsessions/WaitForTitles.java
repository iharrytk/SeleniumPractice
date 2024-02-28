package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitles {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.findElement(By.linkText("Forgot Password?")).click();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		if (wait.until(ExpectedConditions.titleContains("CRMPRO Log In Screen"))) {
//			String titleofpage = driver.getTitle();
//			System.out.println("The title of the page is:" + titleofpage);
//
//		}
//		Boolean titleIsAvailable = waitforPagetitle(10, "Log In Screen");
//		if (titleIsAvailable) {
//			String titleOfPAge = driver.getTitle();
//			System.out.println("The title of the page is:" + titleOfPAge);
//		}
		
//		String title=waitForTitleIsAndCapture(10, "Log In Screen");
//		System.out.println("The title of the page is:"+title);
		
		
		
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		if(wait.until(ExpectedConditions.urlContains("classic.freecrm.com/login.cfm?pr=1"))) {
//			String url=driver.getCurrentUrl();
//			System.out.println("The URL of the forgot password page is:"+url);
//		}
		String url=waitForURLToBeAndCapture(10, "https://classic.freecrm.com/login.cfm?pr=1");
		System.out.println("The title of the page is:"+url);
		

	}

	public static Boolean waitforPagetitle(int timeout, String pageTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.titleContains(pageTitle));

	}

	public static String waitForTitleContainsAndCapture(int timeout, String titleFraction) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
			String titleofpage = driver.getTitle();
			return titleofpage;
		}
		else {
			System.out.println("The title is not present within the given timeout:"+timeout);
			return null;
		}

	}
	
	public static String waitForTitleIsAndCapture(int timeout, String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.titleIs(title))) {
			String titleofpage = driver.getTitle();
			return titleofpage;
		}
		else {
			System.out.println("The title is not present within the given timeout:"+timeout);
			return null;
		}

	}
	
	public static String waitForURLContainsAndCapture(int timeout, String urlFraction) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
			String urlofpage = driver.getCurrentUrl();
			return urlofpage;
		}
		else {
			System.out.println("The url is not present within the given timeout:"+timeout);
			return null;
		}

	}
	
	public static String waitForURLToBeAndCapture(int timeout, String url) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.urlToBe(url))) {
			String urlofpage = driver.getCurrentUrl();
			return urlofpage;
		}
		else {
			System.out.println("The url is not present within the given timeout:"+timeout);
			return null;
		}

	}

}
