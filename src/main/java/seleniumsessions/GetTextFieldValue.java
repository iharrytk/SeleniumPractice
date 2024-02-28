package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstname = By.id("input-firstname");

		WebElement element = driver.findElement(firstname);
		element.sendKeys("haritha");

		String firstnamereturn = element.getAttribute("value");
		System.out.println(firstnamereturn);
		
		

		driver.quit();

	}

	public static String doGetAttributeValue(By locator, String attrName) {

		return getElement(locator).getAttribute(attrName);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
