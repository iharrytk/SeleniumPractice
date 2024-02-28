package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		By twitterLink = By.xpath("//a[contains(@href,'twitterr')]");

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class)
				.ignoring(ElementNotInteractableException.class).pollingEvery(Duration.ofMillis(1000))
				.withMessage("..............time out is done........element not found");

		
		WebElement twitterelement = wait.until(ExpectedConditions.visibilityOfElementLocated(twitterLink));

		wait.until(ExpectedConditions.elementToBeClickable(twitterelement)).click();
		
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		wait.ignoring(NoSuchElementException.class)
//			.pollingEvery(Duration.ofSeconds(10))
//			.withMessage(" -----------time out exception---element not found")
//			.until(ExpectedConditions.visibilityOfElementLocated(twitterLink)).click();
		

	}
	
	public static WebElement waitForElementVisibleWithFluentWait(By locator,int timeout,int pollingtime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.ignoring(ElementNotInteractableException.class)
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.withMessage("..............time out is done........element not found");

		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	

}
