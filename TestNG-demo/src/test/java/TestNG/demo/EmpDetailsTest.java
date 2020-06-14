package TestNG.demo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EmpDetailsTest {
	EmpDemo emp = new EmpDemo();
	EmpBusinessLogic ebl = new EmpBusinessLogic();

	@Test(groups = { "g1", "g2" })
	public void testCalApp() {
		emp.setName("ABC");
		emp.setAge(20);
		emp.setSalary(8000);

		double appraisal = ebl.calcAppraisal(emp);
		Assert.assertEquals(500, appraisal);
	}

	@Test(groups = { "g1" })
	public void testYearlySal() {
		emp.setAge(23);
		emp.setName("PQR");
		emp.setSalary(10000);

		double yrSal = ebl.calcYearlySalary(emp);
		Assert.assertEquals(120000, yrSal);

		System.out.print("Hello from testYrlySal");
	}

	@Test(groups = "g2", dependsOnMethods = "testYearlySal")
	public void testCase3() {
		System.out.println("in testcase 3");
	}

	@Test(groups = "g3", dependsOnGroups = "g2")
	public void testCase4() {
		System.out.println("in testcase 4");
	}

	@Test
	@Parameters("id")
	public void testCase5(@Optional int id) {
		System.out.println("in testcase 5, id is: " + id);
	}

	@BeforeMethod
	public void beforeMethodDemo() {
		System.out.println("Inside beforeMethod");
	}

	@AfterMethod
	public void afterMethodDemo() {
		System.out.println("Inside afterMethod");
	}

	@BeforeClass
	public void beforeClassDemo() {
		System.out.println("Inside beforeClass");
	}

	@AfterClass
	public void afterClassDemo() {
		System.out.println("Inside afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Inside beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Inside afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Inside beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Inside afterSuite");
	}
}
