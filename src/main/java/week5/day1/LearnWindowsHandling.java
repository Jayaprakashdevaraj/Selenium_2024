package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowsHandling {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phones", Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']")).click();
		System.out.println(driver.getTitle());
		String currentWindowID = driver.getWindowHandle();
		System.out.println(currentWindowID);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowNames = new ArrayList<String>(windowHandles);
		System.out.println(windowNames.get(0));
		System.out.println(windowNames.get(1));
		driver.switchTo().window(windowNames.get(1));
		System.out.println(driver.getTitle());
	}

}
