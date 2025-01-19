package week7.day2.pages;

import org.openqa.selenium.By;

import week7.day2.base.ProjectSpecficMethod;

public class HomePage extends  ProjectSpecficMethod{
	public void clickLeadTab() {
		driver.findElement(By.linkText("Leads")).click();
	}
public void clickCountsTab() {
		
	}
}
