package week7.day2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import week7.day2.base.ProjectSpecficMethod;

public class WelcomePage extends  ProjectSpecficMethod {
	
	public WelcomePage(RemoteWebDriver driver) {
		this.driver= driver;
	}
	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}
	
	public HomePage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);
	}
}
