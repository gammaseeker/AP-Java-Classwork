import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class MisterChips {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("MisterChipsIn.txt"));
		int patrons = sc.nextInt();
		double ones = 0;
		double fives = 0;
		double tens = 0;
		double hundred = 0;
		
		for(int i = 1; i <= patrons; i++)
		{
			double sum = 0;
			ones = sc.nextInt() * 1.02;
			fives = sc.nextInt() * 5 * 1.01;
			tens = sc.nextInt() * 10 * 1.0022;
			hundred = sc.nextInt() * 100 * 1.00112;
			sum = ones + fives + tens + hundred;
			System.out.println(sum);
		}
		sc.close();
		
	}
}
