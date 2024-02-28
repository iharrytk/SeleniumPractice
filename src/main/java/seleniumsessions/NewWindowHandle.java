package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		
		String parentwindow=driver.getWindowHandle();
		
		//Switching to new window tab
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.google.com/");
		System.out.println("the child(new window) is:"+driver.getTitle());
		Thread.sleep(4000);
		
		driver.switchTo().window(parentwindow);
		System.out.println("the parent(original window) is:"+driver.getTitle());
		driver.quit();
		
		

	}

}
