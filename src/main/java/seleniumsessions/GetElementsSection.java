package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsSection {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By rightPanelLinksList = By.className("list-group-item");
		By footerlinks=By.xpath("//footer//a");

		// Generic Method
		doClickElementFromPageSection(rightPanelLinksList, "Forgotten Password");
		doClickElementFromPageSection(footerlinks, "Contact Us");

		// Hard Coded
		List<WebElement> rightpanellinks = getElements(rightPanelLinksList);
		for (WebElement e : rightpanellinks) {
			String s = e.getText();
			if (s.contains("Forgotten Password")) {
				e.click();
				break;
			}

		}

	}

	public static void doClickElementFromPageSection(By locator, String eleText) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement webElement : eleList) {
			String eleValue = webElement.getText();
			if (eleValue.equals(eleText)) {
				System.out.println("the link to be clicked is:" + eleValue);
				webElement.click();
				break;
			}
		}
	}

	public static List<String> getElementsTextList(By locator) {
		List<WebElement> elementsList = getElements(locator);
		List<String> elesTextList = new ArrayList<String>();
		for (WebElement webElement : elementsList) {
			String linkText = webElement.getText();
			// System.out.println(linkText);
			elesTextList.add(linkText);

		}
		return elesTextList;

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}

//after line 19
//List<WebElement> rightPanelLinks = driver.findElements(rightPanelLinksList);
//System.out.println("Total number of right panel links:" + rightPanelLinks.size());
//for (WebElement e : rightPanelLinks) {
//	System.out.println(e.getText());
//}
//
//System.out.println("=================================");

//after line 33:
//// looping through the elements in rightpanellinkslist and printing
//for (String string : rightpanellinkslist) {
//	System.out.println(string);
//
//}
//// validating if the Register link is present in rightpanellinkslist
//if (rightpanellinkslist.contains("Register")) {
//	System.out.println("TEST PASS");
//} else {
//	System.out.println("TEST FAIL");
//}
//
//// validating if rightpanellinkslist has 13 links
//if (rightpanellinkslist.size() == 13) {
//	System.out.println("TEST PASS");
//} else {
//	System.out.println("TEST FAIL");
//}

// driver.quit();
