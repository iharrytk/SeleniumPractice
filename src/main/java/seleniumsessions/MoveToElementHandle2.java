package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementHandle2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		driver.manage().window().maximize();

		By parentMenu = By.className("menulink");
		By childMenu = By.linkText("COURSES");

//		Actions ac = new Actions(driver);
//		ac.moveToElement(driver.findElement(parentMenu)).build().perform();
//		driver.findElement(childMenu).click();
		
		//handleTwoLevelMenu(parentMenu, childMenu);
		//handleTwoLevelMenu(parentMenu, "COURSES");
		ElementUtil eutil=new ElementUtil(driver);
		eutil.handleTwoLevelMenu(parentMenu, childMenu);
		eutil.handleTwoLevelMenu(parentMenu, "COURSES");

	}

	public static void handleTwoLevelMenu(By parentMenu, By childMenu) throws InterruptedException {
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(parentMenu)).build().perform();
		Thread.sleep(4000);
		driver.findElement(childMenu).click();

	}
	
	public static void handleTwoLevelMenu(By parentMenu, String childMenuText) throws InterruptedException {
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(parentMenu)).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText(childMenuText)).click();

	}
	

}
