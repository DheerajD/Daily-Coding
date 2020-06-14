package TestNG.demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;


public class TestNGSimpleTest {
	
	@Test
	public void test1() {
		String s1 = "TestNG working fine";
		assertEquals("TestNG working fine", s1);
	}

}
