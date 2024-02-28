package seleniumsessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTraversing {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<String> headers = getTableHeaders();
		List<String> columns = getColumnValue();

		System.out.println("The table row count is:" + getRowCount());
		System.out.println("The table column count is:" + getColumnCount());
		System.out.println("The header list is" + headers);
		System.out.println("The column list is"+columns);
		

	}

	public static List<String> getTableHeaders() {
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		List<String> headerlist = new ArrayList<String>();
		for (WebElement webElement : headers) {
			String headerlistpart = webElement.getText();
			headerlist.add(headerlistpart);

		}
		return headerlist;
	}

	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
	}

	public static int getColumnCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr/th")).size();
	}

	
	// table[@id="customers"]/tbody/tr[2]/td[1]
	// table[@id="customers"]/tbody/tr[3]/td[1]
	// table[@id="customers"]/tbody/tr[7]/td[1]
	
	public static List<String> getColumnValue() {
		String beforeXPath="//table[@id=\"customers\"]/tbody/tr[";
		String afterXPath="]/td[2]";
		List<String> columnvalues=new ArrayList<String>();
		for(int row=2;row<=getRowCount();row++) {
			String fullxpathh=beforeXPath+row+afterXPath;
			//System.out.println(fullxpathh);
			String column=driver.findElement(By.xpath(fullxpathh)).getText();
			columnvalues.add(column);
		}
		return columnvalues;
				
	}

}
