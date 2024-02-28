package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class DragAndDropHandle {

	static WebDriver driver;

	public static void main(String[] args) {
		// drag and drop
		// element to element

		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement destination = driver.findElement(By.id("droppable"));
//		Actions ac = new Actions(driver);
//		ac.dragAndDrop(source, destination).build().perform();
		
		By sou=By.id("draggable");
		By tar=By.id("droppable");
		//doDragandDrop(sou, tar);
		
		ElementUtil eutil=new ElementUtil(driver);
		eutil.doDragandDrop(sou, tar);
		

	}

	public static void doDragandDrop(By sourceLocator,By targetLocator ) {
		Actions ac=new Actions(driver);
		ac.dragAndDrop(driver.findElement(sourceLocator), driver.findElement(targetLocator)).build().perform();

	}

}
