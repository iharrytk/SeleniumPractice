package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysClickConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		By userid = By.id("input-email");
		By pwd = By.id("input-password");
		By loginButton = By.xpath("//input[@class ='btn btn-primary']");

//		Actions ac = new Actions(driver);
//		ac.click(driver.findElement(userid)).sendKeys("test@gmail.com").build().perform();
//		ac.click(driver.findElement(pwd)).sendKeys("test@123").build().perform();
//		ac.click(driver.findElement(loginButton)).build().perform();
		
		ElementUtil eutil=new ElementUtil(driver);
		eutil.doActionsSendKeys(userid, "test@gmail.com");
		eutil.doActionsSendKeys(pwd, "test@123");
		eutil.doActionsClick(loginButton);
		

	}

	public static void doActionsClick(By locator) {

		Actions ac = new Actions(driver);
		ac.click(driver.findElement(locator)).build().perform();

	}

	public static void doActionsSendKeys(By locator, String value) {

		Actions ac = new Actions(driver);
		ac.sendKeys(driver.findElement(locator), value).build().perform();

	}

}

