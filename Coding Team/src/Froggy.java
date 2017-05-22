import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Froggy 
{
	public static void main (String[] args) throws FileNotFoundException
	{
		File file = new File("FroggyIn.txt");
		Scanner sc = new Scanner(file);
		//Map<String, Integer> rows = new HashMap<String, Integer>();
		//Map<String, Integer> cols = new HashMap<String, Integer>();
		Stack tracker = new Stack();
		int grids = sc.nextInt();
		int[][] pond = new int[sc.nextInt()][sc.nextInt()];
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
	
	
	
}
