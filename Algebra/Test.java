public class Test
{
	public static void main(String[] args)
	{
		Coords point1 = new Coords(5, 8);
		Coords point2 = new Coords();
		Coords point3 = new Coords(point1);
		Coords point4 = new Coords(10);
		Coords point5 = new Coords(1,1);
		Coords point6 = new Coords(2,2);
		Coords point7 = point1;//Creating alias. Not instantiating new object
		//How ever point7 and 1 change, they both change
		
		Coords point8 = new Coords(3,3);
		System.out.println(point1.toString());//.toString()unecessary. Polymorphism
		System.out.println(point2);
		System.out.println(point3);
		System.out.println(point4);
		System.out.println(point1.getX());
		Coords myPoint = new Coords(-2, 5);
		myPoint.setX(-10);
		//object that calls function is implicit parameter (this)
		//Normal parameter is explicit parameter referenced by local variable name
		myPoint.setX(myPoint.getX() - 5);
		System.out.println(point5.distanceFromOrigin());
		System.out.println(point5.getSlopeOfLineSegment(point6));
		System.out.println(point5.slopeOfLineSegmentDefined(point6));
		System.out.println(point1.distanceFromOrigin());
		System.out.println(point5.getSlopeOfLineSegment(point6));
		System.out.println(point1.equals(point3));
		
		LinearEquation myEq = new LinearEquation(5, 15, 10);
		LinearEquation myEq2 = new LinearEquation(5, 10, 10);
		LinearEquation myEq3 = new LinearEquation(3, point8);
	
		/*System.out.println(myEq.slope());
		System.out.println(point1.toString());*/
		System.out.println(myEq.pointOfIntersection(myEq2));
		System.out.println(myEq.hasXIntercept());
		Coords testCoord = new Coords(-2, 2);
		System.out.println(myEq3.shortestDistanceFrom(testCoord));
	}
}