package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//driver.switchTo().frame(2);
		
		List<WebElement> framelist=driver.findElements(By.xpath("//frame"));
		System.out.println("The number of frames is:"+framelist.size());
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		String pageHeader=driver.findElement(By.tagName("h2")).getText();
		System.out.println("The page header is:"+pageHeader);
		
		

	}

}

