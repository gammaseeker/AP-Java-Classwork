import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class FishingIn {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("FishingIn.txt"));
		int weight = sc.nextInt();
		double qty = sc.nextDouble();
		System.out.println("Total weight of the catch = " + (double)weight*qty + " pounds. Pounds of fish delivered = " + ((double)weight*qty)/2);
		sc.close();
	}
}
