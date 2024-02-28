package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopHandle {

	public static void main(String[] args) throws InterruptedException {
		
		String username="admin";
		String password="admin";
		WebDriver driver = new ChromeDriver();
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

}
