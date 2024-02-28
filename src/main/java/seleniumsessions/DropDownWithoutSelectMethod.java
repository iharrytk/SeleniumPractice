package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutSelectMethod {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		ElementUtil eutil=new ElementUtil(driver);

		By countrySelectTag = By.id("Form_getForm_Country");

		// HardCode:
//		WebElement countrylist = driver.findElement(countrySelectTag);
//
//		Select sc = new Select(countrylist);
//
//		List<WebElement> countryoptions = sc.getOptions();
//		System.out.println("The number of countries present: " + (countryoptions.size() - 1));
//		for (WebElement e : countryoptions) {
//			System.out.println(e.getText());
//		}

		// verifying getAllDropDownOptions
		List<String> countrieslist = eutil.getAllDropDownOptions(countrySelectTag);
		System.out.println(countrieslist.contains("India"));
		System.out.println(countrieslist.contains("Brazil"));

		// verifying getDropDownValueCount
		System.out.println("The total number of countries is:" + (eutil.getDropDownValueCount(countrySelectTag) - 1));
		
		// verifying doSelectDropDownValue
		eutil.doSelectDropDownValue(countrySelectTag, "abc");

		//driver.quit();

	}

	public static List<String> getAllDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionslist = select.getOptions();
		List<String> options = new ArrayList<String>();
		for (WebElement e : optionslist) {
			String option = e.getText();
			options.add(option);
		}
		return options;

	}

	public static int getDropDownValueCount(By locator) {
		return getAllDropDownOptions(locator).size();
	}

	public static boolean doSelectDropDownValue(By locator, String dropDownValue) {
		boolean flag=false;
		Select select = new Select(getElement(locator));
		List<WebElement> optionslist = select.getOptions();
		for (WebElement e : optionslist) {
			String text = e.getText();
			if (text.equals(dropDownValue)) {
				flag=true;
				e.click();
				break;
			}
			

		}
		if(flag==false) {
			System.out.println(dropDownValue + " is not present in the drop down " +locator);
		}
		return flag;

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
