import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Raise {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("RaiseIn.txt"));
		int emp = sc.nextInt();
		String[] choice = {"$1.00", "5%"};
		for(int i = 1; i<= emp; i++)
		{
			double pay = sc.nextDouble();
			double calc1 = pay  * 1.05;
			double calc2 = pay + 1;
			if(calc1 > calc2)
			{
				System.out.println(choice[1] + " $" + calc1);
			}
			if(calc1 < calc2)
			{
				System.out.println(choice[0] + " $" + calc2);
			}
			if(calc1 == calc2)
			{
				System.out.println(choice[1] + " $" + calc1);
			}
		}
		sc.close();
	}
}
