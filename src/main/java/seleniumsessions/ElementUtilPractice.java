package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtilPractice {

	WebDriver driver;

	public ElementUtilPractice(WebDriver driver) {

		this.driver = driver;
	}

	/**
	 * 
	 * @param locator
	 * @returns a WebElement
	 */

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			// System.out.println("Element found using the given locator:" + locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element not found using the given locator:" + locator);
			try {
				Thread.sleep(5000);

			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			element = driver.findElement(locator);

		}

		return element;
	}

	/**
	 * 
	 * @param locator
	 * @returns a list of WebElements
	 */

	public List<WebElement> getElements(By locator) {
		List<WebElement> elements = driver.findElements(locator);
		return elements;
	}

	/**
	 * 
	 * @param value
	 * @param locator Can be used to enter a value in text fields
	 */

	public void doSendKeys(String value, By locator) {
		if (value == null) {
			throw new MySeleniumException("VALUENULLEXCEPTION");
		}
		doClear(locator);
		getElement(locator).sendKeys(value);
	}

	/**
	 * Can be used to click on a Webelement
	 * 
	 * @param locator
	 */

	public void doClick(By locator) {
		getElement(locator).click();

	}

	/**
	 * Can be used to clear a text field
	 * 
	 * @param locator
	 */

	public void doClear(By locator) {
		getElement(locator).clear();

	}

	/**
	 * 
	 * @param locator
	 * @returns a String value of the WebElement getText can done to get the text of
	 *          any WebElement like p tag,h tag or a tag It cannot be used to getthe
	 *          text that has been entered in the textfield
	 */

	public String dogetElementText(By locator) {
		return getElement(locator).getText();
	}

	/**
	 * @param locator
	 * @returns a boolean value of the WebElement is displayed or not
	 */
	public Boolean elementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	/**
	 * 
	 * @param locator
	 * @param attrname
	 * @returns a String which is the WebElements Attribute value placeholder is an
	 *          attribute of WebElement which holder the grey value that we see in
	 *          textfields To get the text that has been entered using sendKeys we
	 *          can use value attribute of the WebElement
	 */

	public String doGetAttributeValue(By locator, String attrname) {
		return getElement(locator).getAttribute(attrname);
	}

	/**
	 * The popular driver.findElements will return a list of Webelements. The
	 * WebElement might have various attributes. Example use:If we want to validate
	 * a specific attribute like src in img tag or href in a tag. It can be used to
	 * validate any attribute value provided the locator and attribute name
	 * 
	 * @param locator
	 * @param attr
	 * @return
	 */

	public List<String> getElementsAttributeValue(By locator, String attr) {

		List<WebElement> totalLinks = getElements(locator);
		List<String> attrValues = new ArrayList<String>();
		for (WebElement webelement : totalLinks) {
			String attrValue = webelement.getAttribute(attr);
			attrValues.add(attrValue);

		}
		return attrValues;

	}

	/**
	 * To get the count of list of WebElements by providing the locator return the
	 * integer value:can be used to find total number of anchor tag links or img tag
	 * links
	 * 
	 * @param locator
	 * @return
	 */
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	/**
	 * To get the text value of elements from a specific section. example: right
	 * panel has 13 links and we want the text value of those links
	 * 
	 * @param locator
	 * @return
	 */

	public List<String> getElementsTextList(By locator) {
		List<WebElement> list = getElements(locator);
		List<String> elementsText = new ArrayList<String>();
		for (WebElement webElement : list) {
			String text = webElement.getText();
			elementsText.add(text);
		}

		return elementsText;
	}

	/**
	 * to click on a specific element from a list of WebElements(from specific
	 * section of page) and perform a click on it
	 * 
	 * @param locator
	 * @param eleText
	 */

	public void doClickElementFromPageSection(By locator, String textToBeClicked) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement webElement : eleList) {
			String eleText = webElement.getText();
			if (eleText.equals(textToBeClicked)) {
				System.out.println("The element to be clicked is:" + eleText);
				webElement.click();
				break;
			}

		}
		System.out.println("Navigated to the page:" + textToBeClicked);
	}

	/**
	 * Google search
	 * 
	 * @param searchTextBox
	 * @param enterText
	 * @param searchText
	 * @param searchList
	 * @throws InterruptedException
	 */

	public void search(By searchTextBox, String enterText, String searchText, By searchList)
			throws InterruptedException {
		doSendKeys(enterText, searchTextBox);
		Thread.sleep(5000);
		List<WebElement> searchListt = getElements(searchList);
		System.out.println("The search list size is:" + searchListt.size());
		if (searchListt.size() > 0) {
			for (WebElement webElement : searchListt) {
				String s = webElement.getText();
				if (s.length() > 0) {
					if (s.equals(searchText)) {
						webElement.click();
						break;
					}

				} else {
					System.out.println("The searchText is either empty or blank");
				}
			}
		} else {
			System.out.println("The search list that came for the enteredText:" + enterText + " is empty");
		}

	}

}
