package seleniumsessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JQueryDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		// Initializing and Launching the URL:
		BrowserUtilPractice brutil = new BrowserUtilPractice();
		driver = brutil.initDriver("chrome");
		driver.manage().window().maximize();
		brutil.launchURL("https://jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		ElementUtilPractice eutil = new ElementUtilPractice(driver);

		// Locators
		By dropdown = By.id("justAnInputBox");
		driver.findElement(dropdown).click();
		By multiselectionDropDown = By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li/span");

		// selectChoice(multiselectionDropDown, "choice 7");
		// selectChoices(multiselectionDropDown, "choice 2 1", "choice 6 2 3", "choice
		// 7","choice 3","choice 1");
		// selectChoices(multiselectionDropDown, "choice 2 2");
		selectChoices(multiselectionDropDown, "all");
		// driver.quit();

	}

	public static void selectChoice(By locator, String value) {
		List<WebElement> dropdownlist = driver.findElements(locator);
		System.out.println("The size of the List of dropdown is:" + dropdownlist.size());
		System.out.println("Below are the dropdown options:");

		for (WebElement webElement : dropdownlist) {
			String optionText = webElement.getText();
			System.out.println("We are now looking at option:" + optionText);
			if (optionText.equals(value)) {
				webElement.click();
				System.out.println("We have selected option:" + value);
				break;
			}

		}

	}

	// variable argument
	public static void selectChoices(By locator, String... values) {
		List<WebElement> dropdownlist = driver.findElements(locator);
		System.out.println("The size of the List of dropdown is:" + dropdownlist.size());
		if (!values[0].equalsIgnoreCase("all")) {
			for (WebElement webElement : dropdownlist) {
				String optionText = webElement.getText();

				// multi selection logic
				for (int i = 0; i < values.length; i++) {
					if (optionText.equals(values[i])) {
						webElement.click();
						System.out.println("The choice that has been selected is:" + values[i]);
						break;
					}
				}

			}
			

		} else {
			for (WebElement webElement : dropdownlist) {
				String we = webElement.getText();
				if (!we.equals("−")) {
					webElement.click();
				}

			}
		}
	}
}