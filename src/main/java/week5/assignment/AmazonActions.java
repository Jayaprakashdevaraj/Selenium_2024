package week5.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonActions {
	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro", Keys.ENTER);

//price info		
		List<WebElement> productPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		String firstProcuctPrice = productPrice.get(0).getText();
		System.out.println("First product price is "+firstProcuctPrice);
		

/* ALL product price		
		for (WebElement price : productPrice) {
			System.out.println(price.get(0).getText());
		}
*/
		
//Rating
		List<WebElement> rating = driver.findElements(By.xpath("//span[@class='a-icon-alt']"));
		String firstProductRating = rating.get(0).getText();
		System.out.println("First product rating is "+firstProductRating);

//select first product
		List<WebElement> productName = driver.findElements(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));
		productName.get(0).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowNames = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowNames.get(1));
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	File location = new File("./snaps/AmazonSS.png");
	FileUtils.copyFile(screenshotAs, location);

		
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("attach-view-cart-button-form")).click();
		
		WebElement cardPriceInfo = driver.findElement(By.xpath("//span[@class='a-price a-text-price sc-product-price sc-white-space-nowrap a-size-medium']/span[2]"));
		String cartPrice = cardPriceInfo.getText();
		System.out.println(cartPrice);
		if(firstProcuctPrice.equals(cartPrice)) {
			System.out.println("Price is matching");
		}else {
			System.out.println("Price is not matched");
		}
		
		driver.quit();
	}
}
