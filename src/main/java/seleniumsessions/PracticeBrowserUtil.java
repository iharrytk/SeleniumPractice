package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeBrowserUtil {

	WebDriver driver;

	public static void main(String[] args) {
		// Launch the browser and Utilities object creation
		BrowserUtilPractice br = new BrowserUtilPractice();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();
		ElementUtilPractice eutil = new ElementUtilPractice(driver);
		br.launchURL("https://www.google.com");

		//
		// Locators:
		By googletextarea = By.xpath("//textarea[@name='q']");
		By googlesearchbutton = By.xpath("(//input[@value='Google Search' ])[1]");

		// Print the title of the page
		String title = br.getTitlePage();
		System.out.println("The title of the page is:" + title);

		// Enter "naveenautomationlabs" in Google search text field
		eutil.doSendKeys("naveenautomationlabs", googletextarea);
		// eutil.doClick(googlesearchbutton);

		// Quit the browser
		// br.driverQuit();

	}

}
