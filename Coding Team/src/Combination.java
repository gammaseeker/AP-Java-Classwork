import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Combination {
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("CombinationIn.txt");
		Scanner sc = new Scanner(file);
		int inputs = sc.nextInt();
		
		for(int i = 0; i <= 12; i++)
		{
			System.out.println(sc.nextInt());
		}
	/*	for(int i  = 1; i <= 1; i++)
		{
			int n = sc.nextInt();
			int[][] matrix = new int[n+2][n+2];
			matrix[0][0] = 0;
			matrix[0][matrix[0].length-1] = 0;
			matrix[matrix.length-1][0] = 0;
			matrix[matrix.length-1][matrix[0].length - 1] = 0;
			for(int j = 1; j < n; j++)
			{
				matrix[0][j] = sc.nextInt();
			}
			for(int j = 1; j < n; j++)
			{
				matrix[0][j] = sc.nextInt();
			}
			for(int j = 1; j < n; j++)
			{
				matrix[j][0] = sc.nextInt();
			}
			for(int j = 1; j < n; j++)
			{
				matrix[j][matrix[0].length-1] = sc.nextInt();
			}
			popTop(n, matrix, sc);
			popBot(n, matrix, sc);
			popLeft(n, matrix, sc);
			popRight(n, matrix, sc);
			printArr(matrix);
		}*/
	}
	
	public static boolean isCorner(int[][] arr)
	{
		return false;
	}
	
	public static void popTop(int n, int[][] matrix, Scanner sc)
	{
		for(int j = 1; j < n; j++)
		{
			matrix[0][j] = sc.nextInt();
		}
	}
	
	public static void popBot(int n, int[][] matrix, Scanner sc)
	{
		for(int j = 1; j < n; j++)
		{
			matrix[matrix.length-1][j] = sc.nextInt();
		}
	}
	
	public static void popLeft(int n, int[][] matrix, Scanner sc)
	{
		for(int j = 1; j < n; j++)
		{
			matrix[j][0] = sc.nextInt();
		}
	}
	
	public static void popRight(int n, int[][] matrix, Scanner sc)
	{
		for(int j = 1; j < n; j++)
		{
			matrix[j][matrix[0].length-1] = sc.nextInt();
		}
	}
	
	public static void printArr(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0 ; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
}
