package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiLevelMenuHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		
//		WebElement parent = driver
//				.findElement(By.xpath("(//span[contains(@class,'CategoryMenu___StyledLabel-sc-d3svbp-1')])[2]"));
//		parent.click();
//		Thread.sleep(3000);
//
//		WebElement level2 = driver.findElement(By.linkText("Beverages"));
//		Actions ac = new Actions(driver);
//		ac.moveToElement(level2).build().perform();
//		Thread.sleep(3000);
//
//		WebElement level3 = driver.findElement(By.linkText("Tea"));
//		ac.moveToElement(level3).build().perform();
//		Thread.sleep(3000);
//
//		driver.findElement(By.linkText("Tea Bags")).click();
		By parentlocator=By.xpath("(//span[contains(@class,'CategoryMenu___StyledLabel-sc-d3svbp-1')])[2]");
		//multiLevelMenuHandle(parentlocator, "Bakery, Cakes & Dairy", "Dairy", "Curd");
		ElementUtil eutil=new ElementUtil(driver);
		eutil.multiLevelMenuHandle(parentlocator, "Foodgrains, Oil & Masala", "Dry Fruits", "Almonds");
		
		

	}

	public static void multiLevelMenuHandle(By parentMenu, String level2, String level3, String level4) throws InterruptedException {
		WebElement parent = driver.findElement(parentMenu);
		parent.click();
		Thread.sleep(3000);

		WebElement level2element = driver.findElement(By.linkText(level2));
		Actions ac = new Actions(driver);
		ac.moveToElement(level2element).build().perform();
		Thread.sleep(3000);

		WebElement level3element = driver.findElement(By.linkText(level3));
		ac.moveToElement(level3element).build().perform();
		Thread.sleep(3000);

		driver.findElement(By.linkText(level4)).click();
		Thread.sleep(3000);
	}

}
