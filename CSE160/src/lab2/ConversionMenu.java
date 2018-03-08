package lab2;
import java.util.*;

public class ConversionMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String unit1, unit2;
		double quantity;
		System.out.println("A – convert pounds to kilos\r\n" + 
				"\r\n" + 
				"B – convert kilos to pounds\r\n" + 
				"\r\n" + 
				"C – convert kilometers to miles\r\n" + 
				"\r\n" + 
				"D – convert miles to kilometers\r\n" + 
				"\r\n" + 
				"E - Exit");
		System.out.println("Enter your option: ");
		String selection = sc.next();
		switch(selection) {
			case "A": 
				unit1 = "pounds";
				unit2 = "Kilograms";
				System.out.println("Enter a quantity in " + unit1 + ": ");
				quantity = sc.nextDouble(); 
				System.out.println(unit2 + " are: " + quantity * 0.453592);
				break;
			case "B":
				unit1 = "kilos";
				unit2 = "Pounds";
				System.out.println("Enter a quantity in " + unit1 + ": ");
				quantity = sc.nextDouble(); 
				System.out.println(unit2 + " are: " + quantity * 2.20462);
				break;
			case "C":
				unit1 = "kilometers";
				unit2 = "Miles";
				System.out.println("Enter a quantity in " + unit1 + ": ");
				quantity = sc.nextDouble(); 
				System.out.println(unit2 + " are: " + quantity * 0.621371);
				break;
			case "D":
				unit1 = "miles";
				unit2 = "Kilometers";
				System.out.println("Enter a quantity in " + unit1 + ": ");
				quantity = sc.nextDouble(); 
				System.out.println(unit2 + " are: " + quantity * 1.60934);
				break;
			default:
				return;
		}
		
	}
}
