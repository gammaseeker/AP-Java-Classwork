import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

//COMPLETED
public class SafeRange {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("SafeRangeIn.txt"));
		
		double avg = sc.nextDouble();
		double cap = sc.nextDouble();
		double range = avg * (cap - 1);
		sc.close();
		System.out.println("MPG = " + avg + "; Fuel capacity = " + cap + "; gallons; Range = " + range);
	}
}
