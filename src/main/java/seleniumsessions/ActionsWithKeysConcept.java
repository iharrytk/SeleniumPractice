package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithKeysConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		By firstname=By.id("input-firstname");
		Actions ac=new Actions(driver);
		
		ac.sendKeys(driver.findElement(firstname), "hari").
			pause(2000).
			sendKeys(Keys.TAB).
			sendKeys("Hegde").
			pause(2000).
			sendKeys(Keys.TAB).
			sendKeys("Hegde@gmail.com").
			pause(2000).
			sendKeys(Keys.TAB).
			sendKeys("9547895412").
			pause(2000).
			sendKeys(Keys.TAB).
			sendKeys("Hegde@123").
			pause(2000).
			sendKeys(Keys.TAB).
			sendKeys("Hegde@123").
			pause(2000).
			sendKeys(Keys.TAB).
			pause(2000).
			sendKeys(Keys.TAB).
			pause(2000).
			sendKeys(Keys.TAB).click().
			pause(2000).
			sendKeys(Keys.TAB).click().build().perform();
					
		

	}

}
