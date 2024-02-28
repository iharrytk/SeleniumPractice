package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

//		Actions ac = new Actions(driver);
//		WebElement rightclk = driver.findElement(By.xpath("//span[text()='right click me']"));
//		WebElement cutoption = driver.findElement(By.xpath("//span[text()='Cut']"));
//		ac.contextClick(rightclk).moveToElement(cutoption).click().build().perform();
//
//		Alert alertHandle = driver.switchTo().alert();
//		String cutText = alertHandle.getText();
//		System.out.println("The alert contains the text:"+cutText);
//		if (cutText.contains("clicked: cut")) {
//			System.out.println("TC-1-PASS:The cut option is displayed as expected");
//		} else {
//			System.out.println("TC-1-FAIL:The cut option is not displayed as expected");
//
//		}
//		alertHandle.accept();
		By rightelemnt=By.xpath("//span[text()='right click me']");
		ElementUtil eutil=new ElementUtil(driver);
		eutil.doContextClick(rightelemnt);
		

	}
	
	public static void doContextClick(By locator) {
		Actions ac=new Actions(driver);
		ac.contextClick(driver.findElement(locator)).build().perform();
	}
	

}
