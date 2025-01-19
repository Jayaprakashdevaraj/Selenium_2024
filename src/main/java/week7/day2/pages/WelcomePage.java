package week7.day2.pages;

import org.openqa.selenium.By;

import week7.day2.base.ProjectSpecficMethod;

public class WelcomePage extends  ProjectSpecficMethod {
	public HomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage();
	}

	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage();
		
	}
}
