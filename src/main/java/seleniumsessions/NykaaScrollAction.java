package seleniumsessions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaaScrollAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Actions ac=new Actions(driver);
//		ac.sendKeys(Keys.PAGE_DOWN).
//		sendKeys(Keys.PAGE_DOWN).
//		sendKeys(Keys.PAGE_DOWN).
//		sendKeys(Keys.PAGE_DOWN).
//		sendKeys(Keys.PAGE_DOWN).build().perform();
		
//		ac.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
//		Thread.sleep(3000);
//		
//		ac.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
//		
		ac.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();

	}

}
