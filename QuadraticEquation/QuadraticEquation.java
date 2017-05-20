public class QuadraticEquation
{
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public QuadraticEquation(QuadraticEquation other)
	{
		this.a = other.a;
		this.b = other.b;
		this.c = other.c;
	}
	public String toString()
	{
		return "y = " + a + "x^2 + " + b + "x + " + "c";
	}
	public double getA()
	{
		return this.a;
	}
	public double getB()
	{
		return this.b;
	}
	public double getC()
	{
		return this.c;
	}
	public double[] getRoot()
	{
		double[] rootArr = new[2];
		return rootArr;
	}
}