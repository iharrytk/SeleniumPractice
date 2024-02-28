package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountPagePractice {

	public static void main(String[] args) {

		// Initializing and Launching the URL:
		BrowserUtilPractice brutil = new BrowserUtilPractice();
		WebDriver driver = brutil.initDriver("chrome");
		driver.manage().window().maximize();
		brutil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		ElementUtilPractice eutil = new ElementUtilPractice(driver);
		// ==========================================================
		// We have a total of 8 By locators mentioned below:
		// By.id
		// By.name
		// By.classname
		// By.xpath
		// By.cssSelectors
		// By.linkedText
		// By.partialLinkedText
		// By.tagName
		// ============================================================
		// Account Page Locators
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By subscription = By.xpath("(//label[@class='radio-inline'])[1]");
		By privacyPolicy = By.xpath("//input[@type='checkbox' and @name='agree']");
		By continueButton = By.xpath("//input[@type='submit' and @value='Continue']");
		By textAfterRegistration = By.tagName("h1");
		By totalTextLinks = By.tagName("a");
		By totalImageLinks = By.tagName("img");
		By rightPanelRegister = By.xpath("//div[@class='list-group']/a");
		By accountfooterLinks = By.xpath("(//div[@class='row'])[3]//li/a");
		By orderHistoryContinueButton = By.xpath("//div[@class='buttons clearfix']//div[@class='pull-right']/a[text()='Continue']");
		By searchTextBox = By.id("APjFqb");
		By searchList = By.xpath("//div[contains(@class,'wM6W7d')]");
		// ==============================================================
		// PageActions
		// Test Case 14-Validate if opencart website is opened through search method
		//Test Case 15-Validate in the search results page,if the website name is seen click on it
		//Test Case 16-Validate if we are able to navigate to the register page from the home page
		//Test Case 17-Validate the url of the register page
		//Test Case 18-Validate the title of the register page
		//Test case 19-Validate if we can search the product Macbook Air in desktops dropdown.
		//Test case 20-Validate the MacBook Air features. 
		//Test case 21-Validate the MacBook Air If in stock,add to cart and validate the success message.
		//Test case 22-Validate that mandatory field for Registration page is all displayed.
		//Test case 23-Validate that radio button of register page are displayed using relative locators.
		//Test case 24-Validate the dropdown of the register page using Actions class -MenuHandling and moveToelement
		
		// Test Case 6-Validate the placeholder value of the textfields in register page
		String firstnamestring = eutil.doGetAttributeValue(firstname, "placeholder");

		if (firstnamestring.equals("First Name")) {
			System.out.println("Test case06:PASS-placeholder value of the textfields in register page is as expected");
		} else {
			System.out.println(
					"Test case06:FAIL-placeholder value of the textfields in register page is not as expected");

		}

		// RegisterAUser
		eutil.doSendKeys("jonn", firstname);
		eutil.doSendKeys("snoww", lastname);
		eutil.doSendKeys("jonsnowygrit@gmail.com", email);
		eutil.doSendKeys("2415241299", telephone);
		eutil.doSendKeys("jon2023", password);
		eutil.doSendKeys("jon2023", confirmPassword);

		// Test Case 7-Validate the value of the textfields in register page that has
		// been entered through sendKeys
		String firstnamefieldvalue = eutil.doGetAttributeValue(firstname, "value");

		if (firstnamefieldvalue.equals("jonn")) {
			System.out.println("Test case07:PASS-textfield value of the firstname in register page is as expected");
		} else {
			System.out.println("Test case07:FAIL-textfield value of the firstname in register page is not as expected");

		}

		// Test Case 1-Validate if Registration is succesfull
		eutil.doClick(subscription);
		eutil.doClick(privacyPolicy);
		eutil.doClick(continueButton);
		String actualtext = eutil.dogetElementText(textAfterRegistration);

		String expectedText = "Your Account Has Been Created!";
		if (actualtext.equals(expectedText)) {
			System.out.println("Test case01:PASS-Registration Successfull and as expected");

		} else {
			System.out.println("Test case01:FAIL-Registration Failure and as expected");
		}

		// Test Case 2-Validate footer link header 1
		By informationFooter = By.xpath("(//div[@class='row']/div[@class='col-sm-3']/h5)[1]");
		By customerServiceFooter = By.xpath("(//div[@class='row']/div[@class='col-sm-3']/h5)[2]");
		By extrasFooter = By.xpath("(//div[@class='row']/div[@class='col-sm-3']/h5)[3]");
		By myAccountFooter = By.xpath("(//div[@class='row']/div[@class='col-sm-3']/h5)[4]");

		String actualInformationfooter = eutil.dogetElementText(informationFooter);
		if (actualInformationfooter.equals("Information")) {
			System.out.println("Test case02:PASS-Footer Link Infomation is as expected");
		} else {
			System.out.println("Test case02:FAIL-Footer Link Infomation is not as expected");
		}

		// Test Case 3-Validate footer link header 1
		String actualcsfooter = eutil.dogetElementText(customerServiceFooter);
		if (actualcsfooter.equals("Customer Service")) {
			System.out.println("Test case03:PASS-Footer Link Customer Service is as expected");
		} else {
			System.out.println("Test case03:FAIL-Footer Link Customer Service is not as expected");
		}

		// Test Case 4-Validate footer link header 1
		String actualetfooter = eutil.dogetElementText(extrasFooter);
		if (actualetfooter.equals("Extras")) {
			System.out.println("Test case04:PASS-Footer Link extrasFooter is as expected");
		} else {
			System.out.println("Test case04:FAIL-Footer Link extrasFooter is not as expected");
		}

		// Test Case 5-Validate footer link header 1
		String actualmyfooter = eutil.dogetElementText(myAccountFooter);
		if (actualmyfooter.equals("My Account")) {
			System.out.println("Test case05:PASS-Footer Link My Account is as expected");
		} else {
			System.out.println("Test case05:FAIL-Footer Link My Account is not as expected");
		}

		// Test Case 8-Validate all the available anchor tag link href value which gives
		// list of hyperlinks
		List<String> totalLinks = eutil.getElementsAttributeValue(totalTextLinks, "href");
		for (String string : totalLinks) {
			System.out.println("Test case08:PASS- hyperlink:" + string);
		}
		// Test Case 9- Validate if we have alt property of the image tag
		List<String> imgLinks = eutil.getElementsAttributeValue(totalImageLinks, "alt");
		for (String string : imgLinks) {
			System.out.println("Test case09:PASS- altProperty:" + string);
		}

		// Test Case 10- Validate if the right panel of the register page has 13 links
		int rightpanelLinksCount = eutil.getElementsCount(rightPanelRegister);
		if (rightpanelLinksCount == 13) {
			System.out.println("Test case10:PASS-Right Panel of Register page has 13 Links as expected");
		} else {
			System.out.println("Test case10:FAIL-Right Panel of Register page does not have 13 Links as not expected");
		}

		// Test Case 11- Validate if the right panel of the register page has 13 links
		// textvalue
		List<String> rightPanelLinks = eutil.getElementsTextList(rightPanelRegister);
		int Count = 1;
		for (String string : rightPanelLinks) {
			System.out.println("Right Panel Link " + Count + ": " + string);
			Count++;
		}
		System.out.println("Test case11:PASS-All the right panel links have been printed succesfully");

		// Test Case 12-Validate if totalanchorTag Links and the links which is not
		// blank have the same count

		List<String> textLinks = eutil.getElementsTextList(totalTextLinks);
		List<String> nonblanklinks = new ArrayList<String>();
		for (String string : textLinks) {   
			if (string.length() > 0) {
				nonblanklinks.add(string);

			}

		}
		int nonBlankAnchorLinksCount = nonblanklinks.size();
		int totalAnchorLinksCount = eutil.getElementsCount(totalTextLinks);
		System.out.println("Total non blank anchor tag links="+nonBlankAnchorLinksCount);
		System.out.println("Total anchor tag links="+totalAnchorLinksCount);
		if (nonBlankAnchorLinksCount == totalAnchorLinksCount) {
			System.out.println(
					"Test case12:PASS-totalanchorTag Links and the links which is not blank have the same count\r\n"
							+ "		 as expected");
		} else {
			System.out.println(
					"Test case12:FAIL-totalanchorTag Links and the links which is not blank have the same count\r\n"
							+ "		and as not expected");
		}

		//Test Case 13-Validate if the footer links have the "Order History" link-click 
		//on it andverify if the continue button is displayed on the page.
		eutil.doClickElementFromPageSection(accountfooterLinks,"Order History");
		Boolean continueButtonOredrHistory = eutil.elementIsDisplayed(orderHistoryContinueButton);
		if (continueButtonOredrHistory == true) {
			System.out.println("Test case13:PASS-Order History continue button is displayed on the page as expected");
		} else {
			System.out.println(
					"Test case13:FAIL-Order History continue button is not displayed on the page and is not as expected");
		}

		// Quiting the browser
		// brutil.driverQuit();

	}

}
