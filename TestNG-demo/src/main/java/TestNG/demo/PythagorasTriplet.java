package TestNG.demo;

public class PythagorasTriplet {
	private int x;
	private int y;
	private int z;
	
	public PythagorasTriplet(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public static boolean checkPythagorasPair(int x, int y, int z) {
		int sum = (x*x) + (y*y);
		if((z*z) == sum)
			return true;
		return false;
	}
}
