package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogether {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);

		String parentwindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		Thread.sleep(4000);

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {
			String window = it.next();
			driver.switchTo().window(window);
			Thread.sleep(4000);
			System.out.println("The current URL is:" + driver.getCurrentUrl());
			if (!window.equals(parentwindow)) {
				driver.close();

			}
		}
		
		driver.switchTo().window(parentwindow);
		System.out.println("The parent window url is:"+driver.getCurrentUrl());
		driver.quit();

	}

}
