package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println("The title is:"+title+ "\n" + "The url is:"+url);
		driver.quit();
		

	}

}
