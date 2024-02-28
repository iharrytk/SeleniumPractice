package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://demo.1crmcloud.com/login.php");
		
		By language=By.id("login_lang");
		By theme=By.id("login_theme");
		
		ElementUtil eutil=new ElementUtil(driver);
//		eutil.doSelectDropDownByIndex(language,1);	
//		eutil.doSelectDropDownByIndex(theme,0);
		
//		eutil.doSelectDropDownByValueAttribute(language, "es_ES");
//		eutil.doSelectDropDownByValueAttribute(theme, "Claro");
		
		eutil.doSelectDropDownByVisibleText(language, "IT Italiano");
		eutil.doSelectDropDownByVisibleText(theme, "Spectrum Theme");

	}
	public static void doSelectDropDownByIndex(By locator,int index) {
		
		Select sc=new Select(getElement(locator));
		sc.selectByIndex(index);
	}
	
	public static void doSelectDropDownByValueAttribute(By locator,String value) {
		Select sc=new Select(getElement(locator));
		sc.selectByValue(value);
	}
	
	public static void doSelectDropDownByVisibleText(By locator,String value) {
		Select sc=new Select(getElement(locator));
		sc.selectByVisibleText(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
