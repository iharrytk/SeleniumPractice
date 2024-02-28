package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By username = By.name("username");
		By password = By.name("password");

//		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(3000));
//		WebElement e1 = ww.until(ExpectedConditions.presenceOfElementLocated(username));
//		e1.sendKeys("haritha@gmail.com");
//
//		WebDriverWait we = new WebDriverWait(driver, Duration.ofSeconds(3000));
//		WebElement e2 = we.until(ExpectedConditions.presenceOfElementLocated(password));
//		e2.sendKeys("haritha");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(username));
//		e.sendKeys("jay@gmail.com");
//
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement e3 = wait1.until(ExpectedConditions.visibilityOfElementLocated(password));
//		e3.sendKeys("Jay");

		ElementUtil eutil=new ElementUtil(driver);
//		WebElement e1=eutil.waitForElementPresence(username, 10);
//		e1.sendKeys("haritha@gmail.com");
//		WebElement e2=eutil.waitForElementPresence(password, 10);
//		e2.sendKeys("haritha");
		
//		eutil.waitForElementVisibility(username, 10).sendKeys("jay@gmail.com");
//		eutil.waitForElementVisibility(password, 10).sendKeys("jay");
		
//		eutil.getElement(username, 10).sendKeys("krish@gmail.com");
//		eutil.getElement(password, 10).sendKeys("krishna");
		
		eutil.getElement(username).sendKeys("SriRam@gmail.com");
		eutil.getElement(password).sendKeys("SriRam");
		
		
		
	}

	public static WebElement waitForElementPresence(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
	

}
