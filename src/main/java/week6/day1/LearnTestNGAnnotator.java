package week6.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class LearnTestNGAnnotator {
	
	@Test(dataProvider = "dp")
	public void testB(Integer n, String s) {
		System.out.println(n+s);
	}	
	@Test
	public void testA() {
		System.out.println("Test-A");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before Suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after Suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test");
	}
	
@AfterTest
	public void AfterTest() {
		System.out.println("after test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after Method");
	}
	
@DataProvider	
public Object[][] dp() {
	return new Object[][] {
		new Object[] {1,"a"},
		new Object[] {2,"b"},
	};
}

}
