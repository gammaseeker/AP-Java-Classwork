public class Circle extends Shapes
{
	private final double radius;
	private final double PI = Math.PI;
	
	public Circle()
	{
        this(1);
    }   
    public Circle(double radius) 
    {
    	super("Circle");
        this.radius = radius;
    }
    public double area() 
    {
        // A = p r^2
        if(isValid())
        	return PI * Math.pow(radius, 2);
        else
        	return -999;
    }
    public double perimeter() 
    {
        // P = 2pr
     	if(isValid())
       	 	return 2 * PI * radius;
   		 else
    		return -999;
    }
    public boolean isValid()
    {
    	return radius > 0;
    }
}