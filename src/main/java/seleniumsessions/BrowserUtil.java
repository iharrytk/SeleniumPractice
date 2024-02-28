package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Date
 * 
 * @author harit
 *
 */
public class BrowserUtil {

	WebDriver driver;// Class variable global

	/**
	 * Initialize the Browser
	 * 
	 * @param browser
	 */
	public WebDriver initBrowser(String browser) {

		if (browser == null) {
			System.out.println("browser cannot be null");
			throw new MySeleniumException("BROWSERNULLEXCEPTION");
		}

		System.out.println("Launching the Browser:" + browser);
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass the right browser");
			throw new MySeleniumException("INCORRECT BROWSER EXCEPTION");
		}
		return driver;
	}

	/**
	 * Launch the Web URL
	 * 
	 * @param url
	 */
	public void launchURL(String url) {
		if (url == null) {
			System.out.println("URL cannot be null");
			throw new MySeleniumException("URLNULLEXCEPTION");

		}
		if (url.contains("https")) {
			driver.get(url);
		} else {
			System.out.println("https is missing");
		}

	}

	public void launchURL(URL url) {
		if (url == null) {
			System.out.println("URL cannot be null");
		}
		String urlvalue = String.valueOf(url);
		if (urlvalue.contains("http")) {
			driver.navigate().to(url);
		}
		else {
			System.out.println("https is missing");
		}

	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

}
