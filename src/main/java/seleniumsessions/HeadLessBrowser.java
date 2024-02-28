package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		//co.addArguments("--headless");
		
		co.addArguments("--incognito");
		
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		
		driver.quit();
		
		

	}

}
