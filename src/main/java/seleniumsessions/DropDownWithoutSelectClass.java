package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");

		ElementUtil eutil = new ElementUtil(driver);

		By countrySelectTag = By.xpath("//select[@id='Form_getForm_Country']/option");
		eutil.doSelectValueFromDropDownWithoutSelect(countrySelectTag, "United States");

	}

	public static boolean doSelectValueFromDropDownWithoutSelect(By locator, String value) {
		boolean flag = false;
		List<WebElement> optionsList = getElements(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(value)) {
				flag = true;
				e.click();
				break;
			}

		}
		if (flag == false) {
			System.out.println(value + " option is not present in the locator " + locator);
		}
		return flag;
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
