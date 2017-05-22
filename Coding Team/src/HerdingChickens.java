import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class HerdingChickens {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("HerdingChicksIn.txt"));
		
		List<Double> XCoords = new ArrayList<Double>();
		List<Double> YCoords = new ArrayList<Double>();
		double distance = 0;
		int input = sc.nextInt();
		double postX = sc.nextDouble();
		double postY = sc.nextDouble();
		int coords = sc.nextInt();
		double minX = postX;
		double maxX = postX;
		double maxY = postY;
		for(int i = 1; i <= coords*2; i++)
		{
			if(i%2 == 0)
			{
				double y = sc.nextDouble();
				YCoords.add(y);
				if(maxY < y)
				{
					maxY = y;
				}
			}
			else
			{
				double x = sc.nextDouble();
				XCoords.add(x);
				if(maxX < x)
				{
					maxX = x;
				}
				if(minX > x)
				{
					minX = x;
				}
			}
		}
		
		for(int i = 0; i < XCoords.size(); i++)
		{
			if(XCoords.get(i) < postX)
			{
				//code equation for line y - y1 = m (x - x1)
				//check y values to see if points are below the line
			}
		}
		List<Double> x = new ArrayList<Double>();
		List<Double> y = new ArrayList<Double>();
		x.add(postX);
		y.add(postY);
		for(int j = 0; j < XCoords.size(); j++)
		{
			if(XCoords.get(j) == minX && YCoords.get(j) < maxY)
			{
				x.add(XCoords.get(j));
				y.add(YCoords.get(j));
			}
		}
		for(int j = 0; j < XCoords.size(); j++)
		{
			if(YCoords.get(j) == maxY)
			{
				x.add(XCoords.get(j));
				y.add(YCoords.get(j));
			}
		}
		for(int j = 0; j < XCoords.size(); j++)
		{
			if(XCoords.get(j) == maxX && YCoords.get(j) < maxY)
			{
				x.add(XCoords.get(j));
				y.add(YCoords.get(j));
			}
		}
		x.add(postX);
		y.add(postY);
	//	print(x);
	//	System.out.println();
	//	print(y);
		for(int i = 1; i < x.size(); i++)
		{
			distance += distance(x.get(i-1), y.get(i-1), x.get(i), y.get(i));
		}
		System.out.println(distance);
	}
	
	private static double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
	}
	
	
	private static void print(List<Double> xCoords)
	{
		for(int i = 0; i < xCoords.size(); i++)
		{
			System.out.print(xCoords.get(i) +" ");
		}
	}
	
}
