package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptClickSendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://login.yahoo.com/?.lang=en-US&src=homepage&.done=https%3A%2F%2Fwww.yahoo.com%2F%3Fguccounter%3D1&pspid=2023538075&activity=ybar-signin");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		// 1st way of click -Normal method-driver.findElement(By locator).click
		WebElement ele = driver.findElement(By.id("persistent"));
//		ele.click();

		//// 2nd way of click -Using Actions class
//		Actions ac = new Actions(driver);
//		ac.click(ele);

		// 3rd way of click and sendKeys-Using JavaScript methods
		JavaScriptUtil jutil = new JavaScriptUtil(driver);
		jutil.sendKeysUsingWithId("login-username", "naveen@yahoo.com");
		jutil.clickElementByJS(ele);

	}

}
