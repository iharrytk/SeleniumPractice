package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		selectUser("Joe.Root");
		selectUser("John.Smith");
		List<String> s=getUserInfo("Joe.Root");
		System.out.println(s.get(0));
	}
	
	public static void selectUser(String name) {
		driver.findElement(
	By.xpath("//a[text()='"+name+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	public static List<String> getUserInfo(String name) {
		List<WebElement> userInfo=driver.findElements(
				By.xpath("//a[text()='"+name+"']/parent::td/following-sibling::td"));
		List<String> userInfoList=new ArrayList<String>();
		for(WebElement e:userInfo) {
			String s=e.getText();
			userInfoList.add(s);
		}
		return userInfoList;
		
	}
	

}
