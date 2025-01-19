package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethod{

	@Test(dataProvider = "inputData")
	public void runCreateLead(String cname, String fname, String lname, String phoneNumber) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
		driver.findElement(By.name("submitButton")).click();
}
	@DataProvider
	public String[][] inputData() throws InvalidFormatException, IOException {
/*		String[][] data = new String[3][3];
		data[0][0] = "Testleaf";
		data[0][1] = "Babu";
		data[0][2] = "M";
		
		data[1][0] = "TCS";
		data[1][1] = "Hari";
		data[1][2] = "H";
	
		data[1][0] = "CTS";
		data[1][1] = "Ram";
		data[1][2] = "kumar";
		return data;
*/
		return DataLibrary.readExcel("LeadExcelFile", "CreateLeadTestData");
	}
}






