package TestNG.demo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class PrimeNumberWithDataProviderTest {
	private PrimeNumberCheck primeCheck;
	
	@BeforeMethod
	public void initialize() {
		primeCheck = new PrimeNumberCheck();
	}
	
	@DataProvider(name="test1")
	public static Object[][] primeNumbers() {
		return new Object[][] {{4, false}, {31, true}, {19, true}, {6, false}};
	}
	
	@Test(dataProvider = "test1")
	public void testprime(int no, boolean result) {
		System.out.println("number is : " + no + " expected result is : " + result);
		AssertJUnit.assertEquals(result, primeCheck.validate(no));
	}
}
