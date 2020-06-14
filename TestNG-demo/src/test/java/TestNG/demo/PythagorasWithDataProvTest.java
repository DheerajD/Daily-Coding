package TestNG.demo;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PythagorasWithDataProvTest {
	
	@DataProvider(name = "test1")
	public static PythagorasTriplet[] getTriplets() {
		PythagorasTriplet pt = new PythagorasTriplet(3,4,5);
		PythagorasTriplet pt2 = new PythagorasTriplet(5,12,13);
		return new PythagorasTriplet[] {pt, pt2};
	}
	
	@Test(dataProvider = "test1")
	public void testPT(PythagorasTriplet pt) {
	      System.out.println(pt.getX() + ", " + pt.getY() + " = " + pt.getZ());
	      int x = pt.getX();
	      int y = pt.getY();
	      int z = pt.getZ();
		  AssertJUnit.assertEquals(true, PythagorasTriplet.checkPythagorasPair(x,y,z));
	}
	

}
