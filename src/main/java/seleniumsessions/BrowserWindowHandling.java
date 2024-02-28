package seleniumsessions;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();

		System.out.println("The parent window is:" + parentWindow);
		System.out.println("The child window is:" + childWindow);

		// switching work to child
		driver.switchTo().window(childWindow);
		System.out.println("the child url is:" + driver.getCurrentUrl());
		driver.close();

		// switching work to paremt
		driver.switchTo().window(parentWindow);
		System.out.println("the parent url is:" + driver.getCurrentUrl());
		driver.quit();

	}

}
