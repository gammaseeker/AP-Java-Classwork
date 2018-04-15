package hw4;

public class Square extends GeometricObject implements Colorable {
	double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public void howToColor() {
		System.out.print("Color all four sides");

	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter() {
		return 4*side;
	}

	public static void main(String[] args) {
	    GeometricObject[] geos = 
			new GeometricObject[5];
	    for(int i=0; i<geos.length;i++)  
			geos[i] = new Square(2);
	    for(GeometricObject v:geos) 
	          if(v instanceof Colorable) 
				((Colorable)v).howToColor();
	  }

}
