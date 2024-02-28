package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/us/dashboard/canada");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		By element = By.linkText("Oshawa, Canada");

		// right of element
		String rightElementScore = driver.findElement(with(By.tagName("p")).toRightOf(element)).getText();
		System.out.println("The element present to the right of the center element is:" + rightElementScore);

		// left of element
		String leftIndex = driver.findElement(with(By.tagName("p")).toLeftOf(element)).getText();
		System.out.println("The element present to the left of the center element is:" + leftIndex);

		// above of element
		String aboveCity = driver.findElement(with(By.tagName("p")).above(element)).getText();
		System.out.println("The element present to the above of the center element is:" + aboveCity);

		// below of element
		String belowCity = driver.findElement(with(By.tagName("p")).below(element)).getText();
		System.out.println("The element present to the below of the center element is:" + belowCity);
		
		// below of element
		String nearCity = driver.findElement(with(By.tagName("p")).near(element)).getText();
		System.out.println("The element present to the nearby of the center element is:" + nearCity);


	}

}