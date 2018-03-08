package lab3;
import java.text.DecimalFormat;
/*
 * Write a program that displays the following table (note that 1 kilogram is approximately 2.2 pounds):
Kilograms  Pounds
 */
public class KilogramTable {

	public static void main(String[] args) {
		doubleTable();
	}
	
	public static void singleTable() {
		System.out.println("Kilograms \t Pounds");
		for(int i = 1; i <= 199; i++) {
			if(i%2 == 1)
				System.out.println(i + "\t" +  new DecimalFormat("#.##").format(2.2*i));
		}
	}
	public static void doubleTable() {
		System.out.println("Kilograms \t Pounds \t Pounds \t Kilograms");
		for(int i = 20, j = 1; i <= 515 && j <= 199; i=i+5) {	
			System.out.println(i + "\t" +  new DecimalFormat("#.##").format(2.2*i) + "\t" + i + "\t" +  new DecimalFormat("#.##").format(i/2.2));
		}
	}
}
