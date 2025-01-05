package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTCWindowHandlings {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowNames = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowNames.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(windowNames.get(0));
		driver.close();
		driver.switchTo().window(windowNames.get(1));
		System.out.println("PAge title after close the parent window "+driver.getTitle());
	}

}
