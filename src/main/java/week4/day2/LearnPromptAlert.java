package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {
	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/alert.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span[text()='Show']")).click();
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("Jayaprakash");
	System.out.println(alert.getText());
	alert.dismiss();
	String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
	System.out.println(text);
	
	driver.findElement(By.xpath("//h5[text()='Sweet Alert (Confirmation)']/following::span[text()='Show']")).click();
	String text2 = driver.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']")).getText();
	System.out.println(text2);
	alert.accept();
	}
}
