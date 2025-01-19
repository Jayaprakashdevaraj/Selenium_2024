package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Base {

	@Given("Enter the username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("click on the login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	
	}

	@Then("Verify the login is success")
	public void verifyLogin() {
		String title = driver.getTitle();
		System.out.println(title);
	   
	}
		
}
