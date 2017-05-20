public class LinearEquation
{
	private double a;
	private double b;
	private double c;
	public static boolean areValidParams(double a, double b)
	{
		return (a == 0 && b == 0);
	}
	public LinearEquation(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public LinearEquation(LinearEquation other)
	{
		this.a = other.a;
		this.b = other.b;
		this.c = other.c;
	}
	public LinearEquation(Coords point1, Coords point2)
	{
		this.a = point2.getY() - point1.getY();
		this.b = point2.getX() - point1.getX();
		double yInt = point1.getY() - (point1.getX() * (-a/b));
		this.c = 0 - (b * yInt);
	}
	public LinearEquation(double slope, Coords point)
	{
		this.a = 0-slope;
		this.b = 1;
		this.c = slope * point.getX() - point.getY();
	}
	public String toString()
	{
		return a + "x + " + b + "y + " + c + " = 0";
	}
	public double getA()
	{
		return a;
	}
	public double getB()
	{
		return b;
	}
	public double getC()
	{
		return c;
	}
	public boolean slopeDefined()
	{
		if(!Double.isNaN(-a/b) == false)
		{
			return true;
		}
		return false;
	}
	public boolean hasYIntercept()
	{
		return (c > 0 || c < 0);
	}
	public boolean hasXIntercept()
	{
		if(!Double.isNaN(-c/a) == false)
		{
			return true;
		}
		return false;
	}
	public double slope()
	{
		return (-a/b);
	}
	public double yIntercept()
	{
		return ((double)-c/b);
	}
	public double xIntercept()
	{
		return ((double)-c/a);
	}
	public double slopeOfPerpendicularLine()
	{
		if(isVertical())
		{
			return 0;
		}
		return (-1/slope());
		//return b/a;
	}
	public boolean isIncreasing()
	{
		return slope() > 0;
	}
	public boolean isDecreasing()
	{
		return slope() < 0;
	}
	public boolean isHorizontal()
	{
		return (slope() == 0);
	}
	public boolean isVertical()
	{
		return (slopeDefined() == true);
	}
	public boolean isAFunction()
	{
		return !isVertical();
	}
	public boolean isValidLinearEquation()
	{
		return (a != 0 || b != 0);
	}
	public boolean isDirectVariation()
	{
		return c == 0;
	}
	public boolean equals(LinearEquation other)
	{
		if(this.isHorizontal() && other.isHorizontal())
		{
			return this.yIntercept() == other.yIntercept();
		}
		if(this.isVertical() && other.isVertical())
		{
			return this.xIntercept() == other.xIntercept();
		}
		return this.yIntercept() == other.yIntercept() && this.xIntercept() == other.xIntercept();
	}
	public boolean isParallel(LinearEquation other)
	{
		if(this.equals(other))
			return false;
		if(this.isVertical() && other.isVertical())
			return true;
		return (this.slope() == other.slope());
	}
	public Coords pointOfIntersection(LinearEquation other)
	{
		if(this.equals(other) || this.isParallel(other))
		{
			return null;
		}
		
		double d = other.a;
		double e = other.b;
		double f = other.c;
		//special code :^)
		double x = (b*f - c*e)/(a*e - b*d);
		double y = ((0-a)/b)*x - (c/b);
		if(this.isVertical())
		{
			y = (0-d)*x/e - f/e;
		}
		return new Coords(x, y);	
	}
	public LinearEquation parallelLine(Coords point)
	{
		if(this.isVertical())
		{
			return new LinearEquation(1, 0, -point.getX());
		}
		return new LinearEquation(this.slope(), point);
	}
	public LinearEquation perpendicularLine(Coords point)
	{
		if(this.isHorizontal())
		{
			return new LinearEquation(1, 0, -point.getX());
		}
		return new LinearEquation(this.slopeOfPerpendicularLine(), point);
	}
	public double shortestDistanceFrom(Coords point)
	{
		/*LinearEquation perpLine = this.perpendicularLine(point);
		Coords intersection = pointOfIntersection(perpLine);
		return  point.distanceFrom(intersection);*/
		return  point.distanceFrom(pointOfIntersection(this.perpendicularLine(point)));
	}
}