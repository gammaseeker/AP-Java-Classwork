package lab1;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("Enter a degree in Celsius: ");
		Scanner input = new Scanner(System.in);
		double celsius = input.nextDouble();
		System.out.println(celsius + " in Celsius is " + celToFar(celsius) + " in Fahrenheit");
	}
	
	public static double celToFar(double cel) {
		return (9.0/5 * cel + 32);
	}
}
