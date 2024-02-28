package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesConcept {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		driver.manage().window().maximize();
		
		

	}

}
