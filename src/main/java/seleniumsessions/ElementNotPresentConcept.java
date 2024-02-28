package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotPresentConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// NoSuchElementException
		// ElementNotFoundException Incorrect-does not exist.
		By emailid = By.id("input-email1");
		getElement(emailid);
	}

	public static WebElement getElement(By locator) {
		WebElement element = null;
		try {
			driver.findElement(locator);
			System.out.println("Element  found using the given locator:" + locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element not found using the given locator:" + locator);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			element = driver.findElement(locator);
		}
		return element;

	}

}
