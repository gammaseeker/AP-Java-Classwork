public class Coords
{
	private double x;
	private double y;
	
	public Coords(double xValue, double yValue)
	{
		x = xValue;
		y = yValue;
	}
	public Coords(double value)
	{
		x = value;
		y = value;
	}
	public Coords()
	{
		x = 0;
		y = 0;
	}
	public Coords(Coords other)//Copy Constructor
	{
		this.x = other.x;
		this.y = other.y;
	}
	//accesses
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	/*public boolean setX(double x)
	 {
	 	Does not overload. Will not work. Changing return type does not overload.
	 	Diff # of param, Diff data type of param, Diff order of param is overload.
	 }*/
	public void setY(double y)
	{
		this.y = y;
	}
	public void reflectOnXAxis()
	{
		this.y = 0 - y;
	}
	public void reflectOnYAxis()
	{
		this.x = 0 - x;
	}
	public void reflectOnOrigin()
	{
		reflectOnXAxis();
		reflectOnYAxis();
	}
	public void translate(double horizontal, double vertical)
	{
		this.x = x + horizontal;
		this.y = y + vertical;
	}
	public void dilate(double dilationFactor)
	{
		this.x = x*dilationFactor;
		this.y = y*dilationFactor;
	}
	public double distanceFromOrigin()
	{
		return Math.sqrt(Math.pow(this.y, 2) + Math.pow(this.x, 2));
	}
	public double distanceFrom()
	{
		return distanceFromOrigin();
	}
	public double distanceFrom(Coords other)
	{
		return Math.sqrt(Math.pow(other.y - this.y, 2) + Math.pow(other.x - this.x, 2));
	}
	public double distanceFrom(double xCoord, double yCoord)
	{
		Coords other = new Coords(xCoord, yCoord);
		return distanceFrom(other);
	}
	public boolean equals(Coords otherPoint)
	{
		if(this.x == otherPoint.x && this.y == otherPoint.y)
		{
			return true;
		}
		return false;
		//return (this.x == otherPoint.x && this.y == otherPoint.y);
	}
	public double getSlopeOfLineSegment(Coords other)
	{
		if(other.x < this.x)
		{
			return (this.y - other.y)/(this.x - other.x);
		} 
		else
		{
			return (other.y - this.y)/(other.x - this.x);	
		}
	}
	public boolean slopeOfLineSegmentDefined(Coords other)
	{
		if(other.x < this.x)
		{
			if((this.x - other.x) != 0)
			{
				return true;
			}
		}
		else
		{
			if((other.x - this.x) != 0)
			{
				return true;	
			}
		}
		return false;
	}
}