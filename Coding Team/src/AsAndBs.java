import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class AsAndBs {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("AsAndBsIn.txt"));
		int input = sc.nextInt();
		for(int i = 0; i <= input; i++)
		{
			System.out.println(replace(sc.nextLine()));
		}
		sc.close();
	}
	
	private static String replace(String str)
	{
		while(str.contains("AA") || str.contains("BB"))
		{
			str = str.replace("BB", "A");
			str = str.replace("AA", "B");
			
		}
		return str;
	}
	
}
