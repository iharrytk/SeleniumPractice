package seleniumsessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulyiBrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		Thread.sleep(4000);

		Set<String> handles = driver.getWindowHandles();

		List<String> lit = new ArrayList<String>(handles);

		String parentwindow = lit.get(0);
		System.out.println("The parent window id is:" + parentwindow);
		String linkeInwindow = lit.get(1);
		System.out.println("The linkein window id is:" + linkeInwindow);
		String facebookwindow = lit.get(2);
		System.out.println("The facebook window id is:" + facebookwindow);
		String twitterwindow = lit.get(3);
		System.out.println("The twitter window id is:" + twitterwindow);
		String youtubewindow = lit.get(4);
		System.out.println("The youtube window id is:" + youtubewindow);

		System.out.println("The parent url is:" + driver.getCurrentUrl());

		driver.switchTo().window(linkeInwindow);
		Thread.sleep(4000);
		System.out.println("The linkedin url is:" + driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(facebookwindow);
		Thread.sleep(4000);
		System.out.println("The facebook url is:" + driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(twitterwindow);
		System.out.println("The twitter url is:" + driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(youtubewindow);
		Thread.sleep(4000);
		System.out.println("The youtube url is:" + driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(parentwindow);
		Thread.sleep(4000);
		System.out.println("The orangehrm parent url is:" + driver.getCurrentUrl());
		driver.quit();

	}

}
