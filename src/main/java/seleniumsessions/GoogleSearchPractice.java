package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPractice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		By searchBar = By.id("APjFqb");
		By suggestions = By.xpath("//div[contains(@class,'wM6W7d')]/span");
		search(searchBar, "Naveen Automation Labs", suggestions, "naveen automation labs youtube");
		//search(searchBar, "dwdwdwdwdwdw", suggestions, "naveen automation labs youtube");

		//driver.quit();

	}

	public static void search(By searchBox, String searchText, By suggestionpanel, String clickText)
			throws InterruptedException {

		driver.findElement(searchBox).sendKeys(searchText);
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(suggestionpanel);
		int suggestionSize = suggestions.size();
		System.out.println("The size of suggestionlist is: " + suggestionSize);
		if (suggestionSize > 0) {
			for (WebElement e : suggestions) {
				String t = e.getText();
				if (t.length() > 0) {
					if (t.contains(clickText)) {
						e.click();
						break;
					}
				}
				else {
					System.out.println("The suggestion is either blank or no suggestions results");
				}

			}
		} else {
			System.out.println("No suggestions for the entered text : " + searchText);
		}

	}

}
