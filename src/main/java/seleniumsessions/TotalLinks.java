package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		By totalLinks = By.tagName("a");
		List<WebElement> totallinks = driver.findElements(totalLinks);
		int TotalLinks = totallinks.size();
		System.out.println("Total number of links on Amazon HomePage:" + TotalLinks);
		int count = 0;
		for (WebElement webElement : totallinks) {
			String linkTextValue = webElement.getText();
			
			if (linkTextValue.length() > 0) {

				System.out.println(count + "=" + linkTextValue);
				count++;
			}
		}
		driver.quit();
	}

}

//for (WebElement webElement : totallinks) {
//String linkText = webElement.getAttribute("href");
//System.out.println(linkText);
//
//}

//for (int i = 0; i < TotalLinks; i++) {
//	String linkTextvalue = totallinks.get(i).getText();
//	if (linkTextvalue.length() > 0) {
//		System.out.println(i + "=" + linkTextvalue);
//	}
//}
