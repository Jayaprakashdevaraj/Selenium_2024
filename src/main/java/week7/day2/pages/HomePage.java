package week7.day2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import week7.day2.base.ProjectSpecficMethod;

public class HomePage extends  ProjectSpecficMethod{
	
	public HomePage(RemoteWebDriver driver) {
		this.driver= driver;
	}
	
	public void clickLeadTab() {
		driver.findElement(By.linkText("Leads")).click();
	}
public void clickCountsTab() {
		
	}
}
