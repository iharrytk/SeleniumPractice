package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// Alert
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alertHandle = driver.switchTo().alert();
		String alertText = alertHandle.getText();
		System.out.println("The alert text in the alertPop up is:" + alertText);
		alertHandle.dismiss();

		// Confirm
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert confirmHandle = driver.switchTo().alert();
		String confirmText = confirmHandle.getText();
		System.out.println("The Confirm alertPop text is:" + confirmText);
		confirmHandle.accept();
		
		//.000 Prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert promptHandle = driver.switchTo().alert();
		String promptText = promptHandle.getText();
		promptHandle.sendKeys("Haritha");
		System.out.println("The Prompt alertPop text is:" + promptText);
		promptHandle.accept();
		String promptResult=driver.findElement(By.xpath("//p[@id='result']")).getText();
		if(promptResult.contains("Haritha")) {
			System.out.println("PASS-The result and the entered text are same");
		}
		
		else {
			System.out.println("FAIL-The result and the entered text are not the same");
			
		}
		
		
		
		

	}

}
