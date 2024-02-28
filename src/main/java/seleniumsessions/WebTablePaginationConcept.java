package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		while (true) {

			if (driver.findElements(By.xpath("//td[text()='Brazil']")).size() > 0) {
				ClickCheckbox("Brazil");
				break;

			} else {
				WebElement next = driver.findElement(By.linkText("Next"));
				if (next.getAttribute("class").contains("disable")) {
					System.out.println("We have reached the end of the WebTable");
					break;

				}
				next.click();
				Thread.sleep(4000);

			}

		}

	}

	public static void ClickCheckbox(String Country) {
		driver.findElement(By.xpath("//td[text()='" + Country + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();

	}

}
