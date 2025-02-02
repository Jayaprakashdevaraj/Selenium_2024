package week8.day1;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtendReport {
	
	public static void main(String[] args) throws IOException {
		
//		String format = LocalTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//		System.out.println(format);
		
		Date date = new Date();
		LocalDateTime currentDateAndTime = LocalDateTime.now();
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String format = ofPattern.format(currentDateAndTime);
		System.out.println(format);

		
		//Set the path for report
		File reportFolder = new File("user.dir"+"/report/"+format+"result.html");
//		File reportFolder = new File("./report/result.html");
		boolean mkdir = reportFolder.mkdirs();
		
		//Set the path for reportt
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(reportFolder);
		reporter.setAppendExisting(true);
		
		//Create Report
		ExtentReports report = new ExtentReports();
		
		//attach tje report to the report path
		report.attachReporter(reporter);
		
		ExtentTest test = report.createTest("Login testcses", " login functionality with valid data");
		test.assignAuthor("JP");
		test.assignCategory("regression");
		
		test.pass("Username entered successfully");
		test.fail("password failed enter");
		
		test.pass("login button clicked successfully", MediaEntityBuilder.createScreenCaptureFromPath("../.././snaps/snapshot.png").build()); //come back two folder to reach main folder so using two dots two times
		
		report.flush();
	}

}
