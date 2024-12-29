package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.id("Click"));
		element.click();
		System.out.println(element.getText());
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Testleaf");
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		System.out.println(elements.size());
		
		WebElement parentFrame = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']//following::iframe"));
		driver.switchTo().frame(parentFrame);
		
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().parentFrame();
		
		String domAttribute = driver.findElement(By.tagName("iframe")).getDomAttribute("src");
		System.out.println(domAttribute);
		
		driver.switchTo().parentFrame();
		
		String domAttribute2 = driver.findElement(By.tagName("iframe")).getDomAttribute("src");
		System.out.println(domAttribute2);
		
		
		
		driver.close();
	}

}
