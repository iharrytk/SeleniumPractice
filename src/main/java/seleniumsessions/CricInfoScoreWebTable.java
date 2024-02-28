package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoScoreWebTable {
	
	//static reference can be called by static methods outside of the main method 
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/delhi-capitals-vs-mumbai-indians-16th-match-1359490/full-scorecard");
		//(//span[text()='Gujarat Titans']/ancestor::td)[1]/following-sibling::td[contains(@class,'ds-w-0')]
		driver.manage().window().maximize();
		Thread.sleep(6000);
		String wicketkeeper=getwicketKeeper("Manish Pandey");
		System.out.println("the wicketkeeper of Manish Pandey is:"+wicketkeeper);
		

	}
	
	public static String getwicketKeeper(String player) {
		
		return driver.findElement(
				By.xpath("//span[text()='"+player+"']/ancestor::td/following-sibling::td//span")).getText();
		
	}

}
