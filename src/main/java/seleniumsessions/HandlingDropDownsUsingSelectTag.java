package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownsUsingSelectTag {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		By countrySelectTag=By.id("Form_getForm_Country");
		WebElement countrylist=driver.findElement(countrySelectTag);
		
		Select sc=new Select(countrylist);
		
		sc.selectByValue("United States");
		sc.selectByVisibleText("United States");
		sc.selectByIndex(7);
		
		
		
		
		
		
		//driver.quit();	
		

	}

}
