package seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementsConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By footer = By.xpath("//footer//a");
		By forgotpassword=By.linkText("Forgotten Password");
		
		ElementUtil eutil=new ElementUtil(driver);
		List<WebElement> footerlist=eutil.waitForElementsVisibility(footer, 10);
		//List<WebElement> footerlist=waitForElementsVisibility(footer, 10);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		List<WebElement> footerlist = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));
		System.out.println("The footer size is:" + footerlist.size());
		
		//eutil.clickElementWhenReady(forgotpassword, 10);
		eutil.doClick(forgotpassword, 10);

	}

	public static List<WebElement> waitForElementsVisibility(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}

}
