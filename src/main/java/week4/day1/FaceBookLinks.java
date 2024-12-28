package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLinks {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> elements = driver.findElements(By.tagName("a"));;
		System.out.println(elements.size());
		for(int i=0;i<elements.size();i++) {
			WebElement webElement = elements.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
	}

}
