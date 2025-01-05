package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnAction2 {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement kids = driver.findElement(By.xpath("//a[text()='Kids']"));
		Actions action = new Actions(driver);

		WebElement tShirts = driver.findElement(By.xpath("(//a[text()='T-Shirts'])[2]"));
		action.moveToElement(kids).click(tShirts).build().perform();
	
	}

}
