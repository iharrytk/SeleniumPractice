package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementHandle {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		driver.manage().window().maximize();
//		WebElement elementContent = driver.findElement(By.xpath("//span[@id='headermenudesktop']/ul/li/a"));
//		Actions ac = new Actions(driver);
//		ac.moveToElement(elementContent).build().perform();
		By elemcontent = By.xpath("//span[@id='headermenudesktop']/ul/li/a");
		ElementUtil eutil=new ElementUtil(driver);
		eutil.doMoveToElement(elemcontent);
		List<WebElement> elements = driver.findElements(By.cssSelector("span#headermenudesktop li a"));
		for (WebElement webElement : elements) {
			String text = webElement.getText();
			System.out.println("The option is:" + text);
			if (text.contains("COURSES")) {
				webElement.click();
				break;
			}
		}

		
	}

	public static void doMoveToElement(By locator) {

		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(locator)).build().perform();

	}

}
