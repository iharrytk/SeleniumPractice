package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartPageTest {

	public static void main(String[] args) {

		// Let us test the Opencart Page with BrowserUtil and ElementUtil

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initBrowser("chrome");

		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String pagetitle = brUtil.getPageTitle();
		System.out.println("The page title is :" + pagetitle);
		String pageurl = brUtil.getPageURL();
		System.out.println("The page url is :" + pageurl);

		Verify.containValues(pagetitle, "opencart");
		Verify.containValues(pageurl, "opencart");

		ElementUtil eutil = new ElementUtil(driver);
		By email = By.id("input-email");
		By pwd = By.id("input-password");

		eutil.doSendKeys(email, null);
		eutil.doSendKeys(pwd, "haritha");

		// eutil.doClear(email);
		System.out.println("The initial emailid has been cleared");
		eutil.doSendKeys(email, "admin.gmail.com");
		System.out.println("admin details has been reentered");

		brUtil.quitBrowser();

	}

}
