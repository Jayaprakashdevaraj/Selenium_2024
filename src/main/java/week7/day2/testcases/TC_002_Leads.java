package week7.day2.testcases;

import org.testng.annotations.Test;

import week7.day2.base.ProjectSpecficMethod;
import week7.day2.pages.LoginPage;

public class TC_002_Leads extends ProjectSpecficMethod {
	
	@Test
	public void runLeads() {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfa()
		.clickLeadTab();
	}

}
