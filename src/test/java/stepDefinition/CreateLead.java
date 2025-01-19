package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends Base{

	

	@When ("Click on the crmsfa link")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();	
	}

	@When ("click leads tab")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();

	}
	
	@When ("click create lead link")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given ("enter the company name as {string}")
	public void enterCompanyName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	
	@Given ("enter the first name as {string}")
	public void enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

	}

	@Given ("enter the last name as {string}")
	public void enterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}

	@Given ("enter the phone number as {string}")
	public void enterPhoneNumber(String phno) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys(phno);
	}

	
	@When ("click submit button")
	public void clickSubmit() {
		driver.findElement(By.name("submitButton")).click();	
	}
	
	@Then ("verify the lead ID")
	public void checkLeadID() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);

	}
	
	
	


		
}
