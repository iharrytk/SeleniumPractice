package seleniumsessions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.manager.SeleniumManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//Automation Testing= Automation Steps+Verification Point

		// Automation Steps:
		WebDriver driver = new ChromeDriver();// Launch the browser
		// The above line-Top Casting concept-Supports Cross Browser testing
		// ChromeDriver driver=new ChromeDriver();
		// the above does not support Cross Browser testing
		driver.get("https://www.amazon.com/");// Enter the URL
		String title = driver.getTitle();// Get the title
		System.out.println(title);// Printing the title on our Console.
		String url=driver.getCurrentUrl();
		System.out.println("Current URL:"+url);

		// Verification Point:
		if (title.contains("Amazon.com")) {
			System.out.println("TC1: Verify the title has amazon: PASS");

		} else {
			System.out.println("TC1: Verify the title has amazon: FAIL");
		}
		
		//String binaryfilepath=SeleniumManager.getInstance().getDriverPath("chromedriver");
		//System.out.println(binaryfilepath);
		driver.quit();//Will close the browser
		//driver.close();//will close the browser-Chrome.exe runs in the background

	}
}
