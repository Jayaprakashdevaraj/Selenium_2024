package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		WebElement usermameField = driver.findElement(By.id("username"));
		usermameField.sendKeys("demosalesmanager");
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println("Page title is "+title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayapraksh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Devaraj");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDd = new Select(source);
		sourceDd.selectByIndex(3);
		WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketdb = new Select(market);
		marketdb.selectByVisibleText("Automobile");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipdb = new Select(ownership);
		ownershipdb.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		
		String leadID = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(driver.getTitle());
		System.out.println(leadID);
		
		
		

		driver.close();
	}

}
