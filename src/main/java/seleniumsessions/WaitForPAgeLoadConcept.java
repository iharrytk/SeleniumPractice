package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPAgeLoadConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		ElementUtil eutil = new ElementUtil(driver);
		if (eutil.isPageLoaded()) {
			System.out.println("The page has been loaded successfully and ready to interact");
			By linkedInLocator = By.linkText("Features");
			driver.findElement(linkedInLocator).click();
		}
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(linkedInLocator));
//		element.click();

	}

}
