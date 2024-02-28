package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/ ");
		driver.manage().window().maximize();
		Thread.sleep(6000);

		By parentMenu = By.xpath("(//span[contains(@class,'CategoryMenu___StyledLabel-sc-d3svbp-1')])[2]");
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(parentMenu)).click().build().perform();
		Thread.sleep(3000);
		WebElement child1 = driver.findElement(By.linkText("Beverages"));
		ac.moveToElement(child1).build().perform();
		
		
		Thread.sleep(3000);
		WebElement child2 = driver.findElement(By.linkText("Tea"));
		ac.moveToElement(child2).build().perform();
		
		Thread.sleep(3000);
		WebElement child3 = driver.findElement(By.linkText("Tea Bags"));
		child3.click();

	}

}
