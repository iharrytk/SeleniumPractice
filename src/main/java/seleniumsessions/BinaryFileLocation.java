package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.manager.SeleniumManager;

public class BinaryFileLocation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		//String binaryfilepath=SeleniumManager.getInstance().getDriverPath("chromedriver");
		//System.out.println(binaryfilepath);
		driver.quit();

	}

}
