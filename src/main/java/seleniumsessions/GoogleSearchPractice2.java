package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPractice2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// Initializing and Launching the URL:
		BrowserUtilPractice brutil = new BrowserUtilPractice();
		driver = brutil.initDriver("chrome");
		driver.manage().window().maximize();
		brutil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		ElementUtilPractice eutil = new ElementUtilPractice(driver);
		By searchTextBox = By.id("APjFqb");
		// By searchList=By.xpath("//div[@class='wM6W7d WggQGd']//span");
		// By searchList=By.xpath("//div[@id='Alh6id']//div[@class='wM6W7d']");
		By searchList = By.xpath("//div[contains(@class,'wM6W7d')]");
		//search(searchTextBox, "naveen automation labs", "naveen automation labs youtube", searchList);
		By topLinkMyAccount=By.xpath("//div[@id='top-links']//li[@class='dropdown']");
		driver.findElement(topLinkMyAccount).click();
		By registerLink=By.xpath("//div[@id='top-links']//li[@class='dropdown open']//a[text()='Register']");
		driver.findElement(registerLink).click();

	}

	public static void search(By searchTextBox, String enterText, String searchText, By searchList)
			throws InterruptedException {
		driver.findElement(searchTextBox).sendKeys(enterText);
		Thread.sleep(5000);
		List<WebElement> searchListt = driver.findElements(searchList);
		System.out.println("The search list size is:" + searchListt.size());
		if (searchListt.size() > 0) {
			for (WebElement webElement : searchListt) {
				String s = webElement.getText();
				if (s.length() > 0) {
					if (s.equals(searchText)) {
						webElement.click();
						break;
					}

				}
				else {
					System.out.println("The searchText is either empty or blank");
				}
			}
		} else {
			System.out.println("The search list that came for the enteredText:"+enterText+" is empty");
		}

	}

}
