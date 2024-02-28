package seleniumsessions;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindElementandFindElementsException {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By search = By.name("search");
		ElementUtil eutil=new ElementUtil(driver);
		
		if(eutil.IsElementDisplayed(search)) {
			driver.findElement(search).sendKeys("macbook");
		}
		else {
			System.out.println(search+ " Element is not displayed");
		}
	}
//	public static boolean IsElementDisplayed(By locator) {
//		List<WebElement> eleList = driver.findElements(locator);
//		if (eleList.size() > 0) {
//			System.out.println(locator+ " Element is present on the page");
//			return true;
//		} else {
//			return false;
//		}
//	}

}

//after line 12
//NoSuchElementException if element not found in driver.findElement
//driver.findElement(search).sendKeys("macbook");
//driver.quit();

// size is zero,if element not found in driver.findElements().
// It does not throw a NoSuchElementException.
//By panelList = By.className("list-group-item11");
//List<WebElement> paneList = driver.findElements(panelList);
//System.out.println(paneList.size());
