package lab5;

public class FanTest {

	public static void main(String[] args) {
		testCase1();
		testCase2();
	}
	
	public static void testCase1() {
		Fan f = new Fan();
		f.setSpeed(3);
		f.setRadius(10);
		f.setColor("Yellow");
		f.setStatus(true);
		System.out.println(f.toString());
	}
	
	public static void testCase2() {
		Fan f = new Fan();
		f.setSpeed(2);
		f.setRadius(5);
		f.setColor("Blue");
		f.setStatus(false);
		System.out.println(f.toString());
	}
}
