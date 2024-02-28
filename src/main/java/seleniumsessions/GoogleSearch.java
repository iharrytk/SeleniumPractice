package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		By searchbox = By.id("APjFqb");
		By searchText = By.xpath("//div[contains(@class,'wM6W7d')]/span");
		ElementUtil eutil=new ElementUtil(driver);
		
		eutil.search(searchbox, "dwdwdwdwdwdwdwdw", searchText, "youtube");
		driver.quit();

//		driver.findElement(searchbox).sendKeys("Selenium");
//		Thread.sleep(5000);

//		List<WebElement> searchList = driver.findElements(searchText);
//		for (WebElement webElement : searchList) {
//			String searchtext = webElement.getText();
//
//			if (searchtext.equals("selenium benefits")) {
//				webElement.click();
//				break;
//			}
//
//		}

	}

	public static void search(By searchLocator, String searchText, By suggestionLocator, String suggestionString)
			throws InterruptedException {

		driver.findElement(searchLocator).sendKeys(searchText);
		Thread.sleep(5000);
		List<WebElement> searchList = driver.findElements(suggestionLocator);
		int searchResults = searchList.size();
		System.out.println("Number of Search Results:" + searchResults);
		int count=1;
		if (searchResults > 0) {
			for (WebElement webElement : searchList) {
				String searchtext = webElement.getText();
				if (searchtext.length() > 0) {
					System.out.println(count+"="+searchtext);
					count++;
					if (searchtext.contains(suggestionString)) {
						webElement.click();
						break;
					}

				} else {
					System.out.println("The Results have either Blank Suggestions or No Suggestion Results");
					break;
				}

			}

		}
		else {
			System.out.println("No Search suggestions");
		}

	}

}
