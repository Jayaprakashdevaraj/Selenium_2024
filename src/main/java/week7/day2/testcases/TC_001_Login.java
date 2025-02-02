package week7.day2.testcases;

import org.testng.annotations.Test;

import week7.day2.base.ProjectSpecficMethod;
import week7.day2.pages.LoginPage;

public class TC_001_Login extends ProjectSpecficMethod{
	
	@Test
	public void login() {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName()
		.enterPassword()
		.clickLoginButton();
		
	}

}
