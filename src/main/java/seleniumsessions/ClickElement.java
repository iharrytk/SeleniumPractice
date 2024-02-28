package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElement {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		By userid = By.id("username");
		By password = By.id("password");
		By loginbtn = By.id("loginBtn");
		
		doSendKeys(userid, "haritha@gmail.com");
		doSendKeys(password, "haritha");
		doClick(loginbtn);
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
