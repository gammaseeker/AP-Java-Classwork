import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Whoops {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("WhoopsIn.txt"));
		int input = sc.nextInt();
		System.out.println(sc.nextLine().equals(""));
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		for(int i = 1; i<= input; i++)
		{
			int lineCtr = 0;
			while(!sc.nextLine().equals("") )
			{
				break;
			}
		}
	}
}
