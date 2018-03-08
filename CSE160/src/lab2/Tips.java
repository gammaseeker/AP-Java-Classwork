package lab2;

import java.util.*;

public class Tips {

	public static void main(String[] args) {
		System.out.println("This program calculates a tip in a restaurant");
		double total = 0, subtotal, tip;
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter subtotal: ");
		subtotal = input.nextDouble();
		
		if(subtotal < 30)
			tip = 5;
		else
			tip = 0.15 * subtotal;
		
		total = Math.round((subtotal + tip)*100)/100.0;
		System.out.println("The gratuity is $"+tip +" and the total is $"+ total);
		input.close();
	}
}
