package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();

//		//1st way of creating WebElements and performing action
//		driver.findElement(By.id("input-email")).sendKeys("haritha@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("haritha");
//		
//		
//		//2nd way of creating WebElements and performing action
//		WebElement emailid=driver.findElement(By.id("input-email"));
//		WebElement password=driver.findElement(By.id("input-password"));
//		emailid.sendKeys("haritha@gmail.com");
//		password.sendKeys("haritha");
//		
//		//3rd way of creating WebElements and performing action
//		
//		By email=By.id("input-email");
//		By pwd=By.id("input-password");
//		
//		WebElement emailId=driver.findElement(email);
//		WebElement passwordd=driver.findElement(pwd);
//		
//		emailId.sendKeys("haritha@gmail.com");
//		passwordd.sendKeys("haritha");

//		//4th way of creating WebElements and performing action
//		
//		By email=By.id("input-email");
//		By pwd=By.id("input-password");
//		
//		WebElement emailId=getElement(email);
//		WebElement password=getElement(pwd);
//		
//		emailId.sendKeys("haritha@gmail.com");
//		password.sendKeys("haritha");

//		// 5th way of creating WebElements and performing action
//
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//
//		doSendKeys(email, "haritha@gmail.com");
//		doSendKeys(pwd, "haritha");

		// 6th way of creating WebElements and performing action

		By email = By.id("input-email");
		By pwd = By.id("input-password");

		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys(email, "haritha@gmail.com");
		eutil.doSendKeys(pwd, "haritha");

		driver.quit();

	}

//	public static WebElement getElement(By locator) {
//
//		return driver.findElement(locator);
//
//	}
//
//	public static void doSendKeys(By locator, String value) {
//
//		getElement(locator).sendKeys(value);
//
//	}

}
