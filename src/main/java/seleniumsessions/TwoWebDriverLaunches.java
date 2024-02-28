package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWebDriverLaunches {

	public static void main(String[] args) {
		// 2 driver objects in heap
		// 2 browsers are getting launched
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();

		driver.get("https://www.google.com/");
		String s1 = driver.getTitle();
		System.out.println("the title of driver object is :" + s1);
		driver1.get("https://www.amazon.com/");
		String s2 = driver1.getTitle();
		System.out.println("the title of driver1 object is :" + s2);

		driver = driver1;
		System.out.println(driver.getTitle());

		// amazon page session gets closed.
		// google page session remains unclosed because the reference is driver
		// which got pointed to driver1 which is amazon.
		driver.quit();
		// driver1.quit();

	}

}
