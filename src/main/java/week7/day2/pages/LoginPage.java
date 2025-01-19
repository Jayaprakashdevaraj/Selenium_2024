package week7.day2.pages;

import org.openqa.selenium.By;

import week7.day2.base.ProjectSpecficMethod;

public class LoginPage extends  ProjectSpecficMethod{
	
	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return this;
	}
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public WelcomePage ClickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}

}
