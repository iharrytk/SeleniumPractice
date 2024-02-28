package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {

	public static void main(String[] args) throws InterruptedException {

		// Browser Level Validation
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initBrowser("chrome");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String titlepage = brUtil.getPageTitle();
		String PageURL = brUtil.getPageURL();

		System.out.println("The page title is: " + titlepage);
		System.out.println("The page url is: " + PageURL);

		Verify.containValues(titlepage, "register");
		Verify.containValues(PageURL, "register");

		// By Locators
		By register=By.linkText("Register");
		By firstname = By.name("firstname");
		By lastname = By.name("lastname");
		By privacycheck = By.name("agree");
		//By firstnamee = By.className("form-control");
		By email=By.xpath("//*[@id=\"input-email\"]");
		By telephone=By.xpath("//*[@id=\"input-telephone\"]");
		By continuebtn=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By pwd=By.cssSelector("#input-password");
		By retype_pwd=By.cssSelector("#input-confirm");
		By registerheading=By.tagName("h1");
		
		
		
		

//		driver.findElement(firstname).sendKeys("haritha");
//		driver.findElement(lastname).sendKeys("tk");
//		driver.findElement(privacycheck).click();
		
		//Register page validation

		ElementUtil eutil = new ElementUtil(driver);
		eutil.doClick(register);
		Thread.sleep(5000);
		String pageText=eutil.doGetElementText(registerheading);
		Verify.containValues(pageText, "register");

		eutil.doSendKeys(firstname, "harithaa");
		eutil.doSendKeys(lastname, "tkk");
		eutil.doSendKeys(email, "harithaa@gmail.com");
		eutil.doSendKeys(telephone, "9874563215");
		eutil.doSendKeys(pwd, "harithaa");
		eutil.doSendKeys(retype_pwd, "harithaa");
		eutil.doClick(privacycheck);
		eutil.doClick(continuebtn);
		
		
		

		brUtil.quitBrowser();

	}

}
