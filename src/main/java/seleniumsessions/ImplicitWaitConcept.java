package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {

		//WebDriver driver=new ChromeDriver();
		//Selenium3-deprecated dont use
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Selenium 4x-plz use
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
