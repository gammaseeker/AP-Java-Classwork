import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class BinaryUniversity {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("BinaryUIn.txt"));
		
		ArrayList<Integer> tracker = new ArrayList<Integer>();
		ArrayList<Integer> sums = new ArrayList<Integer>();
	    ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();

		int input = sc.nextInt();
		System.out.println(input);
		for(int z = 0; z < input; z++)
		{
			
		}
		int numRows = sc.nextInt();
		int[][] courses = new int[numRows][3];
		
		for(int r = 0; r < numRows; r++)//populate matrix
		{
			for(int c = 0; c < 3; c++)
			{
				courses[r][c] = sc.nextInt();
			//	System.out.print(courses[r][c] +" ");
			}
		//	System.out.println();
		}
		
		for(int r = numRows - 1; r >= 0; r--)
		{
			
				if(courses[r][1] == 0 && courses[r][2] == 0)
				{
					
					//tracker.add(0, courses[r][0]);
					//System.out.println(courses[r][0] + " TEST");
					//System.out.println(process(r, courses[r][0], courses, tracker) + " LINE");
					process(r, courses[r][0], courses, tracker);
					paths.add(tracker);
					
				}
			
			
		}
		
		for(int i = 0; i < paths.size(); i++)//Code is wrong
		{
			//print(paths.get(i));
			//System.out.println();;
			sums = calcSum(paths.get(i));
			//System.out.println(sum);
			
		}
		int maxSum = 0;//Code is wrong
	
		for(int i = 0; i < sums.size(); i++)
		{
			if(sums.get(i) > maxSum)
			{
				maxSum = sums.get(i);
		
			}
		}
		System.out.println(maxSum);
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int sum = paths.get(0).get(0);
		temp.add(paths.get(0).get(0));
		for(int i = 1; i < paths.get(0).size(); i++)
		{
			if(sum == maxSum)
			{
				print(temp);
				break;
			}
			else
			{
				if(paths.get(0).get(i) == paths.get(0).get(0))
				{
					sum = 0;
					for(int j = temp.size()-1; j >= 0; j--)
					{
						temp.remove(j);
					}
				}
				else
				{
					sum += paths.get(0).get(i);
					temp.add(paths.get(0).get(i));
				}
				
			}
		}
		System.out.println(sc.nextInt());//Code is wrong
	}
	
	private static int process(int r, int num, int[][] matrix, ArrayList<Integer> tracker)
	{
		tracker.add(0, matrix[r][0]);
		if(r == 0)
		{
			return matrix[0][0];
		}
		else
		{
			return search(num, matrix, tracker);
		}
		
		
	}
	
	private static int search(int num, int[][] matrix, ArrayList<Integer> tracker)
	{
		for(int r = 0; r < matrix.length; r++)
		{
			if(matrix[r][1] == num)
			{
				return process(r, matrix[r][0], matrix, tracker);
			}
			if(num == matrix[r][2])
			{
				return process(r, matrix[r][0], matrix, tracker);
			}
		}
		return 0;
	}
	
	private static ArrayList<Integer> calcSum(ArrayList<Integer> list)
	{
		ArrayList<Integer> output = new ArrayList<Integer>();
		int sum = 0;
		int start = list.get(0);
		sum += start;
		for(int i = 1; i < list.size(); i++)
		{
			if(list.get(i) == start)
			{
				output.add(sum);
				sum = 0;
			}
			else
			{
				sum += list.get(i);
			}
			
		}
		return output;
	}
	
	private static void print(ArrayList<Integer> list)
	{
		for(int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) +" ");
		}
	}
}
