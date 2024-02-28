package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidXPathConcept {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By invalidlocator=By.xpath("//input[@type===='text' and @id=''''input-firstname']");
		
		driver.findElement(invalidlocator).sendKeys("haritha");
		

	}

}
