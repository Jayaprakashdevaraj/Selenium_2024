package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindLead {public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	WebElement usermameField = driver.findElement(By.id("username"));
	usermameField.sendKeys("demosalesmanager");
	WebElement passwordField = driver.findElement(By.id("password"));
	passwordField.sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	String title = driver.getTitle();
	System.out.println("Page title is "+title);
	driver.findElement(By.linkText("CRM/SFA")).click();
	System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("jayaprakash");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	
	driver.close();
}

}
