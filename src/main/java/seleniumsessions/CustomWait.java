package seleniumsessions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Thread.sleep(3000);

		By twitterLink = By.xpath("//a[contains(@href,'twitter')]");
		ElementUtil eutil=new ElementUtil(driver);
		eutil.retryElement(twitterLink, 20,2000).click();

	}

	public static WebElement retryElement(By locator, int timeout) {

		WebElement element = null;
		int retry = 0;

		while (retry < timeout) {
			try {
				element = getElement(locator);
				System.out.println("The element using locator " + locator + " has been found in attempt " + retry);
				break;
			} catch (NoSuchElementException e) {
				System.out.println(" The element using the " + locator + " is not found...in attempt " + retry);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

			}

			retry++;
		}
		if (element == null) {
			System.out.println(
					"..element not found ...tried for " + timeout + " seconds,with poliing time of 500 milli seconds");
		}

		return element;

	}
	
	public static WebElement retryElement(By locator, int timeout,int pollingtime) {

		WebElement element = null;
		int retry = 0;

		while (retry < timeout) {
			try {
				element = getElement(locator);
				System.out.println("The element using locator " + locator + " has been found in attempt " + retry);
				break;
			} catch (NoSuchElementException e) {
				System.out.println(" The element using the " + locator + " is not found...in attempt " + retry);
				try {
					Thread.sleep(pollingtime);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

			}

			retry++;
		}
		if (element == null) {
			System.out.println(
					"..element not found ...tried for " + timeout + " seconds,with poliing time of "+pollingtime+" milli seconds");
		}

		return element;

	}

	

}
