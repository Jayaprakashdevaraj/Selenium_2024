package week5.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		WebElement foodgrains = driver.findElement(By.xpath("//a[text()='Foodgrains, Oil & Masala']"));
		Actions a= new Actions(driver);
		a.moveToElement(foodgrains).build().perform();
		WebElement rice = driver.findElement(By.xpath("(//a[text()='Rice & Rice Products'])[1]"));
		a.moveToElement(rice).build().perform();
		WebElement boiledRice = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		a.moveToElement(boiledRice).click().build().perform();
/*		a.clickAndHold(foodgrains).pause(2000).release().build().perform();
			
		,a.moveToElement(foodgrains).build().perform();
		a.moveToElement(rice).build().perform();
		a.moveToElement(boiledRice).click().build().perform();
*/
	}

}
