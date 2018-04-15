package hw4;

public abstract class GeometricObject implements Comparable, Cloneable{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
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
