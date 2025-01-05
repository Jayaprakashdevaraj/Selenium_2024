package week5.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> tableHeader = driver.findElements(By.xpath("(//table)[6]/thead/tr/th"));
		for(WebElement webElements : tableHeader) {
			System.out.println(webElements.getText());
		}
		int rowCount = driver.findElements(By.xpath("(//table)[6]/tbody/tr")).size();
		int colCount = driver.findElements(By.xpath("(//table)[6]/thead/tr/th")).size();

		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
			
			System.out.println(driver.findElement(By.xpath("(//table)[6]/tbody/tr["+i+"]/td["+j+"]")).getText());
		}
		}
		
	}

}
