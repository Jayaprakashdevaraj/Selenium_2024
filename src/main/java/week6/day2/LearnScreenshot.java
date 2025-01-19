package week6.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		//take screenshot
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		
		//Choose location , FileName, extension
		File location = new File("./snaps/snapshot.png");
		
		//Save the screenshot
		FileUtils.copyFile(screenshot, location);
		
		//take ss for particular element
		WebElement loginForm = driver.findElement(By.id("form"));
		File src = loginForm.getScreenshotAs(OutputType.FILE);
		File dec = new File("./snaps/webSnap.png");
		FileUtils.copyFile(src, dec);

		
		driver.close();

	}

}
