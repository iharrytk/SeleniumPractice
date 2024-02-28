package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDropDownOne {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");

		By country = By.id("Form_getForm_Country");
		//dropDownByVisibleText(country, "United States");
		//dropDownByValue(country, "United States");
		//dropDownByIndex(country, 7);

	}

	public static void dropDownByVisibleText(By locator, String visibleText) {
		WebElement countrydropdown = driver.findElement(locator);
		Select obj1 = new Select(countrydropdown);
		obj1.selectByVisibleText(visibleText);

	}

	public static void dropDownByValue(By locator, String value) {
		WebElement countrydropdown = driver.findElement(locator);
		Select obj1 = new Select(countrydropdown);
		obj1.selectByValue(value);

	}

	public static void dropDownByIndex(By locator, int index) {
		WebElement countrydropdown = driver.findElement(locator);
		Select obj1 = new Select(countrydropdown);
		obj1.selectByIndex(index);

	}

}
