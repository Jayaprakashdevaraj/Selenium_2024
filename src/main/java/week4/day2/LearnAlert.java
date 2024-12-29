package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']/following::span[text()='Show']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	
		
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following::span[text()='Show']")).click();
		System.out.println(alert.getText());
		alert.dismiss();
		
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span[text()='Show']")).click();
		alert.sendKeys("Jayaprakash");
		System.out.println(alert.getText());
		alert.accept();
		
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Confirmation)']/following::span[text()='Show']")).click();
		String text = driver.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']")).getText();
		alert.accept();
		

	}

}
