package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXPath {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		By footerColumn = By.xpath("//div[text()='Get to Know Us']/following-sibling::ul//child::a");
		By allfooterLinks = By.xpath(
				"//div[@class='navFooterVerticalRow navAccessibility']//div[@class='navFooterLinkCol navAccessibility']//a");

//		List<String> Columnsvalues = footerColumnValues(allfooterLinks);
//		System.out.println(Columnsvalues);
		
		
		List<String> s=getColumnValues("Let Us Help You");
		System.out.println(s);
		driver.quit();

	}
	public static List<String> footerColumnValues(By locator) throws InterruptedException {

		List<WebElement> footerColumnValues = driver.findElements(locator);
		System.out.println("Total footer elements: " +footerColumnValues.size());
		List<String> textValues = new ArrayList<String>();

		for (WebElement e : footerColumnValues) {
			String valuee = e.getText();
			Thread.sleep(5000);
			textValues.add(valuee);

		}
		
		return textValues;

	}
	
	public static List<String> getColumnValues(String columnName) throws InterruptedException {
		List<WebElement> columnValuess=driver.findElements(
				By.xpath("//div[text()='"+columnName+"']/following-sibling::ul//child::a"));
		System.out.println("Printing the values for the column: "+columnName);
		System.out.println("The column size is:"+columnValuess.size());
		List<String> columnlist=new ArrayList<>();
		for(WebElement e:columnValuess) {
			String s=e.getText();
			Thread.sleep(2000);
			columnlist.add(s);
			//System.out.println(s);
			
		}
		return columnlist;
	}

}
