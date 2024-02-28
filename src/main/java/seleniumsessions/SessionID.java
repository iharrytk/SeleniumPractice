package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionID {

	public static void main(String[] args) {
		
		//quit-Case study 1 After quit No such session exception
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String title=driver.getTitle();//4708b3c182dd2e63fbdaa164b5cbd7a8
		System.out.println("Title is :" +title);
		
		driver.quit();//4708b3c182dd2e63fbdaa164b5cbd7a8
		String title1=driver.getTitle();//ChromeDriver: chrome on windows (null)
		System.out.println("Title is :" +title1);
		

	}

}
