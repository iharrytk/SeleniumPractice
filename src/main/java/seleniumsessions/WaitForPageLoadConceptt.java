package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageLoadConceptt {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		if(isPageLoad()) {
			System.out.println("Page has been loaded successfully");
		}
		
		//waitForPageLoad(20);
//		By featuresLink=By.linkText("Features");
//		driver.findElement(featuresLink).click();

	}
	
	public static void waitForPageLoad(int timeout) {
		
		long endtime=System.currentTimeMillis()+ timeout;
		while (System.currentTimeMillis()<endtime) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			String pageState=js.executeScript("return document.readyState").toString();
			if(pageState.equals("complete")) {
				System.out.println("Page DOM is fully loaded now...");
			}
			else {
				System.out.println("Page is not loaded..."+pageState);
			}
		}
		
		
	}
	
	public static Boolean isPageLoad() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		String flag=wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == \'complete\'")).toString();
		return Boolean.parseBoolean(flag);
	}

}
