import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class HerdingChickens2 {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("HerdingChicksIn.txt"));
		double distance = 0;
		int input = sc.nextInt();
		List<Double> xCoords = new ArrayList<Double>();
		List<Double> yCoords = new ArrayList<Double>();
		boolean stop = false;
		double locX = sc.nextDouble();
		double locY = sc.nextDouble();
		xCoords.add(locX);
		yCoords.add(locY);
		int coords = sc.nextInt();
		for(int i = 1; i <=coords*2; i++)
		{
			if(i%2 == 0)
			{
				yCoords.add(sc.nextDouble());
			}
			else
			{
				xCoords.add(sc.nextDouble());
			}
		}
		print(xCoords);
		System.out.println();
		print(yCoords);
		
		
	}
	
	private static double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
	}
	
	private static double calcSlope(double x1, double y1, double x2, double y2)
	{
		return 0.0;
	}
	
	private static double line(double x1, double y1, double x2, double y2, double x3)
	{
		return calcSlope(x1, y1, x2, y2)*(x3 - x2) + y2;
	}
	
	private static String checkQuad(double x1, double y1, double x2, double y2)
	{
		if(x1 >= 0 && y1 >= 0 && x2 >= 0 && y2 >= 0)
		{
			return "Q1";
		}
		if(x1 <= 0 && y1 >= 0 && x2 <= 0 && y2 >= 0)
		{
			return "Q2";
		}
		if(x1 <= 0 && y1 <= 0 && x2 <= 0 && y2 <= 0)
		{
			return "Q3";
		}
		if(x1 >= 0 && y1 <= 0 && x2 >= 0 && y2 <= 0)
		{
			return "Q4";
		}
		return null;
	}
	
	private static void checkLeft(List<Double> xCoords, List<Double> yCoords, double x1, double y1)
	{
		double xMin = x1;
		for(int i = 0; i < xCoords.size(); i++)
		{
			if(xCoords.get(i) <= x1)
			{
				xMin = xCoords.get(i);
				if(xCoords.get(i) - x1 == 0 && xMin == x1)
				{
					
				}
				else
				{
					for(int j= 0 ; j < xCoords.size(); j++)
					{
						if(xCoords.get(j) <= x1)
						{
							double y = line(x1, y1, xCoords.get(i).doubleValue(), yCoords.get(i).doubleValue(), xCoords.get(j));
							if(yCoords.get(j) < y)
							{
								
							}
						}
						
					}
					
				}
			}
		}
	}
	private static void checkRight()
	{
		
	}
	private static void print(List<Double> xCoords)
	{
		for(int i = 0; i < xCoords.size(); i++)
		{
			System.out.print(xCoords.get(i) +" ");
		}
	}
}
