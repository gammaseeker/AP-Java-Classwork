package lab5;

public class RectangleTest {

	public static void main(String[] args) {
		testCase1();
		testCase2();
	}
	
	public static void testCase1() {
		Rectangle r = new Rectangle(4, 40);
		r.setColor("Red");
		System.out.println("Width: " + r.getWidth());
		System.out.println("Height: " + r.getHeight());
		System.out.println("Color: " + r.getColor());
		
	}
	
	public static void testCase2() {
		Rectangle r = new Rectangle(3.5, 35.9);
		r.setColor("Red");
		System.out.println("Width: " + r.getWidth());
		System.out.println("Height: " + r.getHeight());
		System.out.println("Color: " + r.getColor());
		
	}
}
