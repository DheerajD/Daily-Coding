package TestNG.demo;

public class PrimeNumberCheck {
	public boolean validate(final int no) {
		for (int i = 2; i < (no / 2); i++) {
	         if (no % i == 0) {
	            return false;
	         }
	      }
	      return true;
	}
}
