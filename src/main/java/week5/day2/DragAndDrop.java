package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement draggableElement = driver.findElement(By.id("form:conpnl"));
		Actions action =new Actions (driver);
		action.dragAndDropBy(draggableElement, 150, 0).pause(2000).dragAndDropBy(draggableElement, 100, 0).build().perform();
		action.clickAndHold(draggableElement).pause(2000).moveByOffset(-150, 0).release().perform();
	}

}
