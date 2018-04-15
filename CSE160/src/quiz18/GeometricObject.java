package quiz18;
public abstract class GeometricObject implements Comparable, Cloneable{
	public int compareTo(Object o2) {
		double area1 = this.getArea();
		double area2 = ((GeometricObject)o2).getArea();
		if (area1 < area2)
			return -1;
		else if (area1 == area2)
			return 0;
		else
			return 1;
	}
	
	public Object clone() throws CloneNotSupportedException{
		GeometricObject copy = (GeometricObject)(super.clone()); 
		copy.color = new String(color);
		return copy;
	}
	
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		if(o1.compareTo(o2)>0)
			return o1;
		return o2;
	}
	
	public static GeometricObject max(GeometricObject[] array) {
		GeometricObject currentMax = array[0];
		for(GeometricObject temp:array)
			currentMax = max(currentMax,temp);
		return currentMax;
	}
	
	public static void main(String[] args) {
		GeometricObject[] go = new GeometricObject[20];
		go[0] = new Rectangle(1,2);
		go[10] = new Circle(1);
		try{
			for(int i=1; i<10;i++)
				go[i] = (GeometricObject)(go[0].clone());
			for(int i=11; i<20;i++)
				go[i] = (GeometricObject)(go[10].clone());
			System.out.println("Max is: "+max(go));
		}catch(Exception e){
			e.printStackTrace();
		}
	}  

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	/** Construct a default geometric object */
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	/** Abstract method getArea */
	public abstract double getArea();
	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
	
	}
	
	class Circle extends GeometricObject {
		private double radius;
		public Circle() {
		}
		public Circle(double radius) {
			this.radius = radius;
		}
		public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius = radius;
		}
		public double getArea() {
			return radius * radius * Math.PI;
		}
		public double getDiameter() {
			return 2 * radius;
		}
		public double getPerimeter() {
			return 2 * radius * Math.PI;
		}
		public void printCircle() {
			System.out.println("The circle is created " + getDateCreated() +
					" and the radius is " + radius);
		}
	}
	class Rectangle extends GeometricObject {
	private double width;
	private double height;
	public Rectangle() {
	}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return 2 * (width + height);
	}
}

