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
	public QuadraticEquation()
	{
		this.a = 1;
		this.b = 0;
		this.c = 0;
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
	public ComplexNumber[] getRoot()
	{
		double secondPart;
		ComplexNumber[] rootArr = new ComplexNumber[2];
		double firstPart = (0-b)/(2*a);
		if(hasRealRoots())
		{
			secondPart = Math.sqrt(getDiscriminant())/(2*a);
			double root1 = firstPart + secondPart;
			double root2 = firstPart - secondPart;
			rootArr[0] = new ComplexNumber(root1); 
			rootArr[1] = new ComplexNumber(root2);
		}
		else
		{
			secondPart = Math.sqrt(-1*getDiscriminant())/(2*a);
			rootArr[0] = new ComplexNumber(firstPart, secondPart); 
			rootArr[1] = new ComplexNumber(firstPart, (0-secondPart));
		}	
		return rootArr;
	}
	public boolean hasMaximum()
	{
		return(a > 0);
	}
	public boolean hasMinimum()
	{
		return(a < 0);
	}
	public double getDiscriminant()
	{
		return Math.pow(b, 2) - 4 * a * c;
	}
	public boolean hasRealRoots()
	{
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		return (discriminant > 0);
	}
	public double getAxisOfSymmetry()
	{
		return (0-b)/(2*a);
	}
	public Coords getVertex()
	{
		double theX = getAxisOfSymmetry();
		return new Coords(theX, a * Math.pow(theX, 2) + b * theX + c);
	}
}
