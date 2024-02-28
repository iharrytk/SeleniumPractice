package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropDownHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");

		// single value selection dropdown
		By singleSelect = By.id("select-demo");
		WebElement singleSelectt = driver.findElement(singleSelect);
		Select selectSingle = new Select(singleSelectt);
		boolean singleSelectFlag = selectSingle.isMultiple();
		System.out.println("the isMultiple() flag for single value Select is:"+singleSelectFlag);

		// multiple value selection dropdown
		By multipleSelect = By.name("States");
		WebElement multipleSelectt = driver.findElement(multipleSelect);
		Select selectMultiple = new Select(multipleSelectt);
		boolean multipleSelectFlag = selectMultiple.isMultiple();
		System.out.println("the isMultiple() flag for multiple value Select is:"+multipleSelectFlag);
		
		
		selectMultiple.selectByValue("Washington");
		selectMultiple.selectByValue("Florida");
		selectMultiple.selectByValue("Texas");
		List<WebElement> selectedOptions=selectMultiple.getAllSelectedOptions();
		List<String> list=new ArrayList<String>();
		for(WebElement e:selectedOptions ) {
			String options=e.getText();
			list.add(options);
		}
		
		System.out.println("the selected options are:"+list);
		
		
		driver.quit();
	}

}
