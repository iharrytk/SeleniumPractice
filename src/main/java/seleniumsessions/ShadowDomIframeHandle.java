package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomIframeHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom%20in%20iframe/");
		driver.manage().window().maximize();
		driver.switchTo().frame("pact");
		String tealove="return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement tea = (WebElement) js.executeScript(tealove);
		tea.sendKeys("yes");

	}

}
