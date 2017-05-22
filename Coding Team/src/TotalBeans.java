import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class TotalBeans {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("TotalBeansIn.txt"));
		int sum = 0;
		for(int i = 1; i <= 6; i++)
		{
			sum += sc.nextInt();
		}
		System.out.print("Ryan has to plant " + sum + " beans");
		sc.close();
	}
}
