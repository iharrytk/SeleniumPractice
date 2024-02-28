package seleniumsessions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTabbingSequence {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.TAB).
			sendKeys(Keys.TAB).
			sendKeys(Keys.TAB).
			sendKeys(Keys.TAB).
			sendKeys(Keys.TAB).sendKeys("MacBook Pro").build().perform();
			
		

	}

}
