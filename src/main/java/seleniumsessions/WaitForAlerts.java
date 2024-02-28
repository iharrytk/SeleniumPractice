package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlerts {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		By jsalertbutton = By.xpath("//button[text()='Click for JS Prompt']");
		By resulttext=By.id("result");
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(jsalertbutton).click();
//		
//		Alert al=wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println("The text of the alert is:"+al.getText());
//		al.accept();
//		
		// String
		// alertacceptedtext=driver.findElement(By.xpath("//p[@id='result']")).getText();
//		System.out.println(alertacceptedtext);

		ElementUtil eutil = new ElementUtil(driver);
		
		String alertacceptedtext = eutil.alertJSGetText(10);
		System.out.println("The text value of Js Prompt alert is:"+alertacceptedtext);
		eutil.alertEnterValue("Haritha", 10);
		eutil.alertAccept(10);
		String resulttextvalue=driver.findElement(resulttext).getText();
		System.out.println("The result value is"+resulttextvalue);

	}

	public static Alert waitForAlertJSPopUp(int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());

	}

	public static void alertAccept(int timeout) {

		waitForAlertJSPopUp(timeout).accept();

	}
	
	public static void alertDismiss(int timeout) {

		waitForAlertJSPopUp(timeout).dismiss();

	}
	
	public static String alertJSGetText(int timeout) {

		return waitForAlertJSPopUp(timeout).getText();

	}
	
	public static void alertEnterValue(String value,int timeout) {

		waitForAlertJSPopUp(timeout).sendKeys(value);

	}
	

}
