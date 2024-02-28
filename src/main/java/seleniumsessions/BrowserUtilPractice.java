package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtilPractice {
	WebDriver driver;

	public WebDriver initDriver(String browser) {
		if (browser == null) {
			throw new MySeleniumException("BROWSERNULLEXCEPTION");
		}
		System.out.println("The browser that is being launched is:" + browser);
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please enter a valid browser.The value entered is:" + browser);
			throw new MySeleniumException("BROWSERINVALIDEXCEPTION");
		}

		return driver;

	}

	public void launchURL(String URL) {
		if (URL == null) {
			System.out.println("URL cannot be null");
			throw new MySeleniumException("URLNULLEXCEPTION");
		}
		if (URL.contains("https")) {
			driver.get(URL);
		}
		else {
			System.out.println("https is missing");
		}

	}
	
	public void launchURL(URL url) {
		if (url == null) {
			System.out.println("URL cannot be null");
			throw new MySeleniumException("URLNULLEXCEPTION");
		}
		
		String urlvalue=String.valueOf(url);
		
		if(urlvalue.contains("https")) {
			driver.navigate().to(url);
		}
		else {
			System.out.println("https is missing");
		}
		
		
	}

	public String getTitlePage() {
		return driver.getTitle();
	}

	public void driverClose() {
		driver.close();
	}

	public void driverQuit() {
		driver.quit();
	}

}
