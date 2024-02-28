package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		By imageList = By.tagName("img");
		By linksList = By.tagName("a");

		List<String> anchorTagsLinksList = getElementsAttributeValue(linksList, "href");
		if (anchorTagsLinksList.contains("http://www.opencart.com/")) {
			System.out.println("TEST PASS");
		} else {
			System.out.println("TEST FAIL");
		}
		int linksCount = getElementsCount(linksList);
		System.out.println("Total number of anchor tag href links:"+linksCount);
		
		int imagesCount = getElementsCount(imageList);
		System.out.println("Total number of images"+imagesCount);
		if (imagesCount > 50) {
			System.out.println("TEST PASS");
		} else {
			System.out.println("TEST FAIL");
		}

		driver.quit();

	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<String> getElementsAttributeValue(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> attrValues = new ArrayList<String>();
		int count=0;
		for (WebElement webElement : eleList) {
			String attrValue = webElement.getAttribute(attrName);
			System.out.println(count+"="+attrValue);
			attrValues.add(attrValue);
			count++;

		}
		System.out.println("Total size of attrValues which is List<String> is:"+attrValues.size());
		System.out.println("Total size of eleList which is List<WebElement> is:"+eleList.size());
		return attrValues;
	}

	public static List<WebElement> getElements(By Locator) {
		return driver.findElements(Locator);
	}
}

//List<WebElement> imagesList = driver.findElements(imageList);
//for (WebElement webElement : imagesList) {
//	String altValue = webElement.getAttribute("alt");
//	System.out.println(altValue);
//}
