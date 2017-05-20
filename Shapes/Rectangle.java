public class Rectangle extends Shapes
{
	private final double width;
	private final double length;
	
	public Rectangle()
	{
		this(1,1);
	}
	public Rectangle(double width, double length)
	{
		super("Rectangle");
		this.width = width;
		this.length = length;
	}
	public double area()
	{
		return width * length;
	}
	public double perimeter()
	{
		return 2 * (width + length);
	}
	public boolean isValid()
	{
		return true;
	}
}