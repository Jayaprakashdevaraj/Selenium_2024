package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTableErail {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		driver.findElement(By.id("buttonFromTo")).click();
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		int rowCount = driver.findElements(By.xpath("(//table)[2]/tbody/tr")).size();
		int columnCount = driver.findElements(By.xpath("(//table)[2]/tbody/tr[2]/td")).size();
		Set<String> trainNames = new HashSet<String>();
		System.out.println(rowCount);

		for (int i = 2; i < rowCount; i++) {
			String text = driver.findElement(By.xpath("(//table)[2]/tbody/tr[" + i + "]/td[2]")).getText();

			trainNames.add(text);
			
		}
		System.out.println(trainNames);
		driver.close();

	}

}
