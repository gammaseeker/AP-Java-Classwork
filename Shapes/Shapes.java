public abstract class Shapes //implements Comparable<Shapes>
{
	protected String name;
	
	public Shapes(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	public abstract double area();
	public abstract double perimeter();
	public abstract boolean isValid();
	public double semiperimeter()
	{
		return perimeter() / 2;
	}
	
	public String toString()
	{
		return name + ", area = " + area() + ", perimeter = " + perimeter();
	}
}