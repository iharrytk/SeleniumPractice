package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		By searchbar = By.id("twotabsearchtextbox");
		By searchbtn = By.id("nav-search-submit-button");

		ElementUtil eutil = new ElementUtil(driver);
		Boolean flag = eutil.elementIsDisplayed(searchbar);
		if (flag) {
			eutil.doSendKeys(searchbar, "Sai Baba");
			eutil.doClick(searchbtn);
		} else {
			System.out.println("Search bar is not displayed");
		}
		driver.quit();

	}
	
	

//	public static Boolean elementIsDisplayed(By locator) {
//		return getElement(locator).isDisplayed();
//
//	}
//
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//
//	}
//
//	public static void doSendKeys(By locator, String value) {
//		driver.findElement(locator).sendKeys(value);
//	}
//
//	public static void doClick(By locator) {
//		driver.findElement(locator).click();
//	}

}
