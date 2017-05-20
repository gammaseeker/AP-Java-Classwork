public class Triangle extends Shapes
{
	private final double  a;
	private final double  b;
	private final double  c;
	
	public Triangle() 
	{
        this(1,1,1);
    }
    public Triangle(double a, double b, double c) 
    {
    	super("Triangle");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() 
    {
        // Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c)) 
        // where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle 
        //double s = (a + b + c) / 2;
        if(isValid())
        {
        
        	double s = semiperimeter();
        	return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        else
        {
        	return -999;
        }
    }

    public double perimeter() 
    {
        // P = a + b + c
        if(isValid())
        	return a + b + c;
        else
        	return -999;
    }
    
    public boolean isValid()
    {
    	if(a+b > c && b+c > a && a+c > b && a > 0 && b > 0 && c > 0)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    public boolean isRightTriangle()
    {
    	if(isValid())
    	{
    		if(a > b && a > c)
    		{
    			return Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2);
    		}
    		else
    		{
	    		if(b > a && b > c)
	    		{
	    			return Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2);
	    		}
	    		else
	    		{
	    			if(c > a && c > b)
    				{
    					return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    				}
	    		}	
    		}
    		
    		
    	}
    	return false;
    }
}