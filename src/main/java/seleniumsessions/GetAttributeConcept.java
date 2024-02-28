package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		//By firstname = By.id("input-firstname");
		By registerlink = By.linkText("Register");

//		String placeHolderValue = driver.findElement(firstname).getAttribute("placeholder");
//		System.out.println(placeHolderValue);

		String registerLink = doGetAttributeValue(registerlink, "href");
		System.out.println(registerLink);

		driver.quit();
	}

	public static String doGetAttributeValue(By locator, String attrName) {

		return getElement(locator).getAttribute(attrName);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
