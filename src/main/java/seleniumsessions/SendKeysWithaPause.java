package seleniumsessions;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithaPause {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		WebElement login_email = driver.findElement(By.id("input-email"));
		Actions ac=new Actions(driver);
		
		String email="haritha@gmail.com";
		char[] a=email.toCharArray();
		
		for(char e:a) {
			ac.sendKeys(login_email,String.valueOf(e)).pause(500).build().perform();
		}
		

	}

}
