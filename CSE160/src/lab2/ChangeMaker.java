package lab2;

import java.util.*;

public class ChangeMaker {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int price;
		int provided;
		int change;
		
		System.out.print("Enter the purchase price:");
		price = (int) Math.round(keyboard.nextDouble() * 100);
		System.out.print("Enter the amount given by the customer:");
		provided = (int) Math.round(keyboard.nextDouble() * 100);
		
		if (provided > price) {
			
			change = provided - price;
			System.out.println("Computed change: $" + change/100.0);
			System.out.println("The customer should be given the change as follows:"); 
			int twenties = change / 2000;
			if (twenties > 0) {  
				change = change % 2000;
				System.out.println(twenties + " $20 bill(s)");
			}
			int tens = change / 1000;
			if (tens > 0) {
				change = change % 1000;
				System.out.println(tens + " $10 bill(s)");
			}
			int fives = change / 500;
			if (fives > 0) {
				change = change % 500;
				System.out.println(fives + " $5 bill(S)");
			}
			int ones = change / 100;
			if (ones > 0) {
				change = change % 100;
				System.out.println(ones + " $1 bill(s)");
			}
			int quarters = change / 25;
			if (quarters > 0) {
				change = change % 25;
				System.out.println(quarters + " quarter coin(s)");
			}
			int dimes = change / 10;
			if (dimes > 0) {
				change = change % 10;
				System.out.println(dimes + " dime coin(s)");
			}
			int nickels = change / 5;
			if (nickels > 0) {
				change = change % 5;
				System.out.println(nickels + " nickel coin(s)");
			}
			int pennies = change;
			System.out.println(pennies + " penny coin(s)");
		}
		if (provided < price) {
			System.out.print("Not enough money!");
		}
		else if (provided == price) {
			System.out.print("No change is necessary!");
		}
	}
	
}
