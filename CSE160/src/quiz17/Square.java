package quiz17;

public class Square extends GeometricObject implements Colorable {
	private double side;
	@Override
	public void howToColor() {
		// TODO Auto-generated method stub
		System.out.println("Color all four sides");
	}
	
	public Square(double side) {
		this.side = side;
	}

	public double getArea() {
		return side * side;
	}
	
	public double getPerimeter() {
		return 4 * side;
	}

}
